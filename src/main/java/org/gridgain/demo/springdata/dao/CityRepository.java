/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.gridgain.demo.springdata.dao;

import java.util.List;
import org.apache.ignite.springdata22.repository.IgniteRepository;
import org.apache.ignite.springdata22.repository.config.RepositoryConfig;
import org.gridgain.demo.springdata.model.City;
import org.gridgain.demo.springdata.model.dao.CityKey;
import org.gridgain.demo.springdata.model.dao.CityValue;
import org.springframework.stereotype.Repository;

@RepositoryConfig(cacheName = "City")
@Repository
public interface CityRepository extends IgniteRepository<City, CityKey> {

    public List<City> findAllByPopulationOrderByPopulation(int population);

    public List<City> findAllByPopulationAndCountryCodeOrderByPopulation(int population, String countryCode);

}