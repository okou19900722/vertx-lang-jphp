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
import io.vertx.php.ext.unit.TestContext;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.unit.TestCompletion;

/**
 A named suite of test cases that are executed altogether. The suite suite is created with
 * @class
 */
@Name("TestSuite")
@Namespace("io\\vertx\\php\\ext\\unit")
public class TestSuite extends BaseWrapper<TestSuite>{

  /**
   Set a callback executed before the tests.

   @public
   @param callback {function} the callback 
   @return {TestSuite} a reference to this, so the API can be used fluently
   */
  this.before = function(callback) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_testSuite.before(function(jVal) {
      callback(utils.convReturnVertxGen(TestContext, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a callback executed before each test and after the suite <code>before</code> callback.

   @public
   @param callback {function} the callback 
   @return {TestSuite} a reference to this, so the API can be used fluently
   */
  this.beforeEach = function(callback) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_testSuite.beforeEach(function(jVal) {
      callback(utils.convReturnVertxGen(TestContext, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a callback executed after the tests.

   @public
   @param callback {function} the callback 
   @return {TestSuite} a reference to this, so the API can be used fluently
   */
  this.after = function(callback) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_testSuite.after(function(jVal) {
      callback(utils.convReturnVertxGen(TestContext, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a callback executed after each test and before the suite <code>after</code> callback.

   @public
   @param callback {function} the callback 
   @return {TestSuite} a reference to this, so the API can be used fluently
   */
  this.afterEach = function(callback) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_testSuite.afterEach(function(jVal) {
      callback(utils.convReturnVertxGen(TestContext, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add a new test case to the suite.

   @public
   @param name {string} the test case name 
   @param repeat {number} the number of times the test should be repeated 
   @param testCase {function} the test case 
   @return {TestSuite} a reference to this, so the API can be used fluently
   */
  this.test = function() {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_testSuite.test(__args[0], function(jVal) {
      __args[1](utils.convReturnVertxGen(TestContext, jVal));
    });
      return that;
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_testSuite.test(__args[0], __args[1], function(jVal) {
      __args[2](utils.convReturnVertxGen(TestContext, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Run the testsuite with the specified <code>options</code> and the specified <code>vertx</code> instance.<p/>
  
   The test suite will be executed on the event loop provided by the <code>vertx</code> argument when
   <a href="../../dataobjects.html#TestOptions">TestOptions</a> is not set to <code>false</code>. The returned
   {@link Completion} object can be used to get a completion callback.

   @public
   @param vertx {Vertx} the vertx instance 
   @param options {Object} the test options 
   @return {TestCompletion} the related test completion
   */
  this.run = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(TestCompletion, j_testSuite.run());
    }  else if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      return utils.convReturnVertxGen(TestCompletion, j_testSuite.run(__args[0] != null ? new TestOptions(new JsonObject(Java.asJSONCompatible(__args[0]))) : null));
    }  else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      return utils.convReturnVertxGen(TestCompletion, j_testSuite.run(__args[0]._jdel));
    }  else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
      return utils.convReturnVertxGen(TestCompletion, j_testSuite.run(__args[0]._jdel, __args[1] != null ? new TestOptions(new JsonObject(Java.asJSONCompatible(__args[1]))) : null));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_testSuite;
};

TestSuite._jclass = utils.getJavaClass("io.vertx.ext.unit.TestSuite");
TestSuite._jtype = {
  accept: function(obj) {
    return TestSuite._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(TestSuite.prototype, {});
    TestSuite.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
TestSuite._create = function(jdel) {
  var obj = Object.create(TestSuite.prototype, {});
  TestSuite.apply(obj, arguments);
  return obj;
}
/**
 Create and return a new test suite.

 @memberof module:vertx-unit-js/test_suite
 @param name {string} the test suite name 
 @return {TestSuite} the created test suite
 */
TestSuite.create = function(name) {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'string') {
    return utils.convReturnVertxGen(TestSuite, JTestSuite.create(name));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = TestSuite;