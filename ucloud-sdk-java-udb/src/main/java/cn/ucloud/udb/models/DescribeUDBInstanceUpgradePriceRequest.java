/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.udb.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class DescribeUDBInstanceUpgradePriceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 实例的Id */
    @NotEmpty
    @UCloudParam("DBId")
    private String dbId;

    /** 内存限制(MB) */
    @NotEmpty
    @UCloudParam("MemoryLimit")
    private Integer memoryLimit;

    /** 磁盘空间(GB), 暂时支持20G - 500G */
    @NotEmpty
    @UCloudParam("DiskSpace")
    private Integer diskSpace;

    /** "SATA", "NVMe" */
    @UCloudParam("SSDType")
    private String ssdType;

    /** "SATA_SSD", "NVMe_SSD" */
    @UCloudParam("InstanceType")
    private String instanceType;

    /** 获取指定时间开始后面的升级价格， 不填的话 是默认当前时间 */
    @UCloudParam("OrderStartTime")
    private Integer orderStartTime;

    /** CPU核数 快杰SQLServer升降级必传 */
    @UCloudParam("CPU")
    private Integer cpu;

    /** 规格类型ID,当SpecificationType为1时有效 */
    @UCloudParam("MachineType")
    private String machineType;

    /** 实例计算规格类型，0或不传代表使用内存方式购买，1代表使用内存-cpu可选配比方式购买，需要填写MachineType */
    @UCloudParam("SpecificationType")
    private Integer specificationType;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getDBId() {
        return dbId;
    }

    public void setDBId(String dbId) {
        this.dbId = dbId;
    }

    public Integer getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(Integer memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }

    public String getSSDType() {
        return ssdType;
    }

    public void setSSDType(String ssdType) {
        this.ssdType = ssdType;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public Integer getOrderStartTime() {
        return orderStartTime;
    }

    public void setOrderStartTime(Integer orderStartTime) {
        this.orderStartTime = orderStartTime;
    }

    public Integer getCPU() {
        return cpu;
    }

    public void setCPU(Integer cpu) {
        this.cpu = cpu;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public Integer getSpecificationType() {
        return specificationType;
    }

    public void setSpecificationType(Integer specificationType) {
        this.specificationType = specificationType;
    }
}
