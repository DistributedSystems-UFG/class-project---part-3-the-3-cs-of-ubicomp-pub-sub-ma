// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SensorService.proto

package io.grpc.examples.iotservice;

public interface ListaDadosOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensor_service.ListaDados)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .sensor_service.Dado dados = 1;</code>
   */
  java.util.List<io.grpc.examples.iotservice.Dado> 
      getDadosList();
  /**
   * <code>repeated .sensor_service.Dado dados = 1;</code>
   */
  io.grpc.examples.iotservice.Dado getDados(int index);
  /**
   * <code>repeated .sensor_service.Dado dados = 1;</code>
   */
  int getDadosCount();
  /**
   * <code>repeated .sensor_service.Dado dados = 1;</code>
   */
  java.util.List<? extends io.grpc.examples.iotservice.DadoOrBuilder> 
      getDadosOrBuilderList();
  /**
   * <code>repeated .sensor_service.Dado dados = 1;</code>
   */
  io.grpc.examples.iotservice.DadoOrBuilder getDadosOrBuilder(
      int index);
}
