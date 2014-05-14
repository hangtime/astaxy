/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hangtime.astaxy;

import org.apache.cassandra.config.SeedProviderDef;

/**
 * A class that contains configuration properties for the cassandra node it runs within.
 * 
 * Properties declared as volatile can be mutated via JMX.
 */
public class Config
{
    public String cluster_name = "Test Cluster";
    public String datacenter_name = null;
    public String keyspace_name = "default";

    public SeedProviderDef seed_provider;

    public Integer rpc_port = 9160;

    public String statsd_host = "localhost";
    public Integer statsd_port = 8125;

    public String airbrake_key = null;

    private static boolean loadYaml = true;
    private static boolean outboundBindAny = false;

    public static boolean getOutboundBindAny()
    {
        return outboundBindAny;
    }

    public static void setOutboundBindAny(boolean value)
    {
        outboundBindAny = value;
    }

    public static boolean getLoadYaml()
    {
       return loadYaml;
    }

    public static void setLoadYaml(boolean value)
    {
        loadYaml = value;
    }
}