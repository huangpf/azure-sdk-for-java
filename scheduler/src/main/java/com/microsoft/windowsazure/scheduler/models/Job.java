/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.scheduler.models;

import java.util.Calendar;

/**
 * A scheduler job.
 */
public class Job {
    private JobAction action;

    /**
     * Action to invoke for the job.
     */
    public JobAction getAction() {
        return this.action;
    }

    /**
     * Action to invoke for the job.
     */
    public void setAction(JobAction action) {
        this.action = action;
    }

    private String id;

    /**
     * Job identifier.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Job identifier.
     */
    public void setId(String id) {
        this.id = id;
    }

    private JobRecurrence recurrence;

    /**
     * Recurrence schedule for the job.
     */
    public JobRecurrence getRecurrence() {
        return this.recurrence;
    }

    /**
     * Recurrence schedule for the job.
     */
    public void setRecurrence(JobRecurrence recurrence) {
        this.recurrence = recurrence;
    }

    private Calendar startTime;

    /**
     * Start time for the job. Defined as ISO-8601.
     */
    public Calendar getStartTime() {
        return this.startTime;
    }

    /**
     * Start time for the job. Defined as ISO-8601.
     */
    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    private JobState state;

    /**
     * Current state of the job.
     */
    public JobState getState() {
        return this.state;
    }

    /**
     * Current state of the job.
     */
    public void setState(JobState state) {
        this.state = state;
    }

    private JobStatus status;

    /**
     * Current status of the job.
     */
    public JobStatus getStatus() {
        return this.status;
    }

    /**
     * Current status of the job.
     */
    public void setStatus(JobStatus status) {
        this.status = status;
    }
}