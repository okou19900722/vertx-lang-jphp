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

package io.vertx.php.ext.auth.mongo;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.auth.User;

/**
 Determines how the hashing is computed in the implementation You can implement this to provide a different hashing
 strategy to the default.

 * @class
 */
@Name("HashStrategy")
@Namespace("io\\vertx\\php\\ext\\auth\\mongo")
public class HashStrategy extends BaseWrapper<HashStrategy>{

  /**
   Compute the hashed password given the unhashed password and the user

   @public
   @param password {string} the unhashed password 
   @param user {User} the user to get the salt for. This paramter is needed, if the  is declared to be used 
   @return {string} the hashed password
   */
  this.computeHash = function(password, user) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel) {
      return j_hashStrategy.computeHash(password, user._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Retrieve the password from the user, or as clear text or as hashed version, depending on the definition

   @public
   @param user {User} the user to get the stored password for 
   @return {string} the password, either as hashed version or as cleartext, depending on the preferences
   */
  this.getStoredPwd = function(user) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      return j_hashStrategy.getStoredPwd(user._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Retrieve the salt. The source of the salt can be the external salt or the propriate column of the given user,
   depending on the defined <a href="../../enums.html#HashSaltStyle">HashSaltStyle</a>

   @public
   @param user {User} the user to get the salt for. This paramter is needed, if the  is declared to be used 
   @return {string} null in case of  the salt of the user or a defined external salt
   */
  this.getSalt = function(user) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      return j_hashStrategy.getSalt(user._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set an external salt. This method should be used in case of 

   @public
   @param salt {string} the salt, which shall be used 
   */
  this.setExternalSalt = function(salt) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_hashStrategy.setExternalSalt(salt);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the saltstyle as defined by <a href="../../enums.html#HashSaltStyle">HashSaltStyle</a>.

   @public
   @param saltStyle {Object} the <a href="../../enums.html#HashSaltStyle">HashSaltStyle</a> to be used 
   */
  this.setSaltStyle = function(saltStyle) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_hashStrategy.setSaltStyle(io.vertx.ext.auth.mongo.HashSaltStyle.valueOf(saltStyle));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the defined <a href="../../enums.html#HashSaltStyle">HashSaltStyle</a> of the current instance

   @public

   @return {Object} the saltStyle
   */
  this.getSaltStyle = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnEnum(j_hashStrategy.getSaltStyle());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Allows the selection of the hashing algorithm.

   @public
   @param algorithm {Object} the choosen algorithm 
   */
  this.setAlgorithm = function(algorithm) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_hashStrategy.setAlgorithm(io.vertx.ext.auth.mongo.HashAlgorithm.valueOf(algorithm));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_hashStrategy;
};

HashStrategy._jclass = utils.getJavaClass("io.vertx.ext.auth.mongo.HashStrategy");
HashStrategy._jtype = {
  accept: function(obj) {
    return HashStrategy._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(HashStrategy.prototype, {});
    HashStrategy.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
HashStrategy._create = function(jdel) {
  var obj = Object.create(HashStrategy.prototype, {});
  HashStrategy.apply(obj, arguments);
  return obj;
}
module.exports = HashStrategy;