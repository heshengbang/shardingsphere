/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.mode.manager.lock.definition;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.infra.lock.LockLevel;
import org.apache.shardingsphere.infra.lock.LockMode;
import org.apache.shardingsphere.infra.lock.LockNameDefinition;

/**
 * Database lock name definition.
 */
@RequiredArgsConstructor
@Getter
public final class DatabaseLockNameDefinition implements LockNameDefinition {
    
    private final String databaseName;
    
    private final LockMode lockMode;
    
    private final LockLevel lockLevel;
}
