/* Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.grails.plugins.google.visualization.option.image

import org.grails.plugins.google.visualization.data.DataType

/**
 * Generic Image Chart configuration options
 *
 * @author <a href='mailto:benjamin.muschko@gmail.com'>Benjamin Muschko</a>
 */
enum GenericImageChartConfigOption {
    ANNOTATION_COLUMNS("annotationColumns", [DataType.ARRAY]),
    BACKGROUND_COLOR("backgroundColor", [DataType.STRING]),
    COLOR("color", [DataType.STRING]),
    COLORS("colors", [DataType.ARRAY]),
    ENABLE_EVENTS("enableEvents", [DataType.BOOLEAN]),
    FIRST_HIDDEN_COLUMN("firstHiddenColumn", [DataType.NUMBER]),
    FILL("fill", [DataType.BOOLEAN]),
    HEIGHT("height", [DataType.NUMBER, DataType.STRING]),
    LABELS("labels", [DataType.STRING]),
    LEGEND("legend", [DataType.STRING]),
    MAX("max", [DataType.NUMBER]),
    MIN("min", [DataType.NUMBER]),
    SHOW_CATEGORY_LABELS("showCategoryLabels", [DataType.BOOLEAN]),
    SHOW_VALUE_LABELS("showValueLabels", [DataType.BOOLEAN]),
    SINGLE_COLUMN_DISPLAY("singleColumnDisplay", [DataType.NUMBER]),
    TITLE("title", [DataType.STRING]),
    VALUE_LABELS_INTERVAL("valueLabelsInterval", [DataType.NUMBER]),
    WIDTH("width", [DataType.NUMBER, DataType.STRING])

    static final Map configOptions

    static {
        configOptions = [:]

        values().each { configOption ->
            configOptions.put(configOption.name, configOption)
        }
    }

    private final name
    private final types

    GenericImageChartConfigOption(name, types) {
        this.name = name
        this.types = types
    }

    @Override
    public String toString() {
        "GenericImageChartConfigOption{name='${name}', types='${types}'}"
    }
}
