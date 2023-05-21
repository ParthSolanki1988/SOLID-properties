package com.simformsolutions.DependencyInjection;

public class ProtocolHandlerFectory {

  public static ProtocoleHandler getProtocolHandler(String protocol){
    if ("TCP".equalsIgnoreCase(protocol)){
      return new TCPProtocolHandler();
    }

    if ("UDP".equalsIgnoreCase(protocol)){
      return new UDPProtocolHandler();
    }

    return null;
  }
}
