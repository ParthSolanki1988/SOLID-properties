package com.simformsolutions.DependencyInjection;

public class UDPProtocolHandler implements ProtocoleHandler{
  @Override
  public void sendMessage(String message) {
    System.out.println("UDP Message Handler => " + message);
  }
}
