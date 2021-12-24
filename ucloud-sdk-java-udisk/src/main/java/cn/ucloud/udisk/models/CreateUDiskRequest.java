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
package cn.ucloud.udisk.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateUDiskRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist): false */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist): false */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list): false
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /**
     * 购买UDisk大小,单位:GB,普通数据盘：范围[1~8000]；SSD数据盘：范围[1~8000]；RSSD数据盘：范围[1~32000]；高效数据盘：范围[1~32000]。:
     * false
     */
    @NotEmpty
    @UCloudParam("Size")
    private Integer size;

    /** 实例名称: false */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** Year , Month, Dynamic, Postpay, Trial 。默认为Dynamic。: false */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长 默认: 1: false */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 【开启数据方舟入口已关闭】是否开启数据方舟。Yes：开启，No：不开启，默认值：No: false */
    @UCloudParam("UDataArkMode")
    private String uDataArkMode;

    /** 是否开启快照服务（开启快照服务，可免费开启数据方舟）。Yes：开启，No：不开启，默认值：No: false */
    @UCloudParam("SnapshotService")
    private String snapshotService;

    /** 业务组 默认：Default: false */
    @UCloudParam("Tag")
    private String tag;

    /**
     * UDisk 类型:
     * DataDisk（普通数据盘），SSDDataDisk（SSD数据盘），RSSDDataDisk（RSSD数据盘），EfficiencyDataDisk（高效数据盘），默认值（DataDisk）:
     * false
     */
    @UCloudParam("DiskType")
    private String diskType;

    /** 是否加密。Yes：加密，No：不加密，默认值（No）: false */
    @UCloudParam("UKmsMode")
    private String uKmsMode;

    /** 加密需要的cmk id，UKmsMode为Yes时，必填: false */
    @UCloudParam("CmkId")
    private String cmkId;

    /** RDMA集群id。DiskType为RSSDDataDisk可填，指定云盘创建到对应的RDMA集群。: false */
    @UCloudParam("RdmaClusterId")
    private String rdmaClusterId;

    /** 使用的代金券id: false */
    @UCloudParam("CouponId")
    private String couponId;

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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUDataArkMode() {
        return uDataArkMode;
    }

    public void setUDataArkMode(String uDataArkMode) {
        this.uDataArkMode = uDataArkMode;
    }

    public String getSnapshotService() {
        return snapshotService;
    }

    public void setSnapshotService(String snapshotService) {
        this.snapshotService = snapshotService;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public String getUKmsMode() {
        return uKmsMode;
    }

    public void setUKmsMode(String uKmsMode) {
        this.uKmsMode = uKmsMode;
    }

    public String getCmkId() {
        return cmkId;
    }

    public void setCmkId(String cmkId) {
        this.cmkId = cmkId;
    }

    public String getRdmaClusterId() {
        return rdmaClusterId;
    }

    public void setRdmaClusterId(String rdmaClusterId) {
        this.rdmaClusterId = rdmaClusterId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
