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
import io.vertx.php.ext.stomp.StompServerConnection;

/**

 * @class
 */
@Name("Frames")
@Namespace("io\\vertx\\php\\ext\\stomp")
public class Frames extends BaseWrapper<Frames>{

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_frames;
};

Frames._jclass = utils.getJavaClass("io.vertx.ext.stomp.Frames");
Frames._jtype = {
  accept: function(obj) {
    return Frames._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(Frames.prototype, {});
    Frames.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
Frames._create = function(jdel) {
  var obj = Object.create(Frames.prototype, {});
  Frames.apply(obj, arguments);
  return obj;
}
/**

 @memberof module:vertx-stomp-js/frames
 @param message {string} 
 @param headers {Array.<string>} 
 @param body {string} 
 @return {Object}
 */
Frames.createErrorFrame = function(message, headers, body) {
  var __args = arguments;
  if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'string') {
    return utils.convReturnDataObject(JFrames.createErrorFrame(message, headers, body));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-stomp-js/frames
 @param receiptId {string} 
 @param headers {Array.<string>} 
 @return {Object}
 */
Frames.createReceiptFrame = function(receiptId, headers) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnDataObject(JFrames.createReceiptFrame(receiptId, headers));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-stomp-js/frames
 @param frame {Object} 
 @param connection {StompServerConnection} 
 */
Frames.handleReceipt = function(frame, connection) {
  var __args = arguments;
  if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'object' && __args[1]._jdel) {
    JFrames.handleReceipt(frame != null ? new Frame(new JsonObject(Java.asJSONCompatible(frame))) : null, connection._jdel);
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-stomp-js/frames

 @return {Object}
 */
Frames.ping = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnDataObject(JFrames.ping());
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = Frames;