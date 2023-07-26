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
package cn.ucloud.vpc.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class CreateSnatDnatRuleRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 内网P地址 */
    @NotEmpty
    @UCloudParam("PrivateIp")
    private List<String> privateIp;

    /** EIP的IP地址。按入参顺序，PrivateIp与EIP一一对应建立映射关系。 */
    @NotEmpty
    @UCloudParam("EIP")
    private List<String> eip;

    /** 映射所使用的NAT网关资源ID */
    @NotEmpty
    @UCloudParam("NATGWId")
    private String natgwId;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<String> getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(List<String> privateIp) {
        this.privateIp = privateIp;
    }

    public List<String> getEIP() {
        return eip;
    }

    public void setEIP(List<String> eip) {
        this.eip = eip;
    }

    public String getNATGWId() {
        return natgwId;
    }

    public void setNATGWId(String natgwId) {
        this.natgwId = natgwId;
    }
}
