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

package io.vertx.php.ext.web.handler;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.web.RoutingContext;

/**
 A pretty error handler for rendering error pages.

 * @class
 */
@Name("ErrorHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public class ErrorHandler extends BaseWrapper<ErrorHandler>{

  /**
   Something has happened, so handle it.

   @public
   @param event {RoutingContext} the event to handle 
   */
  this.handle = function(event) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_errorHandler.handle(event._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_errorHandler;
};

ErrorHandler._jclass = utils.getJavaClass("io.vertx.ext.web.handler.ErrorHandler");
ErrorHandler._jtype = {
  accept: function(obj) {
    return ErrorHandler._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(ErrorHandler.prototype, {});
    ErrorHandler.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
ErrorHandler._create = function(jdel) {
  var obj = Object.create(ErrorHandler.prototype, {});
  ErrorHandler.apply(obj, arguments);
  return obj;
}
/**
 Create an error handler

 @memberof module:vertx-web-js/error_handler
 @param errorTemplateName {string} the error template name - will be looked up from the classpath 
 @param displayExceptionDetails {boolean} true if exception details should be displayed 
 @return {ErrorHandler} the handler
 */
ErrorHandler.create = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(ErrorHandler, JErrorHandler.create());
  }else if (__args.length === 1 && typeof __args[0] ==='boolean') {
    return utils.convReturnVertxGen(ErrorHandler, JErrorHandler.create(__args[0]));
  }else if (__args.length === 1 && typeof __args[0] === 'string') {
    return utils.convReturnVertxGen(ErrorHandler, JErrorHandler.create(__args[0]));
  }else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] ==='boolean') {
    return utils.convReturnVertxGen(ErrorHandler, JErrorHandler.create(__args[0], __args[1]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = ErrorHandler;