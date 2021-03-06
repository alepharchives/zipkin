/*
 * Copyright 2012 Twitter Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package com.twitter.zipkin.common

import org.specs.Specification

class EndpointSpec extends Specification {
  "Endpoint" should {

    "compare correctly" in {
      val e1 = Endpoint(123, 456, "a")
      val e2 = Endpoint(123, 457, "a")
      val e3 = Endpoint(124, 456, "a")
      val e4 = Endpoint(123, 456, "b")

      e1.compare(e1) mustEqual 0
      e1.compare(e2) must beLessThan(0)
      e1.compare(e3) must beLessThan(0)
      e1.compare(e4) must beLessThan(0)

    }
  }
}
