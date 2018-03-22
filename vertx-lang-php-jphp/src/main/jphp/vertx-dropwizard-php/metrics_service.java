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

package io.vertx.php.ext.dropwizard;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.metrics.Measured;
import io.vertx.php.core.Vertx;

/**
 The metrics service mainly allows to return a snapshot of measured objects.

 * @class
 */
@Name("MetricsService")
@Namespace("io\\vertx\\php\\ext\\dropwizard")
public class MetricsService extends BaseWrapper<MetricsService>{

  /**

   @public
   @param measured {Measured} the measure object 
   @return {string} the base name of the measured object
   */
  this.getBaseName = function(measured) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      return j_metricsService.getBaseName(measured._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Array.<string>} the known metrics names by this service
   */
  this.metricsNames = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnSet(j_metricsService.metricsNames());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Will return the metrics that begins with the <code>baseName</code>, null if no metrics is available.<p/>
  
   Note: in the case of scaled servers, the JsonObject returns an aggregation of the metrics as the
   dropwizard backend reports to a single server.

   @public
   @param baseName {string} 
   @return {Object} the map of metrics where the key is the name of the metric and the value is the json data representing that metric
   */
  this.getMetricsSnapshot = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      return utils.convReturnJson(j_metricsService.getMetricsSnapshot(__args[0]._jdel));
    }  else if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnJson(j_metricsService.getMetricsSnapshot(__args[0]));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_metricsService;
};

MetricsService._jclass = utils.getJavaClass("io.vertx.ext.dropwizard.MetricsService");
MetricsService._jtype = {
  accept: function(obj) {
    return MetricsService._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(MetricsService.prototype, {});
    MetricsService.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
MetricsService._create = function(jdel) {
  var obj = Object.create(MetricsService.prototype, {});
  MetricsService.apply(obj, arguments);
  return obj;
}
/**
 Creates a metric service for a given {@link Vertx} instance.

 @memberof module:vertx-dropwizard-js/metrics_service
 @param vertx {Vertx} the vertx instance 
 @return {MetricsService} the metrics service
 */
MetricsService.create = function(vertx) {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(MetricsService, JMetricsService.create(vertx._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = MetricsService;