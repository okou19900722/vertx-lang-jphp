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

package io.vertx.php.circuitbreaker;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.Future;

/**
 An implementation of the circuit breaker pattern for Vert.x

 * @class
 */
@Name("CircuitBreaker")
@Namespace("io\\vertx\\php\\circuitbreaker")
public class CircuitBreaker extends BaseWrapper<CircuitBreaker>{

  /**
   Closes the circuit breaker. It stops sending events on its state on the event bus.
   This method is not related to the <code>close</code> state of the circuit breaker. To set the circuit breaker in the
   <code>close</code> state, use {@link CircuitBreaker#reset}.

   @public

   @return {CircuitBreaker}
   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_circuitBreaker.close();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets a  invoked when the circuit breaker state switches to open.

   @public
   @param handler {function} the handler, must not be <code>null</code> 
   @return {CircuitBreaker} the current {@link CircuitBreaker}
   */
  this.openHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_circuitBreaker.openHandler(handler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets a  invoked when the circuit breaker state switches to half-open.

   @public
   @param handler {function} the handler, must not be <code>null</code> 
   @return {CircuitBreaker} the current {@link CircuitBreaker}
   */
  this.halfOpenHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_circuitBreaker.halfOpenHandler(handler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets a  invoked when the circuit breaker state switches to close.

   @public
   @param handler {function} the handler, must not be <code>null</code> 
   @return {CircuitBreaker} the current {@link CircuitBreaker}
   */
  this.closeHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_circuitBreaker.closeHandler(handler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Executes the given operation with the circuit breaker control. The operation is generally calling an
   <em>external</em> system. The operation receives a  object as parameter and <strong>must</strong>
   call  when the operation has terminated successfully. The operation must also
   call  in case of failure.
   <p>
   The operation is not invoked if the circuit breaker is open, and the given fallback is called immediately. The
   circuit breaker also monitor the completion of the operation before a configure timeout. The operation is
   considered as failed if it does not terminate in time.
   <p>
   This method returns a  object to retrieve the status and result of the operation, with the status
   being a success or a failure. If the fallback is called, the returned future is successfully completed with the
   value returned from the fallback. If the fallback throws an exception, the returned future is marked as failed.

   @public
   @param command {function} the operation 
   @param fallback {todo} the fallback function. It gets an exception as parameter and returns the <em>fallback</em> result 
   @return {Future} a future object completed when the operation or its fallback completes
   */
  this.executeWithFallback = function(command, fallback) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'function' && typeof __args[1] === 'function') {
      return utils.convReturnVertxGen(Future, j_circuitBreaker.executeWithFallback(function(jVal) {
      command(utils.convReturnVertxGen(Future, jVal, undefined));
    }, function(jVal) {
      var jRet = fallback(utils.convReturnThrowable(jVal));
      return utils.convParamTypeUnknown(jRet);
    }), undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Same as {@link CircuitBreaker#executeWithFallback} but using a callback.

   @public
   @param command {function} the operation 
   @param fallback {todo} the fallback 
   @param handler {function} the completion handler receiving either the operation result or the fallback result. The parameter is an  because if the fallback is not called, the error is passed to the handler. 
   */
  this.executeCommandWithFallback = function(command, fallback, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'function' && typeof __args[1] === 'function' && typeof __args[2] === 'function') {
      j_circuitBreaker.executeCommandWithFallback(function(jVal) {
      command(utils.convReturnVertxGen(Future, jVal, undefined));
    }, function(jVal) {
      var jRet = fallback(utils.convReturnThrowable(jVal));
      return utils.convParamTypeUnknown(jRet);
    }, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnTypeUnknown(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Same as {@link CircuitBreaker#executeWithFallback} but using the circuit breaker default fallback.

   @public
   @param command {function} the operation 
   @return {Future} a future object completed when the operation or its fallback completes
   */
  this.execute = function(command) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      return utils.convReturnVertxGen(Future, j_circuitBreaker.execute(function(jVal) {
      command(utils.convReturnVertxGen(Future, jVal, undefined));
    }), undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Same as {@link CircuitBreaker#executeWithFallback} but using the circuit breaker default fallback.

   @public
   @param command {function} the operation 
   @param handler {function} 
   */
  this.executeCommand = function(command, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'function' && typeof __args[1] === 'function') {
      j_circuitBreaker.executeCommand(function(jVal) {
      command(utils.convReturnVertxGen(Future, jVal, undefined));
    }, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnTypeUnknown(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Same as {@link CircuitBreaker#executeAndReportWithFallback} but using the circuit breaker default
   fallback.

   @public
   @param resultFuture {Future} the future on which the operation result is reported 
   @param command {function} the operation 
   @return {CircuitBreaker} the current {@link CircuitBreaker}
   */
  this.executeAndReport = function(resultFuture, command) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'function') {
      j_circuitBreaker.executeAndReport(resultFuture._jdel, function(jVal) {
      command(utils.convReturnVertxGen(Future, jVal, undefined));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Executes the given operation with the circuit breaker control. The operation is generally calling an
   <em>external</em> system. The operation receives a  object as parameter and <strong>must</strong>
   call  when the operation has terminated successfully. The operation must also
   call  in case of failure.
   <p>
   The operation is not invoked if the circuit breaker is open, and the given fallback is called immediately. The
   circuit breaker also monitor the completion of the operation before a configure timeout. The operation is
   considered as failed if it does not terminate in time.
   <p>
   Unlike {@link CircuitBreaker#executeWithFallback},  this method does return a  object, but
   let the caller pass a  object on which the result is reported. If the fallback is called, the future
   is successfully completed with the value returned by the fallback function. If the fallback throws an exception,
   the future is marked as failed.

   @public
   @param resultFuture {Future} the future on which the operation result is reported 
   @param command {function} the operation 
   @param fallback {todo} the fallback function. It gets an exception as parameter and returns the <em>fallback</em> result 
   @return {CircuitBreaker} the current {@link CircuitBreaker}
   */
  this.executeAndReportWithFallback = function(resultFuture, command, fallback) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'function' && typeof __args[2] === 'function') {
      j_circuitBreaker.executeAndReportWithFallback(resultFuture._jdel, function(jVal) {
      command(utils.convReturnVertxGen(Future, jVal, undefined));
    }, function(jVal) {
      var jRet = fallback(utils.convReturnThrowable(jVal));
      return utils.convParamTypeUnknown(jRet);
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets a <em>default</em>  invoked when the bridge is open to handle the "request", or on failure
   if <a href="../../dataobjects.html#CircuitBreakerOptions">CircuitBreakerOptions</a> is enabled.
   <p>
   The function gets the exception as parameter and returns the <em>fallback</em> result.

   @public
   @param handler {todo} the handler 
   @return {CircuitBreaker} the current {@link CircuitBreaker}
   */
  this.fallback = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_circuitBreaker.fallback(function(jVal) {
      var jRet = handler(utils.convReturnThrowable(jVal));
      return utils.convParamTypeUnknown(jRet);
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Resets the circuit breaker state (number of failure set to 0 and state set to closed).

   @public

   @return {CircuitBreaker} the current {@link CircuitBreaker}
   */
  this.reset = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_circuitBreaker.reset();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Explicitly opens the circuit.

   @public

   @return {CircuitBreaker} the current {@link CircuitBreaker}
   */
  this.open = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_circuitBreaker.open();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Object} the current state.
   */
  this.state = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnEnum(j_circuitBreaker.state());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the current number of failures.
   */
  this.failureCount = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_circuitBreaker.failureCount();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string} the name of the circuit breaker.
   */
  this.name = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedname == null) {
        that.cachedname = j_circuitBreaker.name();
      }
      return that.cachedname;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_circuitBreaker;
};

CircuitBreaker._jclass = utils.getJavaClass("io.vertx.circuitbreaker.CircuitBreaker");
CircuitBreaker._jtype = {
  accept: function(obj) {
    return CircuitBreaker._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(CircuitBreaker.prototype, {});
    CircuitBreaker.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
CircuitBreaker._create = function(jdel) {
  var obj = Object.create(CircuitBreaker.prototype, {});
  CircuitBreaker.apply(obj, arguments);
  return obj;
}
/**
 Creates a new instance of {@link CircuitBreaker}.

 @memberof module:vertx-circuit-breaker-js/circuit_breaker
 @param name {string} the name 
 @param vertx {Vertx} the Vert.x instance 
 @param options {Object} the configuration option 
 @return {CircuitBreaker} the created instance
 */
CircuitBreaker.create = function() {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel) {
    return utils.convReturnVertxGen(CircuitBreaker, JCircuitBreaker.create(__args[0], __args[1]._jdel));
  }else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel && (typeof __args[2] === 'object' && __args[2] != null)) {
    return utils.convReturnVertxGen(CircuitBreaker, JCircuitBreaker.create(__args[0], __args[1]._jdel, __args[2] != null ? new CircuitBreakerOptions(new JsonObject(Java.asJSONCompatible(__args[2]))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = CircuitBreaker;