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

package io.vertx.php.ext.mail;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;

/**
 SMTP mail client for Vert.x
 <p>
 A simple asynchronous API for sending mails from Vert.x applications

 * @class
 */
@Name("MailClient")
@Namespace("io\\vertx\\php\\ext\\mail")
public class MailClient extends BaseWrapper<MailClient>{

  /**
   send a single mail via MailClient

   @public
   @param email {Object} MailMessage object containing the mail text, from/to, attachments etc 
   @param resultHandler {function} will be called when the operation is finished or it fails (may be null to ignore the result) 
   @return {MailClient} this MailClient instance so the method can be used fluently
   */
  this.sendMail = function(email, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_mailClient.sendMail(email != null ? new MailMessage(new JsonObject(Java.asJSONCompatible(email))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   close the MailClient

   @public

   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_mailClient.close();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_mailClient;
};

MailClient._jclass = utils.getJavaClass("io.vertx.ext.mail.MailClient");
MailClient._jtype = {
  accept: function(obj) {
    return MailClient._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(MailClient.prototype, {});
    MailClient.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
MailClient._create = function(jdel) {
  var obj = Object.create(MailClient.prototype, {});
  MailClient.apply(obj, arguments);
  return obj;
}
/**
 create a non shared instance of the mail client

 @memberof module:vertx-mail-js/mail_client
 @param vertx {Vertx} the Vertx instance the operation will be run in 
 @param config {Object} MailConfig configuration to be used for sending mails 
 @return {MailClient} MailClient instance that can then be used to send multiple mails
 */
MailClient.createNonShared = function(vertx, config) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(MailClient, JMailClient.createNonShared(vertx._jdel, config != null ? new MailConfig(new JsonObject(Java.asJSONCompatible(config))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Create a Mail client which shares its data source with any other Mongo clients created with the same
 pool name

 @memberof module:vertx-mail-js/mail_client
 @param vertx {Vertx} the Vert.x instance 
 @param config {Object} the configuration 
 @param poolName {string} the pool name 
 @return {MailClient} the client
 */
MailClient.createShared = function() {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(MailClient, JMailClient.createShared(__args[0]._jdel, __args[1] != null ? new MailConfig(new JsonObject(Java.asJSONCompatible(__args[1]))) : null));
  }else if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'string') {
    return utils.convReturnVertxGen(MailClient, JMailClient.createShared(__args[0]._jdel, __args[1] != null ? new MailConfig(new JsonObject(Java.asJSONCompatible(__args[1]))) : null, __args[2]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = MailClient;