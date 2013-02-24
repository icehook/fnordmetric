// FnordMetric Enterprise
//   (c) 2011-2013 Paul Asmuth <paul@paulasmuth.com>
//
// Licensed under the MIT License (the "License"); you may not use this
// file except in compliance with the License. You may obtain a copy of
// the License at: http://opensource.org/licenses/MIT

package com.fnordmetric.enterprise

class ValuesInInstruction(key: MetricKey, time0: Long, time1: Long) extends AbstractInstruction {

  def execute : String = {
    val metric = MetricFactory.get_metric(key)
    val values = metric.values_in(time1 * 1000, time0 * 1000)

    values.toString
  }

}
