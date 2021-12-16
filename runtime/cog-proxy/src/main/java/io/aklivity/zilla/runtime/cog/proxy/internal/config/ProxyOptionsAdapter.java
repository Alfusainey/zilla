/*
 * Copyright 2021-2021 Aklivity Inc.
 *
 * Aklivity licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.aklivity.zilla.runtime.cog.proxy.internal.config;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.bind.adapter.JsonbAdapter;

import io.aklivity.zilla.runtime.cog.proxy.internal.ProxyCog;
import io.aklivity.zilla.runtime.engine.config.Options;
import io.aklivity.zilla.runtime.engine.config.OptionsAdapterSpi;

public final class ProxyOptionsAdapter implements OptionsAdapterSpi, JsonbAdapter<Options, JsonObject>
{
    @Override
    public String type()
    {
        return ProxyCog.NAME;
    }

    @Override
    public JsonObject adaptToJson(
        Options options)
    {
        JsonObjectBuilder object = Json.createObjectBuilder();

        return object.build();
    }

    @Override
    public Options adaptFromJson(
        JsonObject object)
    {
        return new ProxyOptions();
    }
}
