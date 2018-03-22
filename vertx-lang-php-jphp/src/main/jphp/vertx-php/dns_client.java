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

package io.vertx.php.core.dns;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.dns.MxRecord;
import io.vertx.php.core.dns.SrvRecord;

/**
 Provides a way to asynchronously lookup information from DNS servers.
 <p>
 Please consult the documentation for more information on DNS clients.

 * @class
 */
@Name("DnsClient")
@Namespace("io\\vertx\\php\\core\\dns")
public class DnsClient extends BaseWrapper<DnsClient>{

  /**
   Try to lookup the A (ipv4) or AAAA (ipv6) record for the given name. The first found will be used.

   @public
   @param name {string} the name to resolve 
   @param handler {function} the {@link Handler} to notify with the {@link AsyncResult}. The handler will get notified with the resolved address if a record was found. If non was found it will get notifed with <code>null</code>. If an error accours it will get failed. 
   @return {DnsClient} a reference to this, so the API can be used fluently
   */
  this.lookup = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_dnsClient.lookup(name, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Try to lookup the A (ipv4) record for the given name. The first found will be used.

   @public
   @param name {string} the name to resolve 
   @param handler {function} the  to notify with the {@link AsyncResult}. The handler will get notified with the resolved Inet4Address if a record was found. If non was found it will get notifed with <code>null</code>. If an error accours it will get failed. 
   @return {DnsClient} a reference to this, so the API can be used fluently
   */
  this.lookup4 = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_dnsClient.lookup4(name, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Try to lookup the AAAA (ipv6) record for the given name. The first found will be used.

   @public
   @param name {string} the name to resolve 
   @param handler {function} the  to notify with the . The handler will get notified with the resolved Inet6Address if a record was found. If non was found it will get notifed with <code>null</code>. If an error accours it will get failed. 
   @return {DnsClient} a reference to this, so the API can be used fluently
   */
  this.lookup6 = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_dnsClient.lookup6(name, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Try to resolve all A (ipv4) records for the given name.

   @public
   @param name {string} the name to resolve 
   @param handler {function} the {@link Handler} to notify with the {@link AsyncResult}. The handler will get notified with a List that contains all the resolved Inet4Addresses. If none was found an empty List will be used. If an error accours it will get failed. 
   @return {DnsClient} a reference to this, so the API can be used fluently
   */
  this.resolveA = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_dnsClient.resolveA(name, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Try to resolve all AAAA (ipv6) records for the given name.

   @public
   @param name {string} the name to resolve 
   @param handler {function} the {@link Handler} to notify with the {@link AsyncResult}. The handler will get notified with a List that contains all the resolved Inet6Addresses. If none was found an empty List will be used. If an error accours it will get failed. 
   @return {DnsClient} a reference to this, so the API can be used fluently
   */
  this.resolveAAAA = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_dnsClient.resolveAAAA(name, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Try to resolve the CNAME record for the given name.

   @public
   @param name {string} the name to resolve the CNAME for 
   @param handler {function} the  to notify with the . The handler will get notified with the resolved String if a record was found. If none was found it will get notified with <code>null</code>. If an error accours it will get failed. 
   @return {DnsClient} a reference to this, so the API can be used fluently.
   */
  this.resolveCNAME = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_dnsClient.resolveCNAME(name, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Try to resolve the MX records for the given name.

   @public
   @param name {string} the name for which the MX records should be resolved 
   @param handler {function} the {@link Handler} to notify with the {@link AsyncResult}. The handler will get notified with a List that contains all resolved {@link MxRecord}s, sorted by their {@link MxRecord#priority}. If non was found it will get notified with an empty List. If an error accours it will get failed. 
   @return {DnsClient} a reference to this, so the API can be used fluently.
   */
  this.resolveMX = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_dnsClient.resolveMX(name, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnListSetVertxGen(ar.result(), MxRecord), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Try to resolve the TXT records for the given name.

   @public
   @param name {string} the name for which the TXT records should be resolved 
   @param handler {function} the  to notify with the . The handler will get notified with a List that contains all resolved Strings. If none was found it will get notified with an empty List. If an error accours it will get failed. 
   @return {DnsClient} a reference to this, so the API can be used fluently.
   */
  this.resolveTXT = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_dnsClient.resolveTXT(name, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Try to resolve the PTR record for the given name.

   @public
   @param name {string} the name to resolve the PTR for 
   @param handler {function} the  to notify with the . The handler will get notified with the resolved String if a record was found. If none was found it will get notified with <code>null</code>. If an error accours it will get failed. 
   @return {DnsClient} a reference to this, so the API can be used fluently.
   */
  this.resolvePTR = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_dnsClient.resolvePTR(name, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Try to resolve the NS records for the given name.

   @public
   @param name {string} the name for which the NS records should be resolved 
   @param handler {function} the  to notify with the . The handler will get notified with a List that contains all resolved Strings. If none was found it will get notified with an empty List. If an error accours it will get failed. 
   @return {DnsClient} a reference to this, so the API can be used fluently.
   */
  this.resolveNS = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_dnsClient.resolveNS(name, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Try to resolve the SRV records for the given name.

   @public
   @param name {string} the name for which the SRV records should be resolved 
   @param handler {function} the  to notify with the . The handler will get notified with a List that contains all resolved {@link SrvRecord}s. If none was found it will get notified with an empty List. If an error accours it will get failed. 
   @return {DnsClient} a reference to this, so the API can be used fluently.
   */
  this.resolveSRV = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_dnsClient.resolveSRV(name, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnListSetVertxGen(ar.result(), SrvRecord), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Try to do a reverse lookup of an IP address. This is basically the same as doing trying to resolve a PTR record
   but allows you to just pass in the IP address and not a valid ptr query string.

   @public
   @param ipaddress {string} the IP address to resolve the PTR for 
   @param handler {function} the  to notify with the . The handler will get notified with the resolved String if a record was found. If none was found it will get notified with <code>null</code>. If an error accours it will get failed. 
   @return {DnsClient} a reference to this, so the API can be used fluently.
   */
  this.reverseLookup = function(ipaddress, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_dnsClient.reverseLookup(ipaddress, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_dnsClient;
};

DnsClient._jclass = utils.getJavaClass("io.vertx.core.dns.DnsClient");
DnsClient._jtype = {
  accept: function(obj) {
    return DnsClient._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(DnsClient.prototype, {});
    DnsClient.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
DnsClient._create = function(jdel) {
  var obj = Object.create(DnsClient.prototype, {});
  DnsClient.apply(obj, arguments);
  return obj;
}
module.exports = DnsClient;