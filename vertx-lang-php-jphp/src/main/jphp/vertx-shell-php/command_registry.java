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

package io.vertx.php.ext.shell.command;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.shell.command.Command;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.shell.command.CommandResolver;

/**
 A registry that contains the commands known by a shell.<p/>

 It is a mutable command resolver.


 * @class
 */
@Name("CommandRegistry")
@Namespace("io\\vertx\\php\\ext\\shell\\command")
public class CommandRegistry extends BaseWrapper<CommandRegistry>{
  CommandResolver.call(this, j_val);

  /**

   @public

   @return {Array.<Command>} the current commands
   */
  this.commands = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnListSetVertxGen(j_commandRegistry.commands(), Command);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns a single command by its name.

   @public
   @param name {string} the command name 
   @return {Command} the commad or null
   */
  this.getCommand = function(name) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(Command, j_commandRegistry.getCommand(name));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Register a command

   @public
   @param command {Command} the command to register 
   @param completionHandler {function} notified when the command is registered 
   @return {CommandRegistry} a reference to this, so the API can be used fluently
   */
  this.registerCommand = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_commandRegistry.registerCommand(__args[0]._jdel);
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'function') {
      j_commandRegistry.registerCommand(__args[0]._jdel, function(ar) {
      if (ar.succeeded()) {
        __args[1](utils.convReturnVertxGen(Command, ar.result()), null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Register a list of commands.

   @public
   @param commands {Array.<Command>} the commands to register 
   @param completionHandler {function} notified when the command is registered 
   @return {CommandRegistry} a reference to this, so the API can be used fluently
   */
  this.registerCommands = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      j_commandRegistry.registerCommands(utils.convParamListVertxGen(__args[0]));
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_commandRegistry.registerCommands(utils.convParamListVertxGen(__args[0]), function(ar) {
      if (ar.succeeded()) {
        __args[1](utils.convReturnListSetVertxGen(ar.result(), Command), null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Unregister a command.

   @public
   @param commandName {string} the command name 
   @param completionHandler {function} notified when the command is unregistered 
   @return {CommandRegistry} a reference to this, so the API can be used fluently
   */
  this.unregisterCommand = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_commandRegistry.unregisterCommand(__args[0]);
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_commandRegistry.unregisterCommand(__args[0], function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
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
  this._jdel = j_commandRegistry;
};

CommandRegistry._jclass = utils.getJavaClass("io.vertx.ext.shell.command.CommandRegistry");
CommandRegistry._jtype = {
  accept: function(obj) {
    return CommandRegistry._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(CommandRegistry.prototype, {});
    CommandRegistry.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
CommandRegistry._create = function(jdel) {
  var obj = Object.create(CommandRegistry.prototype, {});
  CommandRegistry.apply(obj, arguments);
  return obj;
}
/**
 Get the shared registry for the Vert.x instance.

 @memberof module:vertx-shell-js/command_registry
 @param vertx {Vertx} the vertx instance 
 @return {CommandRegistry} the shared registry
 */
CommandRegistry.getShared = function(vertx) {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(CommandRegistry, JCommandRegistry.getShared(vertx._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Create a new registry.

 @memberof module:vertx-shell-js/command_registry
 @param vertx {Vertx} the vertx instance 
 @return {CommandRegistry} the created registry
 */
CommandRegistry.create = function(vertx) {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(CommandRegistry, JCommandRegistry.create(vertx._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = CommandRegistry;