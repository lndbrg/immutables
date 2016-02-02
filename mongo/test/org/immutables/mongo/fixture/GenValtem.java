/*
   Copyright 2015 Immutables Authors and Contributors

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.immutables.mongo.fixture;

import org.immutables.mongo.Mongo;
import org.immutables.mongo.fixture.imp.Valtem;
import org.immutables.mongo.repository.RepositorySetup;
import org.immutables.value.Value;

@Mongo.Repository
@Value.Include(Valtem.class)
enum GenValtem {
	;
	void use() {
		RepositorySetup setup = RepositorySetup.forUri("mongodb://localhost/test");
		ValtemRepository repo = new ValtemRepository(setup);
		repo.criteria();
	}
}
