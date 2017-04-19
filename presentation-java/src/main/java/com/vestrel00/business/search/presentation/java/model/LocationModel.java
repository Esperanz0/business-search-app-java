/*
 * Copyright 2017 Vandolf Estrellado
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vestrel00.business.search.presentation.java.model;

import com.google.auto.value.AutoValue;

/**
 * Contains location information.
 * <p>
 * <b>DEFAULT VALUES</b>
 * None of the getter methods defined here return null. If an attribute is missing or null, the
 * value returned as defaulted to their non-null counterparts:
 * <ul>
 * <li>String -> ""</li>
 * <li>Collection -> empty collection</li>
 * <li>CustomClass -> non-null CustomClass</li>
 * <li>Primitives -> default values. E.G. int -> 0</li>
 * </ul>
 * This done to prevent null checks and null exceptions for consumers.
 */
@AutoValue
public abstract class LocationModel {

    /**
     * @return a new {@link Builder}
     */
    public static Builder builder() {
        return new AutoValue_LocationModel.Builder();
    }

    public abstract String address();

    public abstract String city();

    public abstract String state();

    public abstract String zipCode();

    public abstract String country();

    /**
     * Builder used to create instances of {@link LocationModel}.
     */
    @AutoValue.Builder
    public abstract static class Builder {

        public abstract Builder address(String address);

        public abstract Builder city(String city);

        public abstract Builder state(String state);

        public abstract Builder zipCode(String zipCode);

        public abstract Builder country(String country);

        public abstract LocationModel build();
    }
}