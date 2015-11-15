/**
 * Copyright 2015 The OpenZipkin Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/**
 * This class is generated by jOOQ
 */
package io.zipkin.jdbc.internal.generated;


import io.zipkin.jdbc.internal.generated.tables.ZipkinAnnotations;
import io.zipkin.jdbc.internal.generated.tables.ZipkinSpans;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in zipkin
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table zipkin.zipkin_annotations
	 */
	public static final ZipkinAnnotations ZIPKIN_ANNOTATIONS = io.zipkin.jdbc.internal.generated.tables.ZipkinAnnotations.ZIPKIN_ANNOTATIONS;

	/**
	 * The table zipkin.zipkin_spans
	 */
	public static final ZipkinSpans ZIPKIN_SPANS = io.zipkin.jdbc.internal.generated.tables.ZipkinSpans.ZIPKIN_SPANS;
}
