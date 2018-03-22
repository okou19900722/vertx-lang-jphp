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

/**
 A failure provides the details of a failure that happened during the execution of a test case.<p/>

 The failure can be:
 <ul>
   <li>an assertion failure: an assertion failed</li>
   <li>an error failure: an expected error occured</li>
 </ul>


 * @class
 */
@Name("Failure")
@Namespace("io\\vertx\\php\\ext\\unit\\report")
public class Failure extends BaseWrapper<Failure>{

  /**

   @public

   @return {boolean} true if the failure is an error failure otherwise it is an assertion failure
   */
  this.isError = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedisError == null) {
        that.cachedisError = j_failure.isError();
      }
      return that.cachedisError;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string} the error message
   */
  this.message = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedmessage == null) {
        that.cachedmessage = j_failure.message();
      }
      return that.cachedmessage;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string} the stack trace
   */
  this.stackTrace = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedstackTrace == null) {
        that.cachedstackTrace = j_failure.stackTrace();
      }
      return that.cachedstackTrace;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_failure;
};

Failure._jclass = utils.getJavaClass("io.vertx.ext.unit.report.Failure");
Failure._jtype = {
  accept: function(obj) {
    return Failure._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(Failure.prototype, {});
    Failure.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
Failure._create = function(jdel) {
  var obj = Object.create(Failure.prototype, {});
  Failure.apply(obj, arguments);
  return obj;
}
module.exports = Failure;