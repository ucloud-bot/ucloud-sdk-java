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
package cn.ucloud.ulb.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;
import java.util.List;

public class UpdatePolicyRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html): false */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html): false */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 需要添加内容转发策略的负载均衡实例ID: false */
    @NotEmpty
    @UCloudParam("ULBId")
    private String ulbId;

    /** 需要添加内容转发策略的VServer实例ID，只支持请求代理模式下，HTTP或HTTPS协议的VServer: false */
    @NotEmpty
    @UCloudParam("VServerId")
    private String vServerId;

    /** 内容转发匹配字段: false */
    @NotEmpty
    @UCloudParam("Match")
    private String match;

    /** 转发规则的ID，当Type为Default时，可以不传或为空: false */
    @UCloudParam("PolicyId")
    private String policyId;

    /** 内容转发策略应用的后端资源实例的ID，来源于 AllocateBackend 返回的 BackendId，不传表示更新转发节点为空: false */
    @UCloudParam("BackendId")
    private List<String> backendId;

    /** 内容转发匹配字段的类型，枚举值：Domain -> 域名转发规则；Path -> 路径转发规则；Default -> 默认转发规则，不传默认值Domain: false */
    @UCloudParam("Type")
    private String type;

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

    public String getULBId() {
        return ulbId;
    }

    public void setULBId(String ulbId) {
        this.ulbId = ulbId;
    }

    public String getVServerId() {
        return vServerId;
    }

    public void setVServerId(String vServerId) {
        this.vServerId = vServerId;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public List<String> getBackendId() {
        return backendId;
    }

    public void setBackendId(List<String> backendId) {
        this.backendId = backendId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
