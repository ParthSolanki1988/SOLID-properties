package com.simformsolutions.DependencyInjection;

//Application layer - High level layer
public class Messager {
  ProtocoleHandler handler;

  Messager(String protocol){
    handler = ProtocolHandlerFectory.getProtocolHandler(protocol);
  }

  public void send(String to , String message){
    handler.sendMessage("Message to : " + to + " , message : " + message);
  }


  public static void main(String[] args) {
    Messager messager = new Messager("UDP");
    messager.send("a" , "SOLID Properties");

  }
}
