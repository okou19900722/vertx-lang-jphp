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

package io.vertx.php.ext.shell.term;
import io.vertx.lang.php.util.Wrapper;

/**
 Provide interactions with the Shell TTY.

 * @class
 */
@Name("Tty")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
public class Tty extends BaseWrapper<Tty>{

  /**

   @public

   @return {string} the declared tty type, for instance , , etc... it can be null when the tty does not have declared its type.
   */
  this.type = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_tty.type();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the current width, i.e the number of rows or  if unknown
   */
  this.width = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_tty.width();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the current height, i.e the number of columns or  if unknown
   */
  this.height = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_tty.height();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a stream handler on the standard input to read the data.

   @public
   @param handler {function} the standard input 
   @return {Tty} this object
   */
  this.stdinHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_tty.stdinHandler(function(jVal) {
      handler(jVal);
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Write data to the standard output.

   @public
   @param data {string} the data to write 
   @return {Tty} this object
   */
  this.write = function(data) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_tty.write(data);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a resize handler, the handler is called when the tty size changes.

   @public
   @param handler {function} the resize handler 
   @return {Tty} this object
   */
  this.resizehandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_tty.resizehandler(handler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_tty;
};

Tty._jclass = utils.getJavaClass("io.vertx.ext.shell.term.Tty");
Tty._jtype = {
  accept: function(obj) {
    return Tty._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(Tty.prototype, {});
    Tty.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
Tty._create = function(jdel) {
  var obj = Object.create(Tty.prototype, {});
  Tty.apply(obj, arguments);
  return obj;
}
module.exports = Tty;