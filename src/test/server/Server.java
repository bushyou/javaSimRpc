package test.server;

import javaRpc.RpcFramework;

import test.HelloService;
import test.impl.HelloServiceImpl;

public class Server {
	 public static void main(String []args) throws Exception {  
	        HelloService service = new HelloServiceImpl();  
	        RpcFramework.export(service, 1234);   
	    }  
}
