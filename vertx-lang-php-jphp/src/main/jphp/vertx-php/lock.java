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

package io.vertx.php.core.shareddata;
import io.vertx.lang.php.util.Wrapper;

/**
 An asynchronous exclusive lock which can be obtained from any node in the cluster.
 <p>
 When the lock is obtained, no-one else in the cluster can obtain the lock with the same name until the lock
 is released.

 * @class
 */
@Name("Lock")
@Namespace("io\\vertx\\php\\core\\shareddata")
public class Lock extends BaseWrapper<Lock>{

  /**
   Release the lock. Once the lock is released another will be able to obtain the lock.

   @public

   */
  this.release = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_lock.release();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_lock;
};

Lock._jclass = utils.getJavaClass("io.vertx.core.shareddata.Lock");
Lock._jtype = {
  accept: function(obj) {
    return Lock._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(Lock.prototype, {});
    Lock.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
Lock._create = function(jdel) {
  var obj = Object.create(Lock.prototype, {});
  Lock.apply(obj, arguments);
  return obj;
}
module.exports = Lock;