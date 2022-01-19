#### SOAP PET SERVICE
Simple client-server communication example via SOAP protocol. Client side code for RMI is generated from WSDL schema provided by SOAP server.

#### How to run?

1. clean -> install *soap-server* maven module
2. start *soap-server* (SoapPetServiceServer main method)
3. SOAP server is running now! See localhost:8090/employeeservice?wsdl for understand and see WSDL schema.
4. clean -> install *soap-client* maven module
5. See pom file to understand how SOAP-based client-side code generation works under the hood (spoiler - SOAP WSDL schema)
6. run  SoapPetServiceClient and Enjoy SOAP protocol via JAX-WS!

