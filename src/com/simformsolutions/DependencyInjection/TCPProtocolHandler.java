package com.simformsolutions.DependencyInjection;

public class TCPProtocolHandler implements ProtocoleHandler{
  @Override
  public void sendMessage(String message) {
    System.out.println("TCP Message Handler =>  " + message);
  }
}
