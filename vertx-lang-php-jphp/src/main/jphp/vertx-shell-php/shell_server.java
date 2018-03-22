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

package io.vertx.php.ext.shell;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.shell.term.TermServer;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.shell.Shell;
import io.vertx.php.ext.shell.command.CommandResolver;
import io.vertx.php.ext.shell.term.Term;

/**
 The shell server.<p/>

 * @class
 */
@Name("ShellServer")
@Namespace("io\\vertx\\php\\ext\\shell")
public class ShellServer extends BaseWrapper<ShellServer>{

  /**
   Register a command resolver for this server.

   @public
   @param resolver {CommandResolver} the resolver 
   @return {ShellServer} a reference to this, so the API can be used fluently
   */
  this.registerCommandResolver = function(resolver) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_shellServer.registerCommandResolver(resolver._jdel);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Register a term server to this shell server, the term server lifecycle methods are managed by this shell server.

   @public
   @param termServer {TermServer} the term server to add 
   @return {ShellServer} a reference to this, so the API can be used fluently
   */
  this.registerTermServer = function(termServer) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_shellServer.registerTermServer(termServer._jdel);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create a new shell, the returned shell should be closed explicitely.

   @public
   @param term {Term} the shell associated terminal 
   @return {Shell} the created shell
   */
  this.createShell = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(Shell, j_shellServer.createShell());
    }  else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      return utils.convReturnVertxGen(Shell, j_shellServer.createShell(__args[0]._jdel));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Start the shell service, this is an asynchronous start.

   @public
   @param listenHandler {function} handler for getting notified when service is started 
   @return {ShellServer}
   */
  this.listen = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_shellServer.listen();
      return that;
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      j_shellServer.listen(function(ar) {
      if (ar.succeeded()) {
        __args[0](null, null);
      } else {
        __args[0](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Close the shell server, this is an asynchronous close.

   @public
   @param completionHandler {function} handler for getting notified when service is stopped 
   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_shellServer.close();
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      j_shellServer.close(function(ar) {
      if (ar.succeeded()) {
        __args[0](null, null);
      } else {
        __args[0](null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_shellServer;
};

ShellServer._jclass = utils.getJavaClass("io.vertx.ext.shell.ShellServer");
ShellServer._jtype = {
  accept: function(obj) {
    return ShellServer._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(ShellServer.prototype, {});
    ShellServer.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
ShellServer._create = function(jdel) {
  var obj = Object.create(ShellServer.prototype, {});
  ShellServer.apply(obj, arguments);
  return obj;
}
/**
 Create a new shell server with default options.

 @memberof module:vertx-shell-js/shell_server
 @param vertx {Vertx} the vertx 
 @param options {Object} the options 
 @return {ShellServer} the created shell server
 */
ShellServer.create = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(ShellServer, JShellServer.create(__args[0]._jdel));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(ShellServer, JShellServer.create(__args[0]._jdel, __args[1] != null ? new ShellServerOptions(new JsonObject(Java.asJSONCompatible(__args[1]))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = ShellServer;