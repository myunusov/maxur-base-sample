/**
 * Copyright (c) 2015 Maxim Yunusov
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.maxur.sample.junit;

import static com.google.common.base.Strings.repeat;

/**
 * The type Main.
 *
 * @author Maxim Yunusov (yunus_max@mail.ru)
 * @version $Id$
 * @since <pre>10/19/2015</pre>
 */
public final class Main {

    /**
     * Default Constructor.
     */
    private Main() {
    }

    /**
     * The entry point of application.
     *
     * @param args The input arguments
     */
    public static void main(final String[] args) {
        System.out.println(triple("Hello World!"));
    }

    /**
     * Triple string.
     *
     * @param str The str
     * @return The string
     */
    static String triple(final String str) {
        return repeat(str, 3);
    }
}

