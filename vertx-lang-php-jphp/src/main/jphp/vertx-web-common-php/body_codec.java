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

package io.vertx.php.ext.web.codec;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.streams.WriteStream;

/**
 A codec for encoding and decoding HTTP bodies.

 * @class
 */
@Name("BodyCodec")
@Namespace("io\\vertx\\php\\ext\\web\\codec")
public class BodyCodec extends BaseWrapper<BodyCodec>{

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_bodyCodec;
};

BodyCodec._jclass = utils.getJavaClass("io.vertx.ext.web.codec.BodyCodec");
BodyCodec._jtype = {
  accept: function(obj) {
    return BodyCodec._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(BodyCodec.prototype, {});
    BodyCodec.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
BodyCodec._create = function(jdel) {
  var obj = Object.create(BodyCodec.prototype, {});
  BodyCodec.apply(obj, arguments);
  return obj;
}
/**
 A codec for strings using a specific <code>encoding</code>.

 @memberof module:vertx-web-common-js/body_codec
 @param encoding {string} the encoding 
 @return {BodyCodec} the codec
 */
BodyCodec.string = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(BodyCodec, JBodyCodec.string(), undefined);
  }else if (__args.length === 1 && typeof __args[0] === 'string') {
    return utils.convReturnVertxGen(BodyCodec, JBodyCodec.string(__args[0]), undefined);
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-web-common-js/body_codec

 @return {BodyCodec} the  codec
 */
BodyCodec.buffer = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(BodyCodec, JBodyCodec.buffer(), Buffer._jtype);
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-web-common-js/body_codec

 @return {BodyCodec} the  codec
 */
BodyCodec.jsonObject = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(BodyCodec, JBodyCodec.jsonObject(), undefined);
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-web-common-js/body_codec

 @return {BodyCodec} the  codec
 */
BodyCodec.jsonArray = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(BodyCodec, JBodyCodec.jsonArray(), undefined);
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Create and return a codec for Java objects encoded using Jackson mapper.

 @memberof module:vertx-web-common-js/body_codec
 @param type {todo} 
 @return {BodyCodec} a codec for mapping POJO to Json
 */
BodyCodec.json = function(type) {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'function') {
    return utils.convReturnVertxGen(BodyCodec, JBodyCodec.json(utils.get_jclass(type)), utils.get_jtype(__args[0]));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-web-common-js/body_codec

 @return {BodyCodec} a codec that simply discards the response
 */
BodyCodec.none = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(BodyCodec, JBodyCodec.none(), undefined);
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Create a codec that buffers the entire body and then apply the <code>decode</code> function and returns the result.

 @memberof module:vertx-web-common-js/body_codec
 @param decode {todo} the decode function 
 @return {BodyCodec} the created codec
 */
BodyCodec.create = function(decode) {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'function') {
    return utils.convReturnVertxGen(BodyCodec, JBodyCodec.create(function(jVal) {
    var jRet = decode(utils.convReturnVertxGen(Buffer, jVal));
    return utils.convParamTypeUnknown(jRet);
  }), undefined);
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 A body codec that pipes the body to a write stream.

 @memberof module:vertx-web-common-js/body_codec
 @param stream {WriteStream} the destination tream 
 @return {BodyCodec} the body codec for a write stream
 */
BodyCodec.pipe = function(stream) {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(BodyCodec, JBodyCodec.pipe(stream._jdel), undefined);
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = BodyCodec;