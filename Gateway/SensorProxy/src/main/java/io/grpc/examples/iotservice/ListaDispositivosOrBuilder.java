// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SensorService.proto

package io.grpc.examples.iotservice;

public interface ListaDispositivosOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensor_service.ListaDispositivos)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .sensor_service.Dispositivo dispositivos = 1;</code>
   */
  java.util.List<io.grpc.examples.iotservice.Dispositivo> 
      getDispositivosList();
  /**
   * <code>repeated .sensor_service.Dispositivo dispositivos = 1;</code>
   */
  io.grpc.examples.iotservice.Dispositivo getDispositivos(int index);
  /**
   * <code>repeated .sensor_service.Dispositivo dispositivos = 1;</code>
   */
  int getDispositivosCount();
  /**
   * <code>repeated .sensor_service.Dispositivo dispositivos = 1;</code>
   */
  java.util.List<? extends io.grpc.examples.iotservice.DispositivoOrBuilder> 
      getDispositivosOrBuilderList();
  /**
   * <code>repeated .sensor_service.Dispositivo dispositivos = 1;</code>
   */
  io.grpc.examples.iotservice.DispositivoOrBuilder getDispositivosOrBuilder(
      int index);
}