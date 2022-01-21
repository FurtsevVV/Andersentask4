
package com.zakat.teamclient.generated;

import jakarta.xml.ws.*;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;



/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UserServiceImplService", targetNamespace = "http://service.teamservice.zakat.com/", wsdlLocation = "http://localhost:8090/teamservice/user/?wsdl")
public class UserServiceImplService
    extends Service
{

    private final static URL USERSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName USERSERVICEIMPLSERVICE_QNAME = new QName("http://service.teamservice.zakat.com/", "UserServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8090/teamservice/user/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        USERSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public UserServiceImplService() {
        super(__getWsdlLocation(), USERSERVICEIMPLSERVICE_QNAME);
    }

    public UserServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERSERVICEIMPLSERVICE_QNAME, features);
    }

    public UserServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, USERSERVICEIMPLSERVICE_QNAME);
    }

    public UserServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERSERVICEIMPLSERVICE_QNAME, features);
    }

    public UserServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserService
     */
    @WebEndpoint(name = "UserServiceImplPort")
    public UserService getUserServiceImplPort() {
        return super.getPort(new QName("http://service.teamservice.zakat.com/", "UserServiceImplPort"), UserService.class);
    }

    /**
     * 
     * @param features
     *     A list of to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserService
     */
    @WebEndpoint(name = "UserServiceImplPort")
    public UserService getUserServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.teamservice.zakat.com/", "UserServiceImplPort"), UserService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw USERSERVICEIMPLSERVICE_EXCEPTION;
        }
        return USERSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
