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

package io.vertx.php.ext.web;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.web.ParsedHeaderValue;
import io.vertx.php.ext.web.MIMEHeader;
import io.vertx.php.ext.web.LanguageHeader;

/**
 A container with the request's headers that are meaningful enough to be parsed
 Contains:
 <ul>
 <li>Accept -> MIME header, parameters and sortable</li>
 <li>Accept-Charset -> Parameters and sortable</li>
 <li>Accept-Encoding -> Parameters and sortable</li>
 <li>Accept-Language -> Parameters and sortable</li>
 <li>Content-Type -> MIME header and parameters</li>
 </ul>


 * @class
 */
@Name("ParsedHeaderValues")
@Namespace("io\\vertx\\php\\ext\\web")
public class ParsedHeaderValues extends BaseWrapper<ParsedHeaderValues>{

  /**

   @public

   @return {Array.<MIMEHeader>} List of MIME values in the <code>Accept</code> header
   */
  this.accept = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnListSetVertxGen(j_parsedHeaderValues.accept(), MIMEHeader);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Array.<ParsedHeaderValue>} List of charset values in the <code>Accept-Charset</code> header
   */
  this.acceptCharset = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnListSetVertxGen(j_parsedHeaderValues.acceptCharset(), ParsedHeaderValue);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Array.<ParsedHeaderValue>} List of encofing values in the <code>Accept-Encoding</code> header
   */
  this.acceptEncoding = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnListSetVertxGen(j_parsedHeaderValues.acceptEncoding(), ParsedHeaderValue);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Array.<LanguageHeader>} List of languages in the <code>Accept-Language</code> header
   */
  this.acceptLanguage = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnListSetVertxGen(j_parsedHeaderValues.acceptLanguage(), LanguageHeader);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {MIMEHeader} MIME value in the <code>Content-Type</code> header
   */
  this.contentType = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(MIMEHeader, j_parsedHeaderValues.contentType());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_parsedHeaderValues;
};

ParsedHeaderValues._jclass = utils.getJavaClass("io.vertx.ext.web.ParsedHeaderValues");
ParsedHeaderValues._jtype = {
  accept: function(obj) {
    return ParsedHeaderValues._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(ParsedHeaderValues.prototype, {});
    ParsedHeaderValues.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
ParsedHeaderValues._create = function(jdel) {
  var obj = Object.create(ParsedHeaderValues.prototype, {});
  ParsedHeaderValues.apply(obj, arguments);
  return obj;
}
module.exports = ParsedHeaderValues;