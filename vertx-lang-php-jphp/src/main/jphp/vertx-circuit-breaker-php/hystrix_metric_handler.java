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
import io.vertx.php.ext.web.RoutingContext;

/**
 A Vert.x web handler to expose the circuit breaker to the Hystrix dasbboard. The handler listens to the circuit
 breaker notifications sent on the event bus.

 * @class
 */
@Name("HystrixMetricHandler")
@Namespace("io\\vertx\\php\\circuitbreaker")
public class HystrixMetricHandler extends BaseWrapper<HystrixMetricHandler>{

  /**
   Something has happened, so handle it.

   @public
   @param event {RoutingContext} the event to handle 
   */
  this.handle = function(event) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_hystrixMetricHandler.handle(event._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_hystrixMetricHandler;
};

HystrixMetricHandler._jclass = utils.getJavaClass("io.vertx.circuitbreaker.HystrixMetricHandler");
HystrixMetricHandler._jtype = {
  accept: function(obj) {
    return HystrixMetricHandler._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(HystrixMetricHandler.prototype, {});
    HystrixMetricHandler.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
HystrixMetricHandler._create = function(jdel) {
  var obj = Object.create(HystrixMetricHandler.prototype, {});
  HystrixMetricHandler.apply(obj, arguments);
  return obj;
}
/**
 Creates the handler.

 @memberof module:vertx-circuit-breaker-js/hystrix_metric_handler
 @param vertx {Vertx} the Vert.x instance 
 @param address {string} the address to listen on the event bus 
 @return {HystrixMetricHandler} the handler
 */
HystrixMetricHandler.create = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(HystrixMetricHandler, JHystrixMetricHandler.create(__args[0]._jdel));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string') {
    return utils.convReturnVertxGen(HystrixMetricHandler, JHystrixMetricHandler.create(__args[0]._jdel, __args[1]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = HystrixMetricHandler;