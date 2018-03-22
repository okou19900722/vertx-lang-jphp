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

package io.vertx.php.ext.web.client;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.http.HttpClient;
import io.vertx.php.ext.web.client.HttpRequest;

/**

 * @class
 */
@Name("WebClient")
@Namespace("io\\vertx\\php\\ext\\web\\client")
public class WebClient extends BaseWrapper<WebClient>{

  /**
   Create an HTTP request to send to the server at the specified host and port.

   @public
   @param method {Object} the HTTP method 
   @param port {number} the port 
   @param host {string} the host 
   @param requestURI {string} the relative URI 
   @return {HttpRequest} an HTTP client request object
   */
  this.request = function() {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.request(io.vertx.core.http.HttpMethod.valueOf(__args[0]), __args[1]), Buffer._jtype);
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null)) {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.request(io.vertx.core.http.HttpMethod.valueOf(__args[0]), __args[1] != null ? new RequestOptions(new JsonObject(Java.asJSONCompatible(__args[1]))) : null), Buffer._jtype);
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.request(io.vertx.core.http.HttpMethod.valueOf(__args[0]), __args[1], __args[2]), Buffer._jtype);
    }  else if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'string' && typeof __args[3] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.request(io.vertx.core.http.HttpMethod.valueOf(__args[0]), __args[1], __args[2], __args[3]), Buffer._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create an HTTP request to send to the server using an absolute URI

   @public
   @param method {Object} the HTTP method 
   @param absoluteURI {string} the absolute URI 
   @return {HttpRequest} an HTTP client request object
   */
  this.requestAbs = function(method, absoluteURI) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.requestAbs(io.vertx.core.http.HttpMethod.valueOf(method), absoluteURI), Buffer._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create an HTTP GET request to send to the server at the specified host and port.

   @public
   @param port {number} the port 
   @param host {string} the host 
   @param requestURI {string} the relative URI 
   @return {HttpRequest} an HTTP client request object
   */
  this.get = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.get(__args[0]), Buffer._jtype);
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.get(__args[0], __args[1]), Buffer._jtype);
    }  else if (__args.length === 3 && typeof __args[0] ==='number' && typeof __args[1] === 'string' && typeof __args[2] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.get(__args[0], __args[1], __args[2]), Buffer._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create an HTTP GET request to send to the server using an absolute URI, specifying a response handler to receive
   the response

   @public
   @param absoluteURI {string} the absolute URI 
   @return {HttpRequest} an HTTP client request object
   */
  this.getAbs = function(absoluteURI) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.getAbs(absoluteURI), Buffer._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create an HTTP POST request to send to the server at the specified host and port.

   @public
   @param port {number} the port 
   @param host {string} the host 
   @param requestURI {string} the relative URI 
   @return {HttpRequest} an HTTP client request object
   */
  this.post = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.post(__args[0]), Buffer._jtype);
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.post(__args[0], __args[1]), Buffer._jtype);
    }  else if (__args.length === 3 && typeof __args[0] ==='number' && typeof __args[1] === 'string' && typeof __args[2] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.post(__args[0], __args[1], __args[2]), Buffer._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create an HTTP POST request to send to the server using an absolute URI, specifying a response handler to receive
   the response

   @public
   @param absoluteURI {string} the absolute URI 
   @return {HttpRequest} an HTTP client request object
   */
  this.postAbs = function(absoluteURI) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.postAbs(absoluteURI), Buffer._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create an HTTP PUT request to send to the server at the specified host and port.

   @public
   @param port {number} the port 
   @param host {string} the host 
   @param requestURI {string} the relative URI 
   @return {HttpRequest} an HTTP client request object
   */
  this.put = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.put(__args[0]), Buffer._jtype);
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.put(__args[0], __args[1]), Buffer._jtype);
    }  else if (__args.length === 3 && typeof __args[0] ==='number' && typeof __args[1] === 'string' && typeof __args[2] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.put(__args[0], __args[1], __args[2]), Buffer._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create an HTTP PUT request to send to the server using an absolute URI, specifying a response handler to receive
   the response

   @public
   @param absoluteURI {string} the absolute URI 
   @return {HttpRequest} an HTTP client request object
   */
  this.putAbs = function(absoluteURI) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.putAbs(absoluteURI), Buffer._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create an HTTP DELETE request to send to the server at the specified host and port.

   @public
   @param port {number} the port 
   @param host {string} the host 
   @param requestURI {string} the relative URI 
   @return {HttpRequest} an HTTP client request object
   */
  this.delete = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.delete(__args[0]), Buffer._jtype);
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.delete(__args[0], __args[1]), Buffer._jtype);
    }  else if (__args.length === 3 && typeof __args[0] ==='number' && typeof __args[1] === 'string' && typeof __args[2] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.delete(__args[0], __args[1], __args[2]), Buffer._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create an HTTP DELETE request to send to the server using an absolute URI, specifying a response handler to receive
   the response

   @public
   @param absoluteURI {string} the absolute URI 
   @return {HttpRequest} an HTTP client request object
   */
  this.deleteAbs = function(absoluteURI) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.deleteAbs(absoluteURI), Buffer._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create an HTTP PATCH request to send to the server at the specified host and port.

   @public
   @param port {number} the port 
   @param host {string} the host 
   @param requestURI {string} the relative URI 
   @return {HttpRequest} an HTTP client request object
   */
  this.patch = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.patch(__args[0]), Buffer._jtype);
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.patch(__args[0], __args[1]), Buffer._jtype);
    }  else if (__args.length === 3 && typeof __args[0] ==='number' && typeof __args[1] === 'string' && typeof __args[2] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.patch(__args[0], __args[1], __args[2]), Buffer._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create an HTTP PATCH request to send to the server using an absolute URI, specifying a response handler to receive
   the response

   @public
   @param absoluteURI {string} the absolute URI 
   @return {HttpRequest} an HTTP client request object
   */
  this.patchAbs = function(absoluteURI) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.patchAbs(absoluteURI), Buffer._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create an HTTP HEAD request to send to the server at the specified host and port.

   @public
   @param port {number} the port 
   @param host {string} the host 
   @param requestURI {string} the relative URI 
   @return {HttpRequest} an HTTP client request object
   */
  this.head = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.head(__args[0]), Buffer._jtype);
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.head(__args[0], __args[1]), Buffer._jtype);
    }  else if (__args.length === 3 && typeof __args[0] ==='number' && typeof __args[1] === 'string' && typeof __args[2] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.head(__args[0], __args[1], __args[2]), Buffer._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create an HTTP HEAD request to send to the server using an absolute URI, specifying a response handler to receive
   the response

   @public
   @param absoluteURI {string} the absolute URI 
   @return {HttpRequest} an HTTP client request object
   */
  this.headAbs = function(absoluteURI) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(HttpRequest, j_webClient.headAbs(absoluteURI), Buffer._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Close the client. Closing will close down any pooled connections.
   Clients should always be closed after use.

   @public

   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_webClient.close();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_webClient;
};

WebClient._jclass = utils.getJavaClass("io.vertx.ext.web.client.WebClient");
WebClient._jtype = {
  accept: function(obj) {
    return WebClient._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(WebClient.prototype, {});
    WebClient.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
WebClient._create = function(jdel) {
  var obj = Object.create(WebClient.prototype, {});
  WebClient.apply(obj, arguments);
  return obj;
}
/**
 Create a web client using the provided <code>vertx</code> instance.

 @memberof module:vertx-web-client-js/web_client
 @param vertx {Vertx} the vertx instance 
 @param options {Object} the Web Client options 
 @return {WebClient} the created web client
 */
WebClient.create = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(WebClient, JWebClient.create(__args[0]._jdel));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(WebClient, JWebClient.create(__args[0]._jdel, __args[1] != null ? new WebClientOptions(new JsonObject(Java.asJSONCompatible(__args[1]))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Wrap an <code>httpClient</code> with a web client and default options.
 <p>
 Only the specific web client portion of the <code>options</code> is used, the <a href="../../dataobjects.html#HttpClientOptions">HttpClientOptions</a>
 of the <code>httpClient</code> is reused.

 @memberof module:vertx-web-client-js/web_client
 @param httpClient {HttpClient} the  to wrap 
 @param options {Object} the Web Client options 
 @return {WebClient} the web client
 */
WebClient.wrap = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(WebClient, JWebClient.wrap(__args[0]._jdel));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(WebClient, JWebClient.wrap(__args[0]._jdel, __args[1] != null ? new WebClientOptions(new JsonObject(Java.asJSONCompatible(__args[1]))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = WebClient;