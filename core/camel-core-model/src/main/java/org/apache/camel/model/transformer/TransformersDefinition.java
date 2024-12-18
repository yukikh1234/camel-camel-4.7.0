/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.transformer;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;

import org.apache.camel.model.CopyableDefinition;
import org.apache.camel.model.ProcessorDefinitionHelper;
import org.apache.camel.spi.Metadata;

/**
 * To configure transformers.
 */
@Metadata(label = "transformation", title = "Transformations")
@XmlRootElement(name = "transformers")
@XmlAccessorType(XmlAccessType.FIELD)
public class TransformersDefinition implements CopyableDefinition<TransformersDefinition> {

    @XmlElements({
            @XmlElement(name = "dataFormatTransformer", type = DataFormatTransformerDefinition.class),
            @XmlElement(name = "endpointTransformer", type = EndpointTransformerDefinition.class),
            @XmlElement(name = "loadTransformer", type = LoadTransformerDefinition.class),
            @XmlElement(name = "customTransformer", type = CustomTransformerDefinition.class) })
    private List<TransformerDefinition> transformers;

    public TransformersDefinition() {
    }

    protected TransformersDefinition(TransformersDefinition source) {
        this.transformers = ProcessorDefinitionHelper.deepCopyDefinitions(source.transformers);
    }

    @Override
    public TransformersDefinition copyDefinition() {
        return new TransformersDefinition(this);
    }

    /**
     * The configured transformers
     */
    public void setTransformers(List<TransformerDefinition> transformers) {
        this.transformers = transformers;
    }

    public List<TransformerDefinition> getTransformers() {
        return transformers;
    }
}
