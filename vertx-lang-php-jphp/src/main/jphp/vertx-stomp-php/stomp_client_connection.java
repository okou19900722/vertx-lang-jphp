/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.php.ext.stomp;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.buffer.Buffer;

/**

 * @class
 */
@Name("StompClientConnection")
@Namespace("io\\vertx\\php\\ext\\stomp")
public class StompClientConnection extends BaseWrapper<StompClientConnection>{

  /**

   @public

   @return {string} the session id.
   */
  this.session = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_stompClientConnection.session();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string} the STOMP protocol version negotiated with the server.
   */
  this.version = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_stompClientConnection.version();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Closes the connection without sending the <code>DISCONNECT</code> frame.

   @public

   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_stompClientConnection.close();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string} the server name.
   */
  this.server = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_stompClientConnection.server();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sends a <code>SEND</code> frame to the server to the given destination.

   @public
   @param destination {string} the destination, must not be <code>null</code> 
   @param headers {Array.<string>} the header. The <code>destination</code> header is replaced by the value given to the <code>destination</code> parameter 
   @param body {Buffer} the body, may be <code>null</code> 
   @param receiptHandler {function} the handler invoked when the <code>RECEIPT</code> frame associated with the sent frame has been received. The handler receives the sent frame. 
   @return {StompClientConnection} the current {@link StompClientConnection}
   */
  this.send = function() {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      j_stompClientConnection.send(__args[0] != null ? new Frame(new JsonObject(Java.asJSONCompatible(__args[0]))) : null);
      return that;
    }  else if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'object' && __args[1]._jdel) {
      j_stompClientConnection.send(__args[0], __args[1]._jdel);
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel) {
      j_stompClientConnection.send(__args[0], __args[1]._jdel);
      return that;
    }  else if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_stompClientConnection.send(__args[0] != null ? new Frame(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(jVal) {
      __args[1](utils.convReturnDataObject(jVal));
    });
      return that;
    }  else if (__args.length === 3 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'function') {
      j_stompClientConnection.send(__args[0], __args[1]._jdel, function(jVal) {
      __args[2](utils.convReturnDataObject(jVal));
    });
      return that;
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'function') {
      j_stompClientConnection.send(__args[0], __args[1]._jdel, function(jVal) {
      __args[2](utils.convReturnDataObject(jVal));
    });
      return that;
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'object' && __args[2]._jdel) {
      j_stompClientConnection.send(__args[0], __args[1], __args[2]._jdel);
      return that;
    }  else if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'object' && __args[2]._jdel && typeof __args[3] === 'function') {
      j_stompClientConnection.send(__args[0], __args[1], __args[2]._jdel, function(jVal) {
      __args[3](utils.convReturnDataObject(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Subscribes to the given destination.

   @public
   @param destination {string} the destination, must not be <code>null</code> 
   @param headers {Array.<string>} the headers to configure the subscription. It may contain the <code>ack</code> header to configure the acknowledgment policy. If the given set of headers contains the <code>id</code> header, this value is used as subscription id. 
   @param handler {function} the handler invoked when a message is received on the given destination. Must not be <code>null</code>. 
   @param receiptHandler {function} the handler invoked when the <code>RECEIPT</code> frame associated with the subscription has been received. The handler receives the sent frame (<code>SUBSCRIBE</code>). 
   @return {string} the subscription id, which can either be the destination or the id set in the headers.
   */
  this.subscribe = function() {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      return j_stompClientConnection.subscribe(__args[0], function(jVal) {
      __args[1](utils.convReturnDataObject(jVal));
    });
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'function' && typeof __args[2] === 'function') {
      return j_stompClientConnection.subscribe(__args[0], function(jVal) {
      __args[1](utils.convReturnDataObject(jVal));
    }, function(jVal) {
      __args[2](utils.convReturnDataObject(jVal));
    });
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      return j_stompClientConnection.subscribe(__args[0], __args[1], function(jVal) {
      __args[2](utils.convReturnDataObject(jVal));
    });
    }  else if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function' && typeof __args[3] === 'function') {
      return j_stompClientConnection.subscribe(__args[0], __args[1], function(jVal) {
      __args[2](utils.convReturnDataObject(jVal));
    }, function(jVal) {
      __args[3](utils.convReturnDataObject(jVal));
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Un-subscribes from the given destination. This method computes the subscription id as follows. If the given
   headers contains the <code>id</code> header, the header value is used. Otherwise the destination is used.

   @public
   @param destination {string} the destination 
   @param headers {Array.<string>} the headers 
   @param receiptHandler {function} the handler invoked when the <code>RECEIPT</code> frame associated with the un-subscription has been received. The handler receives the sent frame (<code>UNSUBSCRIBE</code>). 
   @return {StompClientConnection} the current {@link StompClientConnection}
   */
  this.unsubscribe = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_stompClientConnection.unsubscribe(__args[0]);
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_stompClientConnection.unsubscribe(__args[0], function(jVal) {
      __args[1](utils.convReturnDataObject(jVal));
    });
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null)) {
      j_stompClientConnection.unsubscribe(__args[0], __args[1]);
      return that;
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_stompClientConnection.unsubscribe(__args[0], __args[1], function(jVal) {
      __args[2](utils.convReturnDataObject(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets a handler notified when an <code>ERROR</code> frame is received by the client. The handler receives the <code>ERROR</code> frame and a reference on the {@link StompClientConnection}.

   @public
   @param handler {function} the handler 
   @return {StompClientConnection} the current {@link StompClientConnection}
   */
  this.errorHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompClientConnection.errorHandler(function(jVal) {
      handler(utils.convReturnDataObject(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets a handler notified when the STOMP connection is closed.

   @public
   @param handler {function} the handler 
   @return {StompClientConnection} the current {@link StompClientConnection}
   */
  this.closeHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompClientConnection.closeHandler(function(jVal) {
      handler(utils.convReturnVertxGen(StompClientConnection, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets a handler notified when the server does not respond to a <code>ping</code> request in time. In other
   words, this handler is invoked when the heartbeat has detected a connection failure with the server.
   The handler can decide to reconnect to the server.

   @public
   @param handler {function} the handler 
   @return {StompClientConnection} the current {@link StompClientConnection} receiving the dropped connection.
   */
  this.connectionDroppedHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompClientConnection.connectionDroppedHandler(function(jVal) {
      handler(utils.convReturnVertxGen(StompClientConnection, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets a handler that let customize the behavior when a ping needs to be sent to the server. Be aware that
   changing the default behavior may break the compliance with the STOMP specification.

   @public
   @param handler {function} the handler 
   @return {StompClientConnection} the current {@link StompClientConnection}
   */
  this.pingHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompClientConnection.pingHandler(function(jVal) {
      handler(utils.convReturnVertxGen(StompClientConnection, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Begins a transaction.

   @public
   @param id {string} the transaction id, must not be <code>null</code> 
   @param headers {Array.<string>} additional headers to send to the server. The <code>transaction</code> header is replaced by the value passed in the @{code id} parameter 
   @param receiptHandler {function} the handler invoked when the <code>RECEIPT</code> frame associated with the transaction begin has been processed by the server. The handler receives the sent frame (<code>BEGIN</code>). 
   @return {StompClientConnection} the current {@link StompClientConnection}
   */
  this.beginTX = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_stompClientConnection.beginTX(__args[0]);
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_stompClientConnection.beginTX(__args[0], function(jVal) {
      __args[1](utils.convReturnDataObject(jVal));
    });
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null)) {
      j_stompClientConnection.beginTX(__args[0], __args[1]);
      return that;
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_stompClientConnection.beginTX(__args[0], __args[1], function(jVal) {
      __args[2](utils.convReturnDataObject(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Commits a transaction.

   @public
   @param id {string} the transaction id, must not be <code>null</code> 
   @param headers {Array.<string>} additional headers to send to the server. The <code>transaction</code> header is replaced by the value passed in the @{code id} parameter 
   @param receiptHandler {function} the handler invoked when the <code>RECEIPT</code> frame associated with the transaction commit has been processed by the server. The handler receives the sent frame (<code>COMMIT</code>). 
   @return {StompClientConnection} the current {@link StompClientConnection}
   */
  this.commit = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_stompClientConnection.commit(__args[0]);
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_stompClientConnection.commit(__args[0], function(jVal) {
      __args[1](utils.convReturnDataObject(jVal));
    });
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null)) {
      j_stompClientConnection.commit(__args[0], __args[1]);
      return that;
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_stompClientConnection.commit(__args[0], __args[1], function(jVal) {
      __args[2](utils.convReturnDataObject(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Aborts a transaction.

   @public
   @param id {string} the transaction id, must not be <code>null</code> 
   @param headers {Array.<string>} additional headers to send to the server. The <code>transaction</code> header is replaced by the value passed in the @{code id} parameter 
   @param receiptHandler {function} the handler invoked when the <code>RECEIPT</code> frame associated with the transaction cancellation has been processed by the server. The handler receives the sent frame (<code>ABORT</code>). 
   @return {StompClientConnection} the current {@link StompClientConnection}
   */
  this.abort = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_stompClientConnection.abort(__args[0]);
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_stompClientConnection.abort(__args[0], function(jVal) {
      __args[1](utils.convReturnDataObject(jVal));
    });
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null)) {
      j_stompClientConnection.abort(__args[0], __args[1]);
      return that;
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_stompClientConnection.abort(__args[0], __args[1], function(jVal) {
      __args[2](utils.convReturnDataObject(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Disconnects the client. Unlike the {@link StompClientConnection#close} method, this method send the <code>DISCONNECT</code> frame to the
   server. This method lets you customize the <code>DISCONNECT</code> frame.

   @public
   @param frame {Object} the <code>DISCONNECT</code> frame. 
   @param receiptHandler {function} the handler invoked when the <code>RECEIPT</code> frame associated with the disconnection has been processed by the server. The handler receives the sent frame (<code>DISCONNECT</code>). 
   @return {StompClientConnection} the current {@link StompClientConnection}
   */
  this.disconnect = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_stompClientConnection.disconnect();
      return that;
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompClientConnection.disconnect(function(jVal) {
      __args[0](utils.convReturnDataObject(jVal));
    });
      return that;
    }  else if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      j_stompClientConnection.disconnect(__args[0] != null ? new Frame(new JsonObject(Java.asJSONCompatible(__args[0]))) : null);
      return that;
    }  else if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_stompClientConnection.disconnect(__args[0] != null ? new Frame(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(jVal) {
      __args[1](utils.convReturnDataObject(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sends an acknowledgement for the given frame. It means that the frame has been handled and processed by the
   client. The sent acknowledgement is part of the transaction identified by the given id.

   @public
   @param id {string} the message id of the message to acknowledge 
   @param txId {string} the transaction id 
   @param receiptHandler {function} the handler invoked when the <code>RECEIPT</code> frame associated with the acknowledgment has been processed by the server. The handler receives the sent frame (<code>ACK</code>). 
   @return {StompClientConnection} the current {@link StompClientConnection}
   */
  this.ack = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_stompClientConnection.ack(__args[0]);
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_stompClientConnection.ack(__args[0], function(jVal) {
      __args[1](utils.convReturnDataObject(jVal));
    });
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
      j_stompClientConnection.ack(__args[0], __args[1]);
      return that;
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_stompClientConnection.ack(__args[0], __args[1], function(jVal) {
      __args[2](utils.convReturnDataObject(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sends a non-acknowledgement for the given frame. It means that the frame has not been handled by the client.
   The sent non-acknowledgement is part of the transaction identified by the given id.

   @public
   @param id {string} the message id of the message to acknowledge 
   @param txId {string} the transaction id 
   @param receiptHandler {function} the handler invoked when the <code>RECEIPT</code> frame associated with the non-acknowledgment has been processed by the server. The handler receives the sent frame (<code>NACK</code>). 
   @return {StompClientConnection} the current {@link StompClientConnection}
   */
  this.nack = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_stompClientConnection.nack(__args[0]);
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_stompClientConnection.nack(__args[0], function(jVal) {
      __args[1](utils.convReturnDataObject(jVal));
    });
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
      j_stompClientConnection.nack(__args[0], __args[1]);
      return that;
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_stompClientConnection.nack(__args[0], __args[1], function(jVal) {
      __args[2](utils.convReturnDataObject(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures a received handler that get notified when a STOMP frame is received by the client.
   This handler can be used for logging, debugging or ad-hoc behavior. The frame can still be modified by the handler.
   <p>
   Unlike {@link StompClient#receivedFrameHandler}, the given handler won't receive the <code>CONNECTED</code> frame. If a received frame handler is set on the {@link StompClient}, it will be used by all
   clients connection, so calling this method is useless, except if you want to use a different handler.

   @public
   @param handler {function} the handler 
   @return {StompClientConnection} the current {@link StompClientConnection}
   */
  this.receivedFrameHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompClientConnection.receivedFrameHandler(function(jVal) {
      handler(utils.convReturnDataObject(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures a handler notified when a frame is going to be written on the wire. This handler can be used from
   logging, debugging. The handler can modify the received frame.
   <p>
   If a writing frame handler is set on the {@link StompClient}, it will be used by all
   clients connection, so calling this method is useless, except if you want to use a different handler.

   @public
   @param handler {function} the handler 
   @return {StompClientConnection} the current {@link StompClientConnection}
   */
  this.writingFrameHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompClientConnection.writingFrameHandler(function(jVal) {
      handler(utils.convReturnDataObject(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the exception handler notified upon TCP-level errors.

   @public
   @param exceptionHandler {function} the handler 
   @return {StompClientConnection} the current {@link StompClientConnection}
   */
  this.exceptionHandler = function(exceptionHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompClientConnection.exceptionHandler(function(jVal) {
      exceptionHandler(utils.convReturnThrowable(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns whether or not the `CONNECTED` frame has been receive meaning that the Stomp connection is established.

   @public

   @return {boolean} <code>true</code> if the connection is established, <code>false</code> otherwise
   */
  this.isConnected = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_stompClientConnection.isConnected();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_stompClientConnection;
};

StompClientConnection._jclass = utils.getJavaClass("io.vertx.ext.stomp.StompClientConnection");
StompClientConnection._jtype = {
  accept: function(obj) {
    return StompClientConnection._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(StompClientConnection.prototype, {});
    StompClientConnection.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
StompClientConnection._create = function(jdel) {
  var obj = Object.create(StompClientConnection.prototype, {});
  StompClientConnection.apply(obj, arguments);
  return obj;
}
module.exports = StompClientConnection;