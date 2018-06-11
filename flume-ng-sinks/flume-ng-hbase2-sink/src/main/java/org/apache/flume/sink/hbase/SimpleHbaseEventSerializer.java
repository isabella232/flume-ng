/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.flume.sink.hbase;

import org.apache.flume.sink.hbase2.SimpleHBase2EventSerializer;

/**
 * HBase event serializer with the original package/class name
 * which was used with the former HBase 1.x sink.
 * Through this adapter class, the new HBase 2 sink can use
 * the existing sink configurations and serializer implementations
 * without modification.
 *
 * Only for backward compatibility. Use {@link SimpleHBase2EventSerializer} instead.
 */
@Deprecated
public class SimpleHbaseEventSerializer extends SimpleHBase2EventSerializer implements HbaseEventSerializer {
}
