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

package io.vertx.php.ext.stomp;
import io.vertx.lang.php.util.Wrapper;

/**

 * @class
 */
@Name("Acknowledgement")
@Namespace("io\\vertx\\php\\ext\\stomp")
public class Acknowledgement extends BaseWrapper<Acknowledgement>{

  /**

   @public

   @return {Object} the subscription frame
   */
  this.subscription = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnDataObject(j_acknowledgement.subscription());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Array.<Object>} the list of frames that have been acknowledged / not-acknowledged. The content of the list depends on the type of subscription.
   */
  this.frames = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnListSetDataObject(j_acknowledgement.frames());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_acknowledgement;
};

Acknowledgement._jclass = utils.getJavaClass("io.vertx.ext.stomp.Acknowledgement");
Acknowledgement._jtype = {
  accept: function(obj) {
    return Acknowledgement._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(Acknowledgement.prototype, {});
    Acknowledgement.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
Acknowledgement._create = function(jdel) {
  var obj = Object.create(Acknowledgement.prototype, {});
  Acknowledgement.apply(obj, arguments);
  return obj;
}
module.exports = Acknowledgement;