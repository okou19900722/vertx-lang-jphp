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

package io.vertx.php.ext.shell.session;
import io.vertx.lang.php.util.Wrapper;

/**
 A shell session.

 * @class
 */
@Name("Session")
@Namespace("io\\vertx\\php\\ext\\shell\\session")
public class Session extends BaseWrapper<Session>{

  /**
   Put some data in a session

   @public
   @param key {string} the key for the data 
   @param obj {Object} the data 
   @return {Session} a reference to this, so the API can be used fluently
   */
  this.put = function(key, obj) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] !== 'function') {
      j_session.put(key, utils.convParamTypeUnknown(obj));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get some data from the session

   @public
   @param key {string} the key of the data 
   @return {Object} the data
   */
  this.get = function(key) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnTypeUnknown(j_session.get(key));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove some data from the session

   @public
   @param key {string} the key of the data 
   @return {Object} the data that was there or null if none there
   */
  this.remove = function(key) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnTypeUnknown(j_session.remove(key));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_session;
};

Session._jclass = utils.getJavaClass("io.vertx.ext.shell.session.Session");
Session._jtype = {
  accept: function(obj) {
    return Session._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(Session.prototype, {});
    Session.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
Session._create = function(jdel) {
  var obj = Object.create(Session.prototype, {});
  Session.apply(obj, arguments);
  return obj;
}
/**
 Create a new empty session.

 @memberof module:vertx-shell-js/session

 @return {Session} the created session
 */
Session.create = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(Session, JSession.create());
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = Session;