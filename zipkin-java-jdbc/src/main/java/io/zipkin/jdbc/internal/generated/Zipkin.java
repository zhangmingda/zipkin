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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Zipkin extends SchemaImpl {

	private static final long serialVersionUID = -967571390;

	/**
	 * The reference instance of <code>zipkin</code>
	 */
	public static final Zipkin ZIPKIN = new Zipkin();

	/**
	 * No further instances allowed
	 */
	private Zipkin() {
		super("zipkin");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			ZipkinAnnotations.ZIPKIN_ANNOTATIONS,
			ZipkinSpans.ZIPKIN_SPANS);
	}
}
