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

package io.vertx.php.ext.auth.oauth2.providers;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.oauth2.OAuth2Auth;

/**

 * @class
 */
@Name("AzureADAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2\\providers")
public class AzureADAuth extends BaseWrapper<AzureADAuth>{

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_azureADAuth;
};

AzureADAuth._jclass = utils.getJavaClass("io.vertx.ext.auth.oauth2.providers.AzureADAuth");
AzureADAuth._jtype = {
  accept: function(obj) {
    return AzureADAuth._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(AzureADAuth.prototype, {});
    AzureADAuth.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
AzureADAuth._create = function(jdel) {
  var obj = Object.create(AzureADAuth.prototype, {});
  AzureADAuth.apply(obj, arguments);
  return obj;
}
/**
 Create a OAuth2Auth provider for Microsoft Azure Active Directory

 @memberof module:vertx-auth-oauth2-js/azure_ad_auth
 @param vertx {Vertx} 
 @param clientId {string} the client id given to you by Azure 
 @param clientSecret {string} the client secret given to you by Azure 
 @param guid {string} the guid of your application given to you by Azure 
 @param httpClientOptions {Object} custom http client options 
 @return {OAuth2Auth}
 */
AzureADAuth.create = function() {
  var __args = arguments;
  if (__args.length === 4 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'string') {
    return utils.convReturnVertxGen(OAuth2Auth, JAzureADAuth.create(__args[0]._jdel, __args[1], __args[2], __args[3]));
  }else if (__args.length === 5 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'string' && (typeof __args[4] === 'object' && __args[4] != null)) {
    return utils.convReturnVertxGen(OAuth2Auth, JAzureADAuth.create(__args[0]._jdel, __args[1], __args[2], __args[3], __args[4] != null ? new HttpClientOptions(new JsonObject(Java.asJSONCompatible(__args[4]))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = AzureADAuth;