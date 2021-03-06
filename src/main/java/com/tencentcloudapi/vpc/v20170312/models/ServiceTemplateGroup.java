/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceTemplateGroup extends AbstractModel{

    /**
    * 协议端口模板集合实例ID，例如：ppmg-2klmrefu。
    */
    @SerializedName("ServiceTemplateGroupId")
    @Expose
    private String ServiceTemplateGroupId;

    /**
    * 协议端口模板集合名称。
    */
    @SerializedName("ServiceTemplateGroupName")
    @Expose
    private String ServiceTemplateGroupName;

    /**
    * 协议端口模板实例ID。
    */
    @SerializedName("ServiceTemplateIdSet")
    @Expose
    private String [] ServiceTemplateIdSet;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 协议端口模板实例信息。
    */
    @SerializedName("ServiceTemplateSet")
    @Expose
    private ServiceTemplate [] ServiceTemplateSet;

    /**
     * Get 协议端口模板集合实例ID，例如：ppmg-2klmrefu。 
     * @return ServiceTemplateGroupId 协议端口模板集合实例ID，例如：ppmg-2klmrefu。
     */
    public String getServiceTemplateGroupId() {
        return this.ServiceTemplateGroupId;
    }

    /**
     * Set 协议端口模板集合实例ID，例如：ppmg-2klmrefu。
     * @param ServiceTemplateGroupId 协议端口模板集合实例ID，例如：ppmg-2klmrefu。
     */
    public void setServiceTemplateGroupId(String ServiceTemplateGroupId) {
        this.ServiceTemplateGroupId = ServiceTemplateGroupId;
    }

    /**
     * Get 协议端口模板集合名称。 
     * @return ServiceTemplateGroupName 协议端口模板集合名称。
     */
    public String getServiceTemplateGroupName() {
        return this.ServiceTemplateGroupName;
    }

    /**
     * Set 协议端口模板集合名称。
     * @param ServiceTemplateGroupName 协议端口模板集合名称。
     */
    public void setServiceTemplateGroupName(String ServiceTemplateGroupName) {
        this.ServiceTemplateGroupName = ServiceTemplateGroupName;
    }

    /**
     * Get 协议端口模板实例ID。 
     * @return ServiceTemplateIdSet 协议端口模板实例ID。
     */
    public String [] getServiceTemplateIdSet() {
        return this.ServiceTemplateIdSet;
    }

    /**
     * Set 协议端口模板实例ID。
     * @param ServiceTemplateIdSet 协议端口模板实例ID。
     */
    public void setServiceTemplateIdSet(String [] ServiceTemplateIdSet) {
        this.ServiceTemplateIdSet = ServiceTemplateIdSet;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 协议端口模板实例信息。 
     * @return ServiceTemplateSet 协议端口模板实例信息。
     */
    public ServiceTemplate [] getServiceTemplateSet() {
        return this.ServiceTemplateSet;
    }

    /**
     * Set 协议端口模板实例信息。
     * @param ServiceTemplateSet 协议端口模板实例信息。
     */
    public void setServiceTemplateSet(ServiceTemplate [] ServiceTemplateSet) {
        this.ServiceTemplateSet = ServiceTemplateSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTemplateGroupId", this.ServiceTemplateGroupId);
        this.setParamSimple(map, prefix + "ServiceTemplateGroupName", this.ServiceTemplateGroupName);
        this.setParamArraySimple(map, prefix + "ServiceTemplateIdSet.", this.ServiceTemplateIdSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "ServiceTemplateSet.", this.ServiceTemplateSet);

    }
}

