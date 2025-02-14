package io.github.vertxchina;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;

@FunctionalInterface
public interface SocketWriter<S extends WriteStream<Buffer>> {
  void write(S socket, Message message);
}
