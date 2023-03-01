package io.grpc.examples.iotservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: SensorService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SensorServiceGrpc {

  private SensorServiceGrpc() {}

  public static final String SERVICE_NAME = "sensor_service.SensorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.iotservice.EmptyMessage,
      io.grpc.examples.iotservice.ListaDispositivos> getListarDispositivosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListarDispositivos",
      requestType = io.grpc.examples.iotservice.EmptyMessage.class,
      responseType = io.grpc.examples.iotservice.ListaDispositivos.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.iotservice.EmptyMessage,
      io.grpc.examples.iotservice.ListaDispositivos> getListarDispositivosMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.iotservice.EmptyMessage, io.grpc.examples.iotservice.ListaDispositivos> getListarDispositivosMethod;
    if ((getListarDispositivosMethod = SensorServiceGrpc.getListarDispositivosMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getListarDispositivosMethod = SensorServiceGrpc.getListarDispositivosMethod) == null) {
          SensorServiceGrpc.getListarDispositivosMethod = getListarDispositivosMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.iotservice.EmptyMessage, io.grpc.examples.iotservice.ListaDispositivos>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListarDispositivos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.iotservice.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.iotservice.ListaDispositivos.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("ListarDispositivos"))
              .build();
        }
      }
    }
    return getListarDispositivosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.iotservice.Parametros,
      io.grpc.examples.iotservice.ListaDados> getListarLeiturasSensoresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListarLeiturasSensores",
      requestType = io.grpc.examples.iotservice.Parametros.class,
      responseType = io.grpc.examples.iotservice.ListaDados.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.iotservice.Parametros,
      io.grpc.examples.iotservice.ListaDados> getListarLeiturasSensoresMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.iotservice.Parametros, io.grpc.examples.iotservice.ListaDados> getListarLeiturasSensoresMethod;
    if ((getListarLeiturasSensoresMethod = SensorServiceGrpc.getListarLeiturasSensoresMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getListarLeiturasSensoresMethod = SensorServiceGrpc.getListarLeiturasSensoresMethod) == null) {
          SensorServiceGrpc.getListarLeiturasSensoresMethod = getListarLeiturasSensoresMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.iotservice.Parametros, io.grpc.examples.iotservice.ListaDados>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListarLeiturasSensores"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.iotservice.Parametros.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.iotservice.ListaDados.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("ListarLeiturasSensores"))
              .build();
        }
      }
    }
    return getListarLeiturasSensoresMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.iotservice.Parametros,
      io.grpc.examples.iotservice.Dado> getConsultarUltimaLeituraSensorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConsultarUltimaLeituraSensor",
      requestType = io.grpc.examples.iotservice.Parametros.class,
      responseType = io.grpc.examples.iotservice.Dado.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.iotservice.Parametros,
      io.grpc.examples.iotservice.Dado> getConsultarUltimaLeituraSensorMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.iotservice.Parametros, io.grpc.examples.iotservice.Dado> getConsultarUltimaLeituraSensorMethod;
    if ((getConsultarUltimaLeituraSensorMethod = SensorServiceGrpc.getConsultarUltimaLeituraSensorMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getConsultarUltimaLeituraSensorMethod = SensorServiceGrpc.getConsultarUltimaLeituraSensorMethod) == null) {
          SensorServiceGrpc.getConsultarUltimaLeituraSensorMethod = getConsultarUltimaLeituraSensorMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.iotservice.Parametros, io.grpc.examples.iotservice.Dado>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConsultarUltimaLeituraSensor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.iotservice.Parametros.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.iotservice.Dado.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("ConsultarUltimaLeituraSensor"))
              .build();
        }
      }
    }
    return getConsultarUltimaLeituraSensorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.iotservice.LedStatus,
      io.grpc.examples.iotservice.LedStatus> getAcionarLedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcionarLed",
      requestType = io.grpc.examples.iotservice.LedStatus.class,
      responseType = io.grpc.examples.iotservice.LedStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.iotservice.LedStatus,
      io.grpc.examples.iotservice.LedStatus> getAcionarLedMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.iotservice.LedStatus, io.grpc.examples.iotservice.LedStatus> getAcionarLedMethod;
    if ((getAcionarLedMethod = SensorServiceGrpc.getAcionarLedMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getAcionarLedMethod = SensorServiceGrpc.getAcionarLedMethod) == null) {
          SensorServiceGrpc.getAcionarLedMethod = getAcionarLedMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.iotservice.LedStatus, io.grpc.examples.iotservice.LedStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcionarLed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.iotservice.LedStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.iotservice.LedStatus.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("AcionarLed"))
              .build();
        }
      }
    }
    return getAcionarLedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.iotservice.LedStatus,
      io.grpc.examples.iotservice.ListaLedStatus> getListarLedsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListarLeds",
      requestType = io.grpc.examples.iotservice.LedStatus.class,
      responseType = io.grpc.examples.iotservice.ListaLedStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.iotservice.LedStatus,
      io.grpc.examples.iotservice.ListaLedStatus> getListarLedsMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.iotservice.LedStatus, io.grpc.examples.iotservice.ListaLedStatus> getListarLedsMethod;
    if ((getListarLedsMethod = SensorServiceGrpc.getListarLedsMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getListarLedsMethod = SensorServiceGrpc.getListarLedsMethod) == null) {
          SensorServiceGrpc.getListarLedsMethod = getListarLedsMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.iotservice.LedStatus, io.grpc.examples.iotservice.ListaLedStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListarLeds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.iotservice.LedStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.iotservice.ListaLedStatus.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("ListarLeds"))
              .build();
        }
      }
    }
    return getListarLedsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.iotservice.ParamLogin,
      io.grpc.examples.iotservice.Sessao> getAutenticarUsuarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AutenticarUsuario",
      requestType = io.grpc.examples.iotservice.ParamLogin.class,
      responseType = io.grpc.examples.iotservice.Sessao.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.iotservice.ParamLogin,
      io.grpc.examples.iotservice.Sessao> getAutenticarUsuarioMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.iotservice.ParamLogin, io.grpc.examples.iotservice.Sessao> getAutenticarUsuarioMethod;
    if ((getAutenticarUsuarioMethod = SensorServiceGrpc.getAutenticarUsuarioMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getAutenticarUsuarioMethod = SensorServiceGrpc.getAutenticarUsuarioMethod) == null) {
          SensorServiceGrpc.getAutenticarUsuarioMethod = getAutenticarUsuarioMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.iotservice.ParamLogin, io.grpc.examples.iotservice.Sessao>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AutenticarUsuario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.iotservice.ParamLogin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.iotservice.Sessao.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("AutenticarUsuario"))
              .build();
        }
      }
    }
    return getAutenticarUsuarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.iotservice.Sessao,
      io.grpc.examples.iotservice.Sessao> getConsultarFuncionalidadeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConsultarFuncionalidade",
      requestType = io.grpc.examples.iotservice.Sessao.class,
      responseType = io.grpc.examples.iotservice.Sessao.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.iotservice.Sessao,
      io.grpc.examples.iotservice.Sessao> getConsultarFuncionalidadeMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.iotservice.Sessao, io.grpc.examples.iotservice.Sessao> getConsultarFuncionalidadeMethod;
    if ((getConsultarFuncionalidadeMethod = SensorServiceGrpc.getConsultarFuncionalidadeMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getConsultarFuncionalidadeMethod = SensorServiceGrpc.getConsultarFuncionalidadeMethod) == null) {
          SensorServiceGrpc.getConsultarFuncionalidadeMethod = getConsultarFuncionalidadeMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.iotservice.Sessao, io.grpc.examples.iotservice.Sessao>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConsultarFuncionalidade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.iotservice.Sessao.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.iotservice.Sessao.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("ConsultarFuncionalidade"))
              .build();
        }
      }
    }
    return getConsultarFuncionalidadeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SensorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorServiceStub>() {
        @java.lang.Override
        public SensorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorServiceStub(channel, callOptions);
        }
      };
    return SensorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SensorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorServiceBlockingStub>() {
        @java.lang.Override
        public SensorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorServiceBlockingStub(channel, callOptions);
        }
      };
    return SensorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SensorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorServiceFutureStub>() {
        @java.lang.Override
        public SensorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorServiceFutureStub(channel, callOptions);
        }
      };
    return SensorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SensorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listarDispositivos(io.grpc.examples.iotservice.EmptyMessage request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.ListaDispositivos> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListarDispositivosMethod(), responseObserver);
    }

    /**
     */
    public void listarLeiturasSensores(io.grpc.examples.iotservice.Parametros request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.ListaDados> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListarLeiturasSensoresMethod(), responseObserver);
    }

    /**
     */
    public void consultarUltimaLeituraSensor(io.grpc.examples.iotservice.Parametros request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.Dado> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConsultarUltimaLeituraSensorMethod(), responseObserver);
    }

    /**
     */
    public void acionarLed(io.grpc.examples.iotservice.LedStatus request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.LedStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcionarLedMethod(), responseObserver);
    }

    /**
     */
    public void listarLeds(io.grpc.examples.iotservice.LedStatus request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.ListaLedStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListarLedsMethod(), responseObserver);
    }

    /**
     */
    public void autenticarUsuario(io.grpc.examples.iotservice.ParamLogin request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.Sessao> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAutenticarUsuarioMethod(), responseObserver);
    }

    /**
     */
    public void consultarFuncionalidade(io.grpc.examples.iotservice.Sessao request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.Sessao> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConsultarFuncionalidadeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListarDispositivosMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.iotservice.EmptyMessage,
                io.grpc.examples.iotservice.ListaDispositivos>(
                  this, METHODID_LISTAR_DISPOSITIVOS)))
          .addMethod(
            getListarLeiturasSensoresMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.iotservice.Parametros,
                io.grpc.examples.iotservice.ListaDados>(
                  this, METHODID_LISTAR_LEITURAS_SENSORES)))
          .addMethod(
            getConsultarUltimaLeituraSensorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.iotservice.Parametros,
                io.grpc.examples.iotservice.Dado>(
                  this, METHODID_CONSULTAR_ULTIMA_LEITURA_SENSOR)))
          .addMethod(
            getAcionarLedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.iotservice.LedStatus,
                io.grpc.examples.iotservice.LedStatus>(
                  this, METHODID_ACIONAR_LED)))
          .addMethod(
            getListarLedsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.iotservice.LedStatus,
                io.grpc.examples.iotservice.ListaLedStatus>(
                  this, METHODID_LISTAR_LEDS)))
          .addMethod(
            getAutenticarUsuarioMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.iotservice.ParamLogin,
                io.grpc.examples.iotservice.Sessao>(
                  this, METHODID_AUTENTICAR_USUARIO)))
          .addMethod(
            getConsultarFuncionalidadeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.iotservice.Sessao,
                io.grpc.examples.iotservice.Sessao>(
                  this, METHODID_CONSULTAR_FUNCIONALIDADE)))
          .build();
    }
  }

  /**
   */
  public static final class SensorServiceStub extends io.grpc.stub.AbstractAsyncStub<SensorServiceStub> {
    private SensorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorServiceStub(channel, callOptions);
    }

    /**
     */
    public void listarDispositivos(io.grpc.examples.iotservice.EmptyMessage request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.ListaDispositivos> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListarDispositivosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listarLeiturasSensores(io.grpc.examples.iotservice.Parametros request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.ListaDados> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListarLeiturasSensoresMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void consultarUltimaLeituraSensor(io.grpc.examples.iotservice.Parametros request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.Dado> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConsultarUltimaLeituraSensorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void acionarLed(io.grpc.examples.iotservice.LedStatus request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.LedStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcionarLedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listarLeds(io.grpc.examples.iotservice.LedStatus request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.ListaLedStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListarLedsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void autenticarUsuario(io.grpc.examples.iotservice.ParamLogin request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.Sessao> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAutenticarUsuarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void consultarFuncionalidade(io.grpc.examples.iotservice.Sessao request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.Sessao> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConsultarFuncionalidadeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SensorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SensorServiceBlockingStub> {
    private SensorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.examples.iotservice.ListaDispositivos listarDispositivos(io.grpc.examples.iotservice.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListarDispositivosMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.iotservice.ListaDados listarLeiturasSensores(io.grpc.examples.iotservice.Parametros request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListarLeiturasSensoresMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.iotservice.Dado consultarUltimaLeituraSensor(io.grpc.examples.iotservice.Parametros request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConsultarUltimaLeituraSensorMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.iotservice.LedStatus acionarLed(io.grpc.examples.iotservice.LedStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcionarLedMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.iotservice.ListaLedStatus listarLeds(io.grpc.examples.iotservice.LedStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListarLedsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.iotservice.Sessao autenticarUsuario(io.grpc.examples.iotservice.ParamLogin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAutenticarUsuarioMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.iotservice.Sessao consultarFuncionalidade(io.grpc.examples.iotservice.Sessao request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConsultarFuncionalidadeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SensorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SensorServiceFutureStub> {
    private SensorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.iotservice.ListaDispositivos> listarDispositivos(
        io.grpc.examples.iotservice.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListarDispositivosMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.iotservice.ListaDados> listarLeiturasSensores(
        io.grpc.examples.iotservice.Parametros request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListarLeiturasSensoresMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.iotservice.Dado> consultarUltimaLeituraSensor(
        io.grpc.examples.iotservice.Parametros request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConsultarUltimaLeituraSensorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.iotservice.LedStatus> acionarLed(
        io.grpc.examples.iotservice.LedStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcionarLedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.iotservice.ListaLedStatus> listarLeds(
        io.grpc.examples.iotservice.LedStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListarLedsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.iotservice.Sessao> autenticarUsuario(
        io.grpc.examples.iotservice.ParamLogin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAutenticarUsuarioMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.iotservice.Sessao> consultarFuncionalidade(
        io.grpc.examples.iotservice.Sessao request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConsultarFuncionalidadeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LISTAR_DISPOSITIVOS = 0;
  private static final int METHODID_LISTAR_LEITURAS_SENSORES = 1;
  private static final int METHODID_CONSULTAR_ULTIMA_LEITURA_SENSOR = 2;
  private static final int METHODID_ACIONAR_LED = 3;
  private static final int METHODID_LISTAR_LEDS = 4;
  private static final int METHODID_AUTENTICAR_USUARIO = 5;
  private static final int METHODID_CONSULTAR_FUNCIONALIDADE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SensorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SensorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LISTAR_DISPOSITIVOS:
          serviceImpl.listarDispositivos((io.grpc.examples.iotservice.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.ListaDispositivos>) responseObserver);
          break;
        case METHODID_LISTAR_LEITURAS_SENSORES:
          serviceImpl.listarLeiturasSensores((io.grpc.examples.iotservice.Parametros) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.ListaDados>) responseObserver);
          break;
        case METHODID_CONSULTAR_ULTIMA_LEITURA_SENSOR:
          serviceImpl.consultarUltimaLeituraSensor((io.grpc.examples.iotservice.Parametros) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.Dado>) responseObserver);
          break;
        case METHODID_ACIONAR_LED:
          serviceImpl.acionarLed((io.grpc.examples.iotservice.LedStatus) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.LedStatus>) responseObserver);
          break;
        case METHODID_LISTAR_LEDS:
          serviceImpl.listarLeds((io.grpc.examples.iotservice.LedStatus) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.ListaLedStatus>) responseObserver);
          break;
        case METHODID_AUTENTICAR_USUARIO:
          serviceImpl.autenticarUsuario((io.grpc.examples.iotservice.ParamLogin) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.Sessao>) responseObserver);
          break;
        case METHODID_CONSULTAR_FUNCIONALIDADE:
          serviceImpl.consultarFuncionalidade((io.grpc.examples.iotservice.Sessao) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.Sessao>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SensorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.iotservice.IoTServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SensorService");
    }
  }

  private static final class SensorServiceFileDescriptorSupplier
      extends SensorServiceBaseDescriptorSupplier {
    SensorServiceFileDescriptorSupplier() {}
  }

  private static final class SensorServiceMethodDescriptorSupplier
      extends SensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SensorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SensorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SensorServiceFileDescriptorSupplier())
              .addMethod(getListarDispositivosMethod())
              .addMethod(getListarLeiturasSensoresMethod())
              .addMethod(getConsultarUltimaLeituraSensorMethod())
              .addMethod(getAcionarLedMethod())
              .addMethod(getListarLedsMethod())
              .addMethod(getAutenticarUsuarioMethod())
              .addMethod(getConsultarFuncionalidadeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
