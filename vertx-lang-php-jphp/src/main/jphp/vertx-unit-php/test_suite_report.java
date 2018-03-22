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

package io.vertx.php.ext.unit.report;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.ext.unit.report.TestCaseReport;

/**
 The test suite reports is basically a stream of events reporting the test suite execution.

 * @class
 */
@Name("TestSuiteReport")
@Namespace("io\\vertx\\php\\ext\\unit\\report")
public class TestSuiteReport extends BaseWrapper<TestSuiteReport>{
  ReadStream.call(this, j_val);

  /**

   @public

   @return {string} the test suite name
   */
  this.name = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedname == null) {
        that.cachedname = j_testSuiteReport.name();
      }
      return that.cachedname;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set an exception handler, the exception handler reports the test suite errors, it can be called mulitple
   times before the test ends.

   @public
   @param handler {function} the exception handler 
   @return {TestSuiteReport} a reference to this, so the API can be used fluently
   */
  this.exceptionHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_testSuiteReport.exceptionHandler(handler == null ? null : function(jVal) {
      handler(utils.convReturnThrowable(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {TestSuiteReport}
   */
  this.handler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_testSuiteReport.handler(handler == null ? null : function(jVal) {
      handler(utils.convReturnVertxGen(TestCaseReport, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {TestSuiteReport}
   */
  this.pause = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_testSuiteReport.pause();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {TestSuiteReport}
   */
  this.resume = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_testSuiteReport.resume();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param endHandler {function} 
   @return {TestSuiteReport}
   */
  this.endHandler = function(endHandler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_testSuiteReport.endHandler(endHandler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_testSuiteReport;
};

TestSuiteReport._jclass = utils.getJavaClass("io.vertx.ext.unit.report.TestSuiteReport");
TestSuiteReport._jtype = {
  accept: function(obj) {
    return TestSuiteReport._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(TestSuiteReport.prototype, {});
    TestSuiteReport.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
TestSuiteReport._create = function(jdel) {
  var obj = Object.create(TestSuiteReport.prototype, {});
  TestSuiteReport.apply(obj, arguments);
  return obj;
}
module.exports = TestSuiteReport;