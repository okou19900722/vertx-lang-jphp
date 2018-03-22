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
import io.vertx.php.ext.unit.Async;

/**
 The test context is used for performing test assertions and manage the completion of the test. This context
 is provided by <i>vertx-unit</i> as argument of the test case.

 * @class
 */
@Name("TestContext")
@Namespace("io\\vertx\\php\\ext\\unit")
public class TestContext extends BaseWrapper<TestContext>{

  /**
   Get some data from the context.

   @public
   @param key {string} the key of the data 
   @return {Object} the data
   */
  this.get = function(key) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnTypeUnknown(j_testContext.get(key));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Put some data in the context.
   <p>
   This can be used to share data between different tests and before/after phases.

   @public
   @param key {string} the key of the data 
   @param value {Object} the data 
   @return {Object} the previous object when it exists
   */
  this.put = function(key, value) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] !== 'function') {
      return utils.convReturnTypeUnknown(j_testContext.put(key, utils.convParamTypeUnknown(value)));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove some data from the context.

   @public
   @param key {string} the key to remove 
   @return {Object} the removed object when it exists
   */
  this.remove = function(key) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnTypeUnknown(j_testContext.remove(key));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Assert the <code>expected</code> argument is <code>null</code>. If the argument is not, an assertion error is thrown
   otherwise the execution continue.

   @public
   @param expected {Object} the argument being asserted to be null 
   @param message {string} the failure message 
   @return {TestContext} a reference to this, so the API can be used fluently
   */
  this.assertNull = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] !== 'function') {
      j_testContext.assertNull(utils.convParamTypeUnknown(__args[0]));
      return that;
    }  else if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'string') {
      j_testContext.assertNull(utils.convParamTypeUnknown(__args[0]), __args[1]);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Assert the <code>expected</code> argument is not <code>null</code>. If the argument is <code>null</code>, an assertion error is thrown
   otherwise the execution continue.

   @public
   @param expected {Object} the argument being asserted to be not null 
   @param message {string} the failure message 
   @return {TestContext} a reference to this, so the API can be used fluently
   */
  this.assertNotNull = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] !== 'function') {
      j_testContext.assertNotNull(utils.convParamTypeUnknown(__args[0]));
      return that;
    }  else if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'string') {
      j_testContext.assertNotNull(utils.convParamTypeUnknown(__args[0]), __args[1]);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Assert the specified <code>condition</code> is <code>true</code>. If the condition is <code>false</code>, an assertion error is thrown
   otherwise the execution continue.

   @public
   @param condition {boolean} the condition to assert 
   @param message {string} the failure message 
   @return {TestContext} a reference to this, so the API can be used fluently
   */
  this.assertTrue = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_testContext.assertTrue(__args[0]);
      return that;
    }  else if (__args.length === 2 && typeof __args[0] ==='boolean' && typeof __args[1] === 'string') {
      j_testContext.assertTrue(__args[0], __args[1]);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Assert the specified <code>condition</code> is <code>false</code>. If the condition is <code>true</code>, an assertion error is thrown
   otherwise the execution continue.

   @public
   @param condition {boolean} the condition to assert 
   @param message {string} the failure message 
   @return {TestContext} a reference to this, so the API can be used fluently
   */
  this.assertFalse = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_testContext.assertFalse(__args[0]);
      return that;
    }  else if (__args.length === 2 && typeof __args[0] ==='boolean' && typeof __args[1] === 'string') {
      j_testContext.assertFalse(__args[0], __args[1]);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Assert the <code>expected</code> argument is equals to the <code>actual</code> argument. If the arguments are not equals
   an assertion error is thrown otherwise the execution continue.

   @public
   @param expected {Object} the object the actual object is supposedly equals to 
   @param actual {Object} the actual object to test 
   @param message {string} the failure message 
   @return {TestContext} a reference to this, so the API can be used fluently
   */
  this.assertEquals = function() {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] !== 'function') {
      j_testContext.assertEquals(utils.convParamTypeUnknown(__args[0]), utils.convParamTypeUnknown(__args[1]));
      return that;
    }  else if (__args.length === 3 && typeof __args[0] !== 'function' && typeof __args[1] !== 'function' && typeof __args[2] === 'string') {
      j_testContext.assertEquals(utils.convParamTypeUnknown(__args[0]), utils.convParamTypeUnknown(__args[1]), __args[2]);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Asserts that the <code>expected</code> double argument is equals to the <code>actual</code> double argument
   within a positive delta. If the arguments do not satisfy this, an assertion error is thrown otherwise
   the execution continue.

   @public
   @param expected {number} the object the actual object is supposedly equals to 
   @param actual {number} the actual object to test 
   @param delta {number} the maximum delta 
   @param message {string} the failure message 
   @return {TestContext} a reference to this, so the API can be used fluently
   */
  this.assertInRange = function() {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] ==='number' && typeof __args[1] ==='number' && typeof __args[2] ==='number') {
      j_testContext.assertInRange(__args[0], __args[1], __args[2]);
      return that;
    }  else if (__args.length === 4 && typeof __args[0] ==='number' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] === 'string') {
      j_testContext.assertInRange(__args[0], __args[1], __args[2], __args[3]);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Assert the <code>first</code> argument is not equals to the <code>second</code> argument. If the arguments are equals
   an assertion error is thrown otherwise the execution continue.

   @public
   @param first {Object} the first object to test 
   @param second {Object} the second object to test 
   @param message {string} the failure message 
   @return {TestContext} a reference to this, so the API can be used fluently
   */
  this.assertNotEquals = function() {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] !== 'function') {
      j_testContext.assertNotEquals(utils.convParamTypeUnknown(__args[0]), utils.convParamTypeUnknown(__args[1]));
      return that;
    }  else if (__args.length === 3 && typeof __args[0] !== 'function' && typeof __args[1] !== 'function' && typeof __args[2] === 'string') {
      j_testContext.assertNotEquals(utils.convParamTypeUnknown(__args[0]), utils.convParamTypeUnknown(__args[1]), __args[2]);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Execute the provided handler, which may contain assertions, possibly from any third-party assertion framework.
   Any AssertionError thrown will be caught (and propagated) in order to fulfill potential expected async
   completeness.

   @public
   @param block {function} block of code to be executed 
   @return {TestContext} a reference to this, so the API can be used fluently
   */
  this.verify = function(block) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_testContext.verify(block);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Throw a failure with the specified failure <code>cause</code>.

   @public
   @param cause {todo} the failure cause 
   */
  this.fail = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_testContext.fail();
    }  else if (__args.length === 1 && typeof __args[0] === 'string') {
      j_testContext.fail(__args[0]);
    }  else if (__args.length === 1 && typeof __args[0] === 'object') {
      j_testContext.fail(utils.convParamThrowable(__args[0]));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create and returns a new async object, the returned async controls the completion of the test. This async operation
   completes when the {@link Async#countDown} is called <code>count</code> times.<p/>
  
   The test case will complete when all the async objects have their {@link Async#complete}
   method called at least once.<p/>
  
   This method shall be used for creating asynchronous exit points for the executed test.<p/>

   @public
   @param count {number} 
   @return {Async} the async instance
   */
  this.async = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(Async, j_testContext.async());
    }  else if (__args.length === 1 && typeof __args[0] ==='number') {
      return utils.convReturnVertxGen(Async, j_testContext.async(__args[0]));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create and returns a new async object, the returned async controls the completion of the test.
   This async operation completes when the {@link Async#countDown} is called <code>count</code> times.<p/>
   If {@link Async#countDown} is called more than <code>count</code> times, an IllegalStateException is thrown.<p/>
  
   The test case will complete when all the async objects have their {@link Async#complete}
   method called at least once.<p/>
  
   This method shall be used for creating asynchronous exit points for the executed test.<p/>

   @public
   @param count {number} 
   @return {Async} the async instance
   */
  this.strictAsync = function(count) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      return utils.convReturnVertxGen(Async, j_testContext.strictAsync(count));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Creates and returns a new async handler, the returned handler controls the completion of the test.<p/>
  
   When the returned handler is called back with a succeeded result it invokes the <code>resultHandler</code> argument
   with the async result. The test completes after the result handler is invoked and does not fails.<p/>
  
   When the returned handler is called back with a failed result it fails the test with the cause of the failure.<p/>
  
   Note that the result handler can create other async objects during its invocation that would postpone
   the completion of the test case until those objects are resolved.

   @public
   @param resultHandler {function} the result handler 
   @return {function} the async result handler
   */
  this.asyncAssertSuccess = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnHandlerAsyncResult(j_testContext.asyncAssertSuccess(), function(result) { return utils.convParamTypeUnknown(result); });
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      return utils.convReturnHandlerAsyncResult(j_testContext.asyncAssertSuccess(function(jVal) {
      resultHandler(utils.convReturnTypeUnknown(jVal));
    }), function(result) { return utils.convParamTypeUnknown(result); });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Creates and returns a new async handler, the returned handler controls the completion of the test.<p/>
  
   When the returned handler is called back with a failed result it completes the async operation.<p/>
  
   When the returned handler is called back with a succeeded result it fails the test.<p/>

   @public
   @param causeHandler {function} the cause handler 
   @return {function} the async result handler
   */
  this.asyncAssertFailure = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnHandlerAsyncResult(j_testContext.asyncAssertFailure(), function(result) { return utils.convParamTypeUnknown(result); });
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      return utils.convReturnHandlerAsyncResult(j_testContext.asyncAssertFailure(function(jVal) {
      causeHandler(utils.convReturnThrowable(jVal));
    }), function(result) { return utils.convParamTypeUnknown(result); });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {function} an exception handler that will fail this context
   */
  this.exceptionHandler = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnHandler(j_testContext.exceptionHandler(), function(result) { return utils.convParamThrowable(result); });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_testContext;
};

TestContext._jclass = utils.getJavaClass("io.vertx.ext.unit.TestContext");
TestContext._jtype = {
  accept: function(obj) {
    return TestContext._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(TestContext.prototype, {});
    TestContext.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
TestContext._create = function(jdel) {
  var obj = Object.create(TestContext.prototype, {});
  TestContext.apply(obj, arguments);
  return obj;
}
module.exports = TestContext;