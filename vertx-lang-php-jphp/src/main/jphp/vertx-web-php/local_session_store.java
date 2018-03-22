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

package io.vertx.php.ext.web.sstore;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.web.Session;
import io.vertx.php.ext.web.sstore.SessionStore;
import io.vertx.php.core.Vertx;

/**
 A session store which is only available on a single node.
 <p>
 Can be used when sticky sessions are being used.

 * @class
 */
@Name("LocalSessionStore")
@Namespace("io\\vertx\\php\\ext\\web\\sstore")
public class LocalSessionStore extends BaseWrapper<LocalSessionStore>{
  SessionStore.call(this, j_val);

  /**
   The retry timeout value in milli seconds used by the session handler when it retrieves a value from the store.<p/>
  
   A non positive value means there is no retry at all.

   @public

   @return {number} the timeout value, in ms
   */
  this.retryTimeout = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_localSessionStore.retryTimeout();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create a new session

   @public
   @param timeout {number} - the session timeout, in ms 
   @param length {number} - the required length for the session id 
   @return {Session} the session
   */
  this.createSession = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      return utils.convReturnVertxGen(Session, j_localSessionStore.createSession(__args[0]));
    }  else if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] ==='number') {
      return utils.convReturnVertxGen(Session, j_localSessionStore.createSession(__args[0], __args[1]));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the session with the specified ID

   @public
   @param id {string} the unique ID of the session 
   @param resultHandler {function} will be called with a result holding the session, or a failure 
   */
  this.get = function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_localSessionStore.get(id, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnVertxGen(Session, ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete the session with the specified ID

   @public
   @param id {string} the unique ID of the session 
   @param resultHandler {function} will be called with a success or a failure 
   */
  this.delete = function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_localSessionStore.delete(id, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add a session with the specified ID

   @public
   @param session {Session} the session 
   @param resultHandler {function} will be called with a success or a failure 
   */
  this.put = function(session, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'function') {
      j_localSessionStore.put(session._jdel, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove all sessions from the store

   @public
   @param resultHandler {function} will be called with a success or a failure 
   */
  this.clear = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_localSessionStore.clear(function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the number of sessions in the store

   @public
   @param resultHandler {function} will be called with the number, or a failure 
   */
  this.size = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_localSessionStore.size(function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Close the store

   @public

   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_localSessionStore.close();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_localSessionStore;
};

LocalSessionStore._jclass = utils.getJavaClass("io.vertx.ext.web.sstore.LocalSessionStore");
LocalSessionStore._jtype = {
  accept: function(obj) {
    return LocalSessionStore._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(LocalSessionStore.prototype, {});
    LocalSessionStore.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
LocalSessionStore._create = function(jdel) {
  var obj = Object.create(LocalSessionStore.prototype, {});
  LocalSessionStore.apply(obj, arguments);
  return obj;
}
/**
 Create a session store

 @memberof module:vertx-web-js/local_session_store
 @param vertx {Vertx} the Vert.x instance 
 @param sessionMapName {string} name for map used to store sessions 
 @param reaperInterval {number} how often, in ms, to check for expired sessions 
 @return {LocalSessionStore} the session store
 */
LocalSessionStore.create = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(LocalSessionStore, JLocalSessionStore.create(__args[0]._jdel));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string') {
    return utils.convReturnVertxGen(LocalSessionStore, JLocalSessionStore.create(__args[0]._jdel, __args[1]));
  }else if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && typeof __args[2] ==='number') {
    return utils.convReturnVertxGen(LocalSessionStore, JLocalSessionStore.create(__args[0]._jdel, __args[1], __args[2]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = LocalSessionStore;