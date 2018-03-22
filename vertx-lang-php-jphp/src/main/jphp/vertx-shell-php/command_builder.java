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
import io.vertx.php.ext.shell.cli.Completion;
import io.vertx.php.core.cli.CLI;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.shell.command.CommandProcess;

/**
 A build for Vert.x Shell command.

 * @class
 */
@Name("CommandBuilder")
@Namespace("io\\vertx\\php\\ext\\shell\\command")
public class CommandBuilder extends BaseWrapper<CommandBuilder>{

  /**
   Set the command process handler, the process handler is called when the command is executed.

   @public
   @param handler {function} the process handler 
   @return {CommandBuilder} this command object
   */
  this.processHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_commandBuilder.processHandler(function(jVal) {
      handler(utils.convReturnVertxGen(CommandProcess, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the command completion handler, the completion handler when the user asks for contextual command line
   completion, usually hitting the <i>tab</i> key.

   @public
   @param handler {function} the completion handler 
   @return {CommandBuilder} this command object
   */
  this.completionHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_commandBuilder.completionHandler(function(jVal) {
      handler(utils.convReturnVertxGen(Completion, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Build the command

   @public
   @param vertx {Vertx} the vertx instance 
   @return {Command} the built command
   */
  this.build = function(vertx) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      return utils.convReturnVertxGen(Command, j_commandBuilder.build(vertx._jdel));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_commandBuilder;
};

CommandBuilder._jclass = utils.getJavaClass("io.vertx.ext.shell.command.CommandBuilder");
CommandBuilder._jtype = {
  accept: function(obj) {
    return CommandBuilder._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(CommandBuilder.prototype, {});
    CommandBuilder.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
CommandBuilder._create = function(jdel) {
  var obj = Object.create(CommandBuilder.prototype, {});
  CommandBuilder.apply(obj, arguments);
  return obj;
}
/**
 Create a new commmand with its {@link CLI} descriptor. This command can then retrieve the parsed
 {@link CommandProcess#commandLine} when it executes to know get the command arguments and options.

 @memberof module:vertx-shell-js/command_builder
 @param cli {CLI} the cli to use 
 @return {CommandBuilder} the command
 */
CommandBuilder.command = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'string') {
    return utils.convReturnVertxGen(CommandBuilder, JCommandBuilder.command(__args[0]));
  }else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(CommandBuilder, JCommandBuilder.command(__args[0]._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = CommandBuilder;