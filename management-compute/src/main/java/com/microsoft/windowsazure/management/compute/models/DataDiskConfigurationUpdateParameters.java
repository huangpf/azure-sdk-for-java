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

package com.microsoft.windowsazure.management.compute.models;

/**
* The data disk configuration.
*/
public class DataDiskConfigurationUpdateParameters {
    private String hostCaching;
    
    /**
    * Optional. Optional. Host caching option for a data disk within the VM
    * Image. 'ReadOnly', 'ReadWrite', or 'None'.If this parameter is specified
    * you must also specify the Name for the DataDiskConfiguration you want to
    * change.
    * @return The HostCaching value.
    */
    public String getHostCaching() {
        return this.hostCaching;
    }
    
    /**
    * Optional. Optional. Host caching option for a data disk within the VM
    * Image. 'ReadOnly', 'ReadWrite', or 'None'.If this parameter is specified
    * you must also specify the Name for the DataDiskConfiguration you want to
    * change.
    * @param hostCachingValue The HostCaching value.
    */
    public void setHostCaching(final String hostCachingValue) {
        this.hostCaching = hostCachingValue;
    }
    
    private Integer logicalUnitNumber;
    
    /**
    * Optional. Optional. LUN for the data disk. LUNs must not conflict with
    * other Data Disks in the VM Image. If this parameter is specified you
    * must also specify the Name for the DataDiskConfiguration you want to
    * change.
    * @return The LogicalUnitNumber value.
    */
    public Integer getLogicalUnitNumber() {
        return this.logicalUnitNumber;
    }
    
    /**
    * Optional. Optional. LUN for the data disk. LUNs must not conflict with
    * other Data Disks in the VM Image. If this parameter is specified you
    * must also specify the Name for the DataDiskConfiguration you want to
    * change.
    * @param logicalUnitNumberValue The LogicalUnitNumber value.
    */
    public void setLogicalUnitNumber(final Integer logicalUnitNumberValue) {
        this.logicalUnitNumber = logicalUnitNumberValue;
    }
    
    private String name;
    
    /**
    * Optional. Optional if not changing any data disk configurations. Name of
    * an existing DataDiskConfiguration. The name cannot be changed, this is
    * just to identify the disk for changing other properties.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Optional if not changing any data disk configurations. Name of
    * an existing DataDiskConfiguration. The name cannot be changed, this is
    * just to identify the disk for changing other properties.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
}
