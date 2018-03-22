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

package io.vertx.php.ext.shell.system;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.shell.term.Tty;
import io.vertx.php.ext.shell.session.Session;

/**
 A process managed by the shell.

 * @class
 */
@Name("Process")
@Namespace("io\\vertx\\php\\ext\\shell\\system")
public class Process extends BaseWrapper<Process>{

  /**

   @public

   @return {Object} the current process status
   */
  this.status = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnEnum(j_process.status());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the process exit code when the status is  otherwise <code>null</code>
   */
  this.exitCode = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_process.exitCode();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the process tty.

   @public
   @param tty {Tty} the process tty 
   @return {Process} this object
   */
  this.setTty = function(tty) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_process.setTty(tty._jdel);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Tty} the process tty
   */
  this.getTty = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedgetTty == null) {
        that.cachedgetTty = utils.convReturnVertxGen(Tty, j_process.getTty());
      }
      return that.cachedgetTty;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the process session

   @public
   @param session {Session} the process session 
   @return {Process} this object
   */
  this.setSession = function(session) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_process.setSession(session._jdel);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Session} the process session
   */
  this.getSession = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedgetSession == null) {
        that.cachedgetSession = utils.convReturnVertxGen(Session, j_process.getSession());
      }
      return that.cachedgetSession;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set an handler for being notified when the process terminates.

   @public
   @param handler {function} the handler called when the process terminates. 
   @return {Process} this object
   */
  this.terminatedHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_process.terminatedHandler(function(jVal) {
      handler(jVal);
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Run the process.
  

   @public
   @param foregraound {boolean} 
   */
  this.run = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_process.run();
    }  else if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_process.run(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Attempt to interrupt the process.

   @public
   @param completionHandler {function} handler called after interrupt callback 
   @return {boolean} true if the process caught the signal
   */
  this.interrupt = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_process.interrupt();
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      return j_process.interrupt(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Suspend the process.

   @public
   @param foreground {boolean} 
   @param completionHandler {function} handler called after resume callback 
   */
  this.resume = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_process.resume();
    }  else if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_process.resume(__args[0]);
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      j_process.resume(__args[0]);
    }  else if (__args.length === 2 && typeof __args[0] ==='boolean' && typeof __args[1] === 'function') {
      j_process.resume(__args[0], __args[1]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Resume the process.

   @public
   @param completionHandler {function} handler called after suspend callback 
   */
  this.suspend = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_process.suspend();
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      j_process.suspend(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Terminate the process.

   @public
   @param completionHandler {function} handler called after end callback 
   */
  this.terminate = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_process.terminate();
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      j_process.terminate(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the process in background.

   @public
   @param completionHandler {function} handler called after background callback 
   */
  this.toBackground = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_process.toBackground();
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      j_process.toBackground(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the process in foreground.

   @public
   @param completionHandler {function} handler called after foreground callback 
   */
  this.toForeground = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_process.toForeground();
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      j_process.toForeground(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_process;
};

Process._jclass = utils.getJavaClass("io.vertx.ext.shell.system.Process");
Process._jtype = {
  accept: function(obj) {
    return Process._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(Process.prototype, {});
    Process.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
Process._create = function(jdel) {
  var obj = Object.create(Process.prototype, {});
  Process.apply(obj, arguments);
  return obj;
}
module.exports = Process;