package com.sampullara.onvif;

import org.onvif.ver10.device.wsdl.Device;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.Service;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) throws MalformedURLException {
    String camIp = "192.168.2.9";

    // Start off, just loading the document with the DeviceService addition you made earlier
    URL url = new URL(new File("src/main/resources/ver10/device/wsdl/devicemgmt.wsdl").toURI().toString());
    QName qname = new QName("http://www.onvif.org/ver10/device/wsdl", "DeviceService");
    Service service = Service.create(url, qname);
    Device device = service.getPort(Device.class);

    // Now this is where the magic happens!
    ((BindingProvider)device).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY ,
        "http://"+camIp+"/onvif/device_service");

    // Test it !
    Holder<String> manufacturer = new Holder<String>();
    Holder<String> model = new Holder<String>();
    Holder<String> firmwareVersion = new Holder<String>();
    Holder<String> serialNumber = new Holder<String>();
    Holder<String> hardwareId = new Holder<String>();
    device.getDeviceInformation(manufacturer, model, firmwareVersion, serialNumber, hardwareId);
    System.out.println(manufacturer.value);
    System.out.println(model.value);
    System.out.println(firmwareVersion.value);
    System.out.println(serialNumber.value);
    System.out.println(hardwareId.value);
  }
}
