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

package io.vertx.php.ext.healthchecks;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.Future;

/**

 * @class
 */
@Name("HealthChecks")
@Namespace("io\\vertx\\php\\ext\\healthchecks")
public class HealthChecks extends BaseWrapper<HealthChecks>{

  /**
   Registers a health check procedure.
   <p>
   The procedure is a  taking a  of <a href="../../dataobjects.html#Status">Status</a> as parameter.
   Procedures are asynchronous, and <strong>must</strong> complete or fail the given .
   If the future object is failed, the procedure outcome is considered as `DOWN`. If the future is
   completed without any object, the procedure outcome is considered as `UP`. If the future is completed
   with a (not-null) <a href="../../dataobjects.html#Status">Status</a>, the procedure outcome is the received status.

   @public
   @param name {string} the name of the procedure, must not be <code>null</code> or empty 
   @param timeout {number} the procedure timeout in milliseconds 
   @param procedure {function} the procedure, must not be <code>null</code> 
   @return {HealthChecks} the current {@link HealthChecks}
   */
  this.register = function() {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_healthChecks.register(__args[0], function(jVal) {
      __args[1](utils.convReturnVertxGen(Future, jVal, undefined));
    });
      return that;
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      return utils.convReturnVertxGen(HealthChecks, j_healthChecks.register(__args[0], __args[1], function(jVal) {
      __args[2](utils.convReturnVertxGen(Future, jVal, undefined));
    }));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Unregisters a procedure.

   @public
   @param name {string} the name of the procedure 
   @return {HealthChecks} the current {@link HealthChecks}
   */
  this.unregister = function(name) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_healthChecks.unregister(name);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Invokes the registered procedure with the given name and sub-procedures. It computes the overall
   outcome.

   @public
   @param name {string} 
   @param resultHandler {function} the result handler, must not be <code>null</code>. The handler received an  marked as failed if the procedure with the given name cannot be found or invoked. 
   @return {HealthChecks} the current {@link HealthChecks}
   */
  this.invoke = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_healthChecks.invoke(function(jVal) {
      __args[0](utils.convReturnJson(jVal));
    });
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_healthChecks.invoke(__args[0], function(ar) {
      if (ar.succeeded()) {
        __args[1](utils.convReturnJson(ar.result()), null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_healthChecks;
};

HealthChecks._jclass = utils.getJavaClass("io.vertx.ext.healthchecks.HealthChecks");
HealthChecks._jtype = {
  accept: function(obj) {
    return HealthChecks._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(HealthChecks.prototype, {});
    HealthChecks.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
HealthChecks._create = function(jdel) {
  var obj = Object.create(HealthChecks.prototype, {});
  HealthChecks.apply(obj, arguments);
  return obj;
}
/**
 Creates a new instance of the default implementation of {@link HealthChecks}.

 @memberof module:vertx-health-checks-js/health_checks
 @param vertx {Vertx} the instance of Vert.x, must not be <code>null</code> 
 @return {HealthChecks} the created instance
 */
HealthChecks.create = function(vertx) {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(HealthChecks, JHealthChecks.create(vertx._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = HealthChecks;