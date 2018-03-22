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

/**

 * @class
 */
@Name("Locale")
@Namespace("io\\vertx\\php\\ext\\web")
public class Locale extends BaseWrapper<Locale>{

  /**
   Returns the language as reported by the HTTP client.

   @public

   @return {string} language
   */
  this.language = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_locale.language();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the country as reported by the HTTP client.

   @public

   @return {string} variant
   */
  this.country = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_locale.country();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the variant as reported by the HTTP client.

   @public

   @return {string} variant
   */
  this.variant = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_locale.variant();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_locale;
};

Locale._jclass = utils.getJavaClass("io.vertx.ext.web.Locale");
Locale._jtype = {
  accept: function(obj) {
    return Locale._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(Locale.prototype, {});
    Locale.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
Locale._create = function(jdel) {
  var obj = Object.create(Locale.prototype, {});
  Locale.apply(obj, arguments);
  return obj;
}
/**

 @memberof module:vertx-web-js/locale
 @param language {string} 
 @param country {string} 
 @param variant {string} 
 @return {Locale}
 */
Locale.create = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(Locale, JLocale.create());
  }else if (__args.length === 1 && typeof __args[0] === 'string') {
    return utils.convReturnVertxGen(Locale, JLocale.create(__args[0]));
  }else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
    return utils.convReturnVertxGen(Locale, JLocale.create(__args[0], __args[1]));
  }else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string') {
    return utils.convReturnVertxGen(Locale, JLocale.create(__args[0], __args[1], __args[2]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = Locale;