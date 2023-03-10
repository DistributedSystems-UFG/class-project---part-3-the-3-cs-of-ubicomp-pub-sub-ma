// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SensorService.proto

package io.grpc.examples.iotservice;

public final class IoTServiceProto {
  private IoTServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_service_Dispositivo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_service_Dispositivo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_service_ListaDispositivos_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_service_ListaDispositivos_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_service_Parametros_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_service_Parametros_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_service_Dado_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_service_Dado_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_service_ListaDados_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_service_ListaDados_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_service_LedStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_service_LedStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_service_ListaLedStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_service_ListaLedStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_service_EmptyMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_service_EmptyMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_service_ParamLogin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_service_ParamLogin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_service_Sessao_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_service_Sessao_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023SensorService.proto\022\016sensor_service\"T\n" +
      "\013Dispositivo\022\027\n\017nomeDispositivo\030\001 \001(\t\022\023\n" +
      "\013localizacao\030\002 \001(\t\022\027\n\017tipoDispositivo\030\003 " +
      "\001(\r\"F\n\021ListaDispositivos\0221\n\014dispositivos" +
      "\030\001 \003(\0132\033.sensor_service.Dispositivo\"o\n\nP" +
      "arametros\022\023\n\013localizacao\030\001 \001(\t\022\021\n\004data\030\002" +
      " \001(\tH\000\210\001\001\022\034\n\017nomeDispositivo\030\003 \001(\tH\001\210\001\001B" +
      "\007\n\005_dataB\022\n\020_nomeDispositivo\"v\n\004Dado\022\n\n\002" +
      "id\030\001 \001(\r\022\014\n\004data\030\002 \001(\t\022\023\n\013localizacao\030\003 " +
      "\001(\t\022\027\n\017nomeDispositivo\030\004 \001(\t\022\027\n\017tipoDisp" +
      "ositivo\030\005 \001(\r\022\r\n\005valor\030\006 \001(\002\"1\n\nListaDad" +
      "os\022#\n\005dados\030\001 \003(\0132\024.sensor_service.Dado\"" +
      "r\n\tLedStatus\022\023\n\006estado\030\001 \001(\rH\000\210\001\001\022\034\n\017nom" +
      "eDispositivo\030\002 \001(\tH\001\210\001\001\022\023\n\013localizacao\030\003" +
      " \001(\tB\t\n\007_estadoB\022\n\020_nomeDispositivo\";\n\016L" +
      "istaLedStatus\022)\n\006status\030\001 \003(\0132\031.sensor_s" +
      "ervice.LedStatus\"\016\n\014EmptyMessage\",\n\nPara" +
      "mLogin\022\017\n\007usuario\030\001 \001(\t\022\r\n\005senha\030\002 \001(\t\"G" +
      "\n\006Sessao\022\r\n\005token\030\001 \001(\t\022\033\n\016funcionalidad" +
      "e\030\002 \001(\tH\000\210\001\001B\021\n\017_funcionalidade2\271\004\n\rSens" +
      "orService\022W\n\022ListarDispositivos\022\034.sensor" +
      "_service.EmptyMessage\032!.sensor_service.L" +
      "istaDispositivos\"\000\022R\n\026ListarLeiturasSens" +
      "ores\022\032.sensor_service.Parametros\032\032.senso" +
      "r_service.ListaDados\"\000\022R\n\034ConsultarUltim" +
      "aLeituraSensor\022\032.sensor_service.Parametr" +
      "os\032\024.sensor_service.Dado\"\000\022D\n\nAcionarLed" +
      "\022\031.sensor_service.LedStatus\032\031.sensor_ser" +
      "vice.LedStatus\"\000\022I\n\nListarLeds\022\031.sensor_" +
      "service.LedStatus\032\036.sensor_service.Lista" +
      "LedStatus\"\000\022I\n\021AutenticarUsuario\022\032.senso" +
      "r_service.ParamLogin\032\026.sensor_service.Se" +
      "ssao\"\000\022K\n\027ConsultarFuncionalidade\022\026.sens" +
      "or_service.Sessao\032\026.sensor_service.Sessa" +
      "o\"\000B7\n\033io.grpc.examples.iotserviceB\017IoTS" +
      "erviceProtoP\001\242\002\004TEMPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_sensor_service_Dispositivo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sensor_service_Dispositivo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_service_Dispositivo_descriptor,
        new java.lang.String[] { "NomeDispositivo", "Localizacao", "TipoDispositivo", });
    internal_static_sensor_service_ListaDispositivos_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sensor_service_ListaDispositivos_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_service_ListaDispositivos_descriptor,
        new java.lang.String[] { "Dispositivos", });
    internal_static_sensor_service_Parametros_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sensor_service_Parametros_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_service_Parametros_descriptor,
        new java.lang.String[] { "Localizacao", "Data", "NomeDispositivo", "Data", "NomeDispositivo", });
    internal_static_sensor_service_Dado_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sensor_service_Dado_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_service_Dado_descriptor,
        new java.lang.String[] { "Id", "Data", "Localizacao", "NomeDispositivo", "TipoDispositivo", "Valor", });
    internal_static_sensor_service_ListaDados_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_sensor_service_ListaDados_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_service_ListaDados_descriptor,
        new java.lang.String[] { "Dados", });
    internal_static_sensor_service_LedStatus_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_sensor_service_LedStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_service_LedStatus_descriptor,
        new java.lang.String[] { "Estado", "NomeDispositivo", "Localizacao", "Estado", "NomeDispositivo", });
    internal_static_sensor_service_ListaLedStatus_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_sensor_service_ListaLedStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_service_ListaLedStatus_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_sensor_service_EmptyMessage_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_sensor_service_EmptyMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_service_EmptyMessage_descriptor,
        new java.lang.String[] { });
    internal_static_sensor_service_ParamLogin_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_sensor_service_ParamLogin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_service_ParamLogin_descriptor,
        new java.lang.String[] { "Usuario", "Senha", });
    internal_static_sensor_service_Sessao_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_sensor_service_Sessao_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_service_Sessao_descriptor,
        new java.lang.String[] { "Token", "Funcionalidade", "Funcionalidade", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
