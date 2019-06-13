/**
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.ap4k.component.generator;

import io.ap4k.Generator;
import io.ap4k.component.annotation.Link;

import java.util.Collections;
import java.util.List;

/**
 * @author <a href="claprun@redhat.com">Christophe Laprun</a>
 */
public class DefaultLinkConfigGenerator implements LinkConfigGenerator {
  public DefaultLinkConfigGenerator() {
    Generator.registerAnnotationClass(GENERATOR_KEY, Link.class);
    Generator.registerGenerator(GENERATOR_KEY, this);
  }

  @Override
  public List<Class> getSupportedAnnotations() {
    return Collections.singletonList(Link.class);
  }
}
