/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jmeter.shulie.consts;

import io.shulie.jmeter.tool.redis.RedisUtil;

/**
 * 吞吐量常量类
 *
 * @author lipeng
 * @date 2021-02-02 3:32 下午
 */
public abstract class ThroughputConstants {

    /** REDIS 业务活动吞吐量百分比 KEY 格式化串 */
    public static final String REDIS_ACTIVITY_PERCENTAGE_KEY_FORMAT = "__REDIS_TPS_LIMIT_KEY_%s_%s_%s_%s_";

    /** jedis cli */
    public static RedisUtil redisUtil;

    /** REDIS TPS KEY */
    public static String redisActivityPercentageKey;

    /** 是否TPS模式 */
    public static boolean IS_TPS_MODE = false;

    /** TPS模式 值 */
    public static String ENGINE_PRESSURE_MODE_TPS_VALUE = "1";

}
