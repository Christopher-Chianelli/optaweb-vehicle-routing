/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaweb.vehiclerouting.plugin.planner.domain;

import org.optaplanner.core.api.domain.lookup.PlanningId;

/**
 * Exists only to share the ID attribute, which is common to all planning entities and facts. The ID plays two roles:
 * <ol>
 * <li>It's a {@link PlanningId} that allows to pull working objects from the score director. This is important for
 * problem fact changes and potentially for multi-threaded solving.</li>
 * <li>It's a link to the corresponding domain object.</li>
 * </ol>
 */
public class AbstractPlanningObject {

    @PlanningId
    long id;

    public AbstractPlanningObject() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
