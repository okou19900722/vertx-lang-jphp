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

/**
 A resolver for commands, so the shell can discover commands.

 * @class
 */
@Name("CommandResolver")
@Namespace("io\\vertx\\php\\ext\\shell\\command")
public class CommandResolver extends BaseWrapper<CommandResolver>{

  /**

   @public

   @return {Array.<Command>} the current commands
   */
  this.commands = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnListSetVertxGen(j_commandResolver.commands(), Command);
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
      return utils.convReturnVertxGen(Command, j_commandResolver.getCommand(name));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_commandResolver;
};

CommandResolver._jclass = utils.getJavaClass("io.vertx.ext.shell.command.CommandResolver");
CommandResolver._jtype = {
  accept: function(obj) {
    return CommandResolver._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(CommandResolver.prototype, {});
    CommandResolver.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
CommandResolver._create = function(jdel) {
  var obj = Object.create(CommandResolver.prototype, {});
  CommandResolver.apply(obj, arguments);
  return obj;
}
/**

 @memberof module:vertx-shell-js/command_resolver
 @param vertx {Vertx} 
 @return {CommandResolver} the base commands of Vert.x Shell.
 */
CommandResolver.baseCommands = function(vertx) {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(CommandResolver, JCommandResolver.baseCommands(vertx._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = CommandResolver;