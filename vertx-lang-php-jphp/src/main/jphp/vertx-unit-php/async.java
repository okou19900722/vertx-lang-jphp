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

package io.vertx.php.ext.unit;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.unit.Completion;
import io.vertx.php.core.Future;

/**
 An asynchronous exit point for a test.<p/>

 * @class
 */
@Name("Async")
@Namespace("io\\vertx\\php\\ext\\unit")
public class Async extends BaseWrapper<Async>{
  Completion.call(this, j_val, undefined);

  /**
   Completes the future upon completion, otherwise fails it.

   @public
   @param future {Future} the future to resolve 
   */
  this.resolve = function(future) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_async.resolve(future._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} true if this completion is completed
   */
  this.isCompleted = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_async.isCompleted();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} true if this completion is completed and succeeded
   */
  this.isSucceeded = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_async.isSucceeded();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} true if the this completion is completed and failed
   */
  this.isFailed = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_async.isFailed();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Completion handler to receive a completion signal when this completions completes.

   @public
   @param completionHandler {function} the completion handler 
   */
  this.handler = function(completionHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_async.handler(function(ar) {
      if (ar.succeeded()) {
        completionHandler(null, null);
      } else {
        completionHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Cause the current thread to wait until this completion completes with a configurable timeout.<p/>
  
   If completion times out or the current thread is interrupted, an exception will be thrown.

   @public
   @param timeoutMillis {number} the timeout in milliseconds 
   */
  this.await = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_async.await();
    }  else if (__args.length === 1 && typeof __args[0] ==='number') {
      j_async.await(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Cause the current thread to wait until this completion completes and succeeds with a configurable timeout.<p/>
  
   If completion times out or the current thread is interrupted or the suite fails, an exception will be thrown.

   @public
   @param timeoutMillis {number} the timeout in milliseconds 
   */
  this.awaitSuccess = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_async.awaitSuccess();
    }  else if (__args.length === 1 && typeof __args[0] ==='number') {
      j_async.awaitSuccess(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the current count
   */
  this.count = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_async.count();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Count down the async.

   @public

   */
  this.countDown = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_async.countDown();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Signals the asynchronous operation is done, this method must be called with a count greater than <code>0</code>,
   otherwise it throws an <code>IllegalStateException</code> to signal the error.

   @public

   */
  this.complete = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_async.complete();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_async;
};

Async._jclass = utils.getJavaClass("io.vertx.ext.unit.Async");
Async._jtype = {
  accept: function(obj) {
    return Async._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(Async.prototype, {});
    Async.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
Async._create = function(jdel) {
  var obj = Object.create(Async.prototype, {});
  Async.apply(obj, arguments);
  return obj;
}
module.exports = Async;