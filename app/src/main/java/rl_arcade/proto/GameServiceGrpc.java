package rl_arcade.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: gameai.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GameServiceGrpc {

  private GameServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "rl_arcade.proto.GameService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<rl_arcade.proto.GameServiceProto.StartGameRequest,
      rl_arcade.proto.GameServiceProto.StartGameResponse> getStartGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartGame",
      requestType = rl_arcade.proto.GameServiceProto.StartGameRequest.class,
      responseType = rl_arcade.proto.GameServiceProto.StartGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rl_arcade.proto.GameServiceProto.StartGameRequest,
      rl_arcade.proto.GameServiceProto.StartGameResponse> getStartGameMethod() {
    io.grpc.MethodDescriptor<rl_arcade.proto.GameServiceProto.StartGameRequest, rl_arcade.proto.GameServiceProto.StartGameResponse> getStartGameMethod;
    if ((getStartGameMethod = GameServiceGrpc.getStartGameMethod) == null) {
      synchronized (GameServiceGrpc.class) {
        if ((getStartGameMethod = GameServiceGrpc.getStartGameMethod) == null) {
          GameServiceGrpc.getStartGameMethod = getStartGameMethod =
              io.grpc.MethodDescriptor.<rl_arcade.proto.GameServiceProto.StartGameRequest, rl_arcade.proto.GameServiceProto.StartGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rl_arcade.proto.GameServiceProto.StartGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rl_arcade.proto.GameServiceProto.StartGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GameServiceMethodDescriptorSupplier("StartGame"))
              .build();
        }
      }
    }
    return getStartGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rl_arcade.proto.GameServiceProto.StepRequest,
      rl_arcade.proto.GameServiceProto.StepResponse> getStepMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Step",
      requestType = rl_arcade.proto.GameServiceProto.StepRequest.class,
      responseType = rl_arcade.proto.GameServiceProto.StepResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rl_arcade.proto.GameServiceProto.StepRequest,
      rl_arcade.proto.GameServiceProto.StepResponse> getStepMethod() {
    io.grpc.MethodDescriptor<rl_arcade.proto.GameServiceProto.StepRequest, rl_arcade.proto.GameServiceProto.StepResponse> getStepMethod;
    if ((getStepMethod = GameServiceGrpc.getStepMethod) == null) {
      synchronized (GameServiceGrpc.class) {
        if ((getStepMethod = GameServiceGrpc.getStepMethod) == null) {
          GameServiceGrpc.getStepMethod = getStepMethod =
              io.grpc.MethodDescriptor.<rl_arcade.proto.GameServiceProto.StepRequest, rl_arcade.proto.GameServiceProto.StepResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Step"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rl_arcade.proto.GameServiceProto.StepRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rl_arcade.proto.GameServiceProto.StepResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GameServiceMethodDescriptorSupplier("Step"))
              .build();
        }
      }
    }
    return getStepMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rl_arcade.proto.GameServiceProto.Empty,
      rl_arcade.proto.GameServiceProto.GameState> getGetStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetState",
      requestType = rl_arcade.proto.GameServiceProto.Empty.class,
      responseType = rl_arcade.proto.GameServiceProto.GameState.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rl_arcade.proto.GameServiceProto.Empty,
      rl_arcade.proto.GameServiceProto.GameState> getGetStateMethod() {
    io.grpc.MethodDescriptor<rl_arcade.proto.GameServiceProto.Empty, rl_arcade.proto.GameServiceProto.GameState> getGetStateMethod;
    if ((getGetStateMethod = GameServiceGrpc.getGetStateMethod) == null) {
      synchronized (GameServiceGrpc.class) {
        if ((getGetStateMethod = GameServiceGrpc.getGetStateMethod) == null) {
          GameServiceGrpc.getGetStateMethod = getGetStateMethod =
              io.grpc.MethodDescriptor.<rl_arcade.proto.GameServiceProto.Empty, rl_arcade.proto.GameServiceProto.GameState>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rl_arcade.proto.GameServiceProto.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rl_arcade.proto.GameServiceProto.GameState.getDefaultInstance()))
              .setSchemaDescriptor(new GameServiceMethodDescriptorSupplier("GetState"))
              .build();
        }
      }
    }
    return getGetStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rl_arcade.proto.GameServiceProto.PlayerData,
      rl_arcade.proto.GameServiceProto.Empty> getSendPlayerDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendPlayerData",
      requestType = rl_arcade.proto.GameServiceProto.PlayerData.class,
      responseType = rl_arcade.proto.GameServiceProto.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rl_arcade.proto.GameServiceProto.PlayerData,
      rl_arcade.proto.GameServiceProto.Empty> getSendPlayerDataMethod() {
    io.grpc.MethodDescriptor<rl_arcade.proto.GameServiceProto.PlayerData, rl_arcade.proto.GameServiceProto.Empty> getSendPlayerDataMethod;
    if ((getSendPlayerDataMethod = GameServiceGrpc.getSendPlayerDataMethod) == null) {
      synchronized (GameServiceGrpc.class) {
        if ((getSendPlayerDataMethod = GameServiceGrpc.getSendPlayerDataMethod) == null) {
          GameServiceGrpc.getSendPlayerDataMethod = getSendPlayerDataMethod =
              io.grpc.MethodDescriptor.<rl_arcade.proto.GameServiceProto.PlayerData, rl_arcade.proto.GameServiceProto.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendPlayerData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rl_arcade.proto.GameServiceProto.PlayerData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rl_arcade.proto.GameServiceProto.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GameServiceMethodDescriptorSupplier("SendPlayerData"))
              .build();
        }
      }
    }
    return getSendPlayerDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rl_arcade.proto.GameServiceProto.Empty,
      rl_arcade.proto.GameServiceProto.GameState> getResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reset",
      requestType = rl_arcade.proto.GameServiceProto.Empty.class,
      responseType = rl_arcade.proto.GameServiceProto.GameState.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rl_arcade.proto.GameServiceProto.Empty,
      rl_arcade.proto.GameServiceProto.GameState> getResetMethod() {
    io.grpc.MethodDescriptor<rl_arcade.proto.GameServiceProto.Empty, rl_arcade.proto.GameServiceProto.GameState> getResetMethod;
    if ((getResetMethod = GameServiceGrpc.getResetMethod) == null) {
      synchronized (GameServiceGrpc.class) {
        if ((getResetMethod = GameServiceGrpc.getResetMethod) == null) {
          GameServiceGrpc.getResetMethod = getResetMethod =
              io.grpc.MethodDescriptor.<rl_arcade.proto.GameServiceProto.Empty, rl_arcade.proto.GameServiceProto.GameState>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rl_arcade.proto.GameServiceProto.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rl_arcade.proto.GameServiceProto.GameState.getDefaultInstance()))
              .setSchemaDescriptor(new GameServiceMethodDescriptorSupplier("Reset"))
              .build();
        }
      }
    }
    return getResetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GameServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GameServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GameServiceStub>() {
        @java.lang.Override
        public GameServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GameServiceStub(channel, callOptions);
        }
      };
    return GameServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GameServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GameServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GameServiceBlockingStub>() {
        @java.lang.Override
        public GameServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GameServiceBlockingStub(channel, callOptions);
        }
      };
    return GameServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GameServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GameServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GameServiceFutureStub>() {
        @java.lang.Override
        public GameServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GameServiceFutureStub(channel, callOptions);
        }
      };
    return GameServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void startGame(rl_arcade.proto.GameServiceProto.StartGameRequest request,
        io.grpc.stub.StreamObserver<rl_arcade.proto.GameServiceProto.StartGameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartGameMethod(), responseObserver);
    }

    /**
     */
    default void step(rl_arcade.proto.GameServiceProto.StepRequest request,
        io.grpc.stub.StreamObserver<rl_arcade.proto.GameServiceProto.StepResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStepMethod(), responseObserver);
    }

    /**
     */
    default void getState(rl_arcade.proto.GameServiceProto.Empty request,
        io.grpc.stub.StreamObserver<rl_arcade.proto.GameServiceProto.GameState> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStateMethod(), responseObserver);
    }

    /**
     */
    default void sendPlayerData(rl_arcade.proto.GameServiceProto.PlayerData request,
        io.grpc.stub.StreamObserver<rl_arcade.proto.GameServiceProto.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendPlayerDataMethod(), responseObserver);
    }

    /**
     */
    default void reset(rl_arcade.proto.GameServiceProto.Empty request,
        io.grpc.stub.StreamObserver<rl_arcade.proto.GameServiceProto.GameState> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GameService.
   * <pre>
   * Service definition
   * </pre>
   */
  public static abstract class GameServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GameServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GameService.
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class GameServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GameServiceStub> {
    private GameServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GameServiceStub(channel, callOptions);
    }

    /**
     */
    public void startGame(rl_arcade.proto.GameServiceProto.StartGameRequest request,
        io.grpc.stub.StreamObserver<rl_arcade.proto.GameServiceProto.StartGameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void step(rl_arcade.proto.GameServiceProto.StepRequest request,
        io.grpc.stub.StreamObserver<rl_arcade.proto.GameServiceProto.StepResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStepMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getState(rl_arcade.proto.GameServiceProto.Empty request,
        io.grpc.stub.StreamObserver<rl_arcade.proto.GameServiceProto.GameState> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendPlayerData(rl_arcade.proto.GameServiceProto.PlayerData request,
        io.grpc.stub.StreamObserver<rl_arcade.proto.GameServiceProto.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendPlayerDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reset(rl_arcade.proto.GameServiceProto.Empty request,
        io.grpc.stub.StreamObserver<rl_arcade.proto.GameServiceProto.GameState> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GameService.
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class GameServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GameServiceBlockingStub> {
    private GameServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GameServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public rl_arcade.proto.GameServiceProto.StartGameResponse startGame(rl_arcade.proto.GameServiceProto.StartGameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public rl_arcade.proto.GameServiceProto.StepResponse step(rl_arcade.proto.GameServiceProto.StepRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStepMethod(), getCallOptions(), request);
    }

    /**
     */
    public rl_arcade.proto.GameServiceProto.GameState getState(rl_arcade.proto.GameServiceProto.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public rl_arcade.proto.GameServiceProto.Empty sendPlayerData(rl_arcade.proto.GameServiceProto.PlayerData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendPlayerDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public rl_arcade.proto.GameServiceProto.GameState reset(rl_arcade.proto.GameServiceProto.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GameService.
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class GameServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GameServiceFutureStub> {
    private GameServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GameServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rl_arcade.proto.GameServiceProto.StartGameResponse> startGame(
        rl_arcade.proto.GameServiceProto.StartGameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rl_arcade.proto.GameServiceProto.StepResponse> step(
        rl_arcade.proto.GameServiceProto.StepRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStepMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rl_arcade.proto.GameServiceProto.GameState> getState(
        rl_arcade.proto.GameServiceProto.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rl_arcade.proto.GameServiceProto.Empty> sendPlayerData(
        rl_arcade.proto.GameServiceProto.PlayerData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendPlayerDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rl_arcade.proto.GameServiceProto.GameState> reset(
        rl_arcade.proto.GameServiceProto.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_GAME = 0;
  private static final int METHODID_STEP = 1;
  private static final int METHODID_GET_STATE = 2;
  private static final int METHODID_SEND_PLAYER_DATA = 3;
  private static final int METHODID_RESET = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_GAME:
          serviceImpl.startGame((rl_arcade.proto.GameServiceProto.StartGameRequest) request,
              (io.grpc.stub.StreamObserver<rl_arcade.proto.GameServiceProto.StartGameResponse>) responseObserver);
          break;
        case METHODID_STEP:
          serviceImpl.step((rl_arcade.proto.GameServiceProto.StepRequest) request,
              (io.grpc.stub.StreamObserver<rl_arcade.proto.GameServiceProto.StepResponse>) responseObserver);
          break;
        case METHODID_GET_STATE:
          serviceImpl.getState((rl_arcade.proto.GameServiceProto.Empty) request,
              (io.grpc.stub.StreamObserver<rl_arcade.proto.GameServiceProto.GameState>) responseObserver);
          break;
        case METHODID_SEND_PLAYER_DATA:
          serviceImpl.sendPlayerData((rl_arcade.proto.GameServiceProto.PlayerData) request,
              (io.grpc.stub.StreamObserver<rl_arcade.proto.GameServiceProto.Empty>) responseObserver);
          break;
        case METHODID_RESET:
          serviceImpl.reset((rl_arcade.proto.GameServiceProto.Empty) request,
              (io.grpc.stub.StreamObserver<rl_arcade.proto.GameServiceProto.GameState>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getStartGameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rl_arcade.proto.GameServiceProto.StartGameRequest,
              rl_arcade.proto.GameServiceProto.StartGameResponse>(
                service, METHODID_START_GAME)))
        .addMethod(
          getStepMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rl_arcade.proto.GameServiceProto.StepRequest,
              rl_arcade.proto.GameServiceProto.StepResponse>(
                service, METHODID_STEP)))
        .addMethod(
          getGetStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rl_arcade.proto.GameServiceProto.Empty,
              rl_arcade.proto.GameServiceProto.GameState>(
                service, METHODID_GET_STATE)))
        .addMethod(
          getSendPlayerDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rl_arcade.proto.GameServiceProto.PlayerData,
              rl_arcade.proto.GameServiceProto.Empty>(
                service, METHODID_SEND_PLAYER_DATA)))
        .addMethod(
          getResetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rl_arcade.proto.GameServiceProto.Empty,
              rl_arcade.proto.GameServiceProto.GameState>(
                service, METHODID_RESET)))
        .build();
  }

  private static abstract class GameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GameServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return rl_arcade.proto.GameServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GameService");
    }
  }

  private static final class GameServiceFileDescriptorSupplier
      extends GameServiceBaseDescriptorSupplier {
    GameServiceFileDescriptorSupplier() {}
  }

  private static final class GameServiceMethodDescriptorSupplier
      extends GameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GameServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GameServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GameServiceFileDescriptorSupplier())
              .addMethod(getStartGameMethod())
              .addMethod(getStepMethod())
              .addMethod(getGetStateMethod())
              .addMethod(getSendPlayerDataMethod())
              .addMethod(getResetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
