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

 * @class
 */
@Name("BodyHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public class BodyHandler extends BaseWrapper<BodyHandler>{

  /**
   Something has happened, so handle it.

   @public
   @param event {RoutingContext} the event to handle 
   */
  this.handle = function(event) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_bodyHandler.handle(event._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the maximum body size -1 means unlimited

   @public
   @param bodyLimit {number} the max size 
   @return {BodyHandler} reference to this for fluency
   */
  this.setBodyLimit = function(bodyLimit) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_bodyHandler.setBodyLimit(bodyLimit);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the uploads directory to use

   @public
   @param uploadsDirectory {string} the uploads directory 
   @return {BodyHandler} reference to this for fluency
   */
  this.setUploadsDirectory = function(uploadsDirectory) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_bodyHandler.setUploadsDirectory(uploadsDirectory);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set whether form attributes will be added to the request parameters

   @public
   @param mergeFormAttributes {boolean} true if they should be merged 
   @return {BodyHandler} reference to this for fluency
   */
  this.setMergeFormAttributes = function(mergeFormAttributes) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_bodyHandler.setMergeFormAttributes(mergeFormAttributes);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set whether uploaded files should be removed after handling the request

   @public
   @param deleteUploadedFilesOnEnd {boolean} true if uploaded files should be removed after handling the request 
   @return {BodyHandler} reference to this for fluency
   */
  this.setDeleteUploadedFilesOnEnd = function(deleteUploadedFilesOnEnd) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_bodyHandler.setDeleteUploadedFilesOnEnd(deleteUploadedFilesOnEnd);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_bodyHandler;
};

BodyHandler._jclass = utils.getJavaClass("io.vertx.ext.web.handler.BodyHandler");
BodyHandler._jtype = {
  accept: function(obj) {
    return BodyHandler._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(BodyHandler.prototype, {});
    BodyHandler.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
BodyHandler._create = function(jdel) {
  var obj = Object.create(BodyHandler.prototype, {});
  BodyHandler.apply(obj, arguments);
  return obj;
}
/**
 Create a body handler and use the given upload directory.

 @memberof module:vertx-web-js/body_handler
 @param uploadDirectory {string} the uploads directory 
 @return {BodyHandler} the body handler
 */
BodyHandler.create = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(BodyHandler, JBodyHandler.create());
  }else if (__args.length === 1 && typeof __args[0] === 'string') {
    return utils.convReturnVertxGen(BodyHandler, JBodyHandler.create(__args[0]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = BodyHandler;