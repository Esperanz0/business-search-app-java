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

package com.vestrel00.business.search.presentation.java.nogui.mvp.display;

import java.util.Scanner;

import javax.inject.Inject;

import dagger.Reusable;

/**
 * Uses {@link System#in} forprompting input from the input stream.
 */
@Reusable
final class DisplayInput {

    @Inject
    DisplayInput() {
    }

    String getInput() {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        return scanner.nextLine().trim();
    }
}
