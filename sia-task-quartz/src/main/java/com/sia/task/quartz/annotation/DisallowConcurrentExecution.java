/*-
 * <<
 * task
 * ==
 * Copyright (C) 2019 - 2020 sia
 * ==
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
 * >>
 */

package com.sia.task.quartz.annotation;

import com.sia.task.quartz.job.Job;
import com.sia.task.quartz.job.JobDetail;
import com.sia.task.quartz.job.JobKey;

import java.lang.annotation.*;

/**
 * An annotation that marks a {@link Job} class as one that must not have multiple
 * instances executed concurrently (where instance is based-upon a {@link JobDetail}
 * definition - or in other words based upon a {@link JobKey}).
 *
 * @see PersistJobDataAfterExecution
 *
 * @author @see Quartz
 * @data 2019-06-23 14:46
 * @version V1.0.0
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DisallowConcurrentExecution {

}
