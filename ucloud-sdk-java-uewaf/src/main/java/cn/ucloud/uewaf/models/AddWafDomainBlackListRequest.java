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
package cn.ucloud.uewaf.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class AddWafDomainBlackListRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 要添加黑名单的域名 */
    @NotEmpty
    @UCloudParam("FullDomain")
    private String fullDomain;

    /** 黑名单来源， 用户自定义(custom)/机器行为检测(bot)/ bot-rule/ auto（自动拦截规则） */
    @NotEmpty
    @UCloudParam("Source")
    private String source;

    /** 类型：境内(internal)、境外(oversea)，自定义(custom) */
    @NotEmpty
    @UCloudParam("Type")
    private String type;

    /** 执行动作: 可选值:拦截请求(forbidden) ，验证码(captcha) */
    @NotEmpty
    @UCloudParam("ActionType")
    private String actionType;

    /** 过期时间,即有效时长，单位为秒,永不过期传0 */
    @NotEmpty
    @UCloudParam("ExpireTime")
    private Integer expireTime;

    /** 域名记录ID */
    @UCloudParam("RecordId")
    private Integer recordId;

    /** 目标IP; Source为bot时需传递 */
    @UCloudParam("DestIp")
    private String destIp;

    /** IP、网段或者IP段，传递数组；类型为custom时必填 */
    @UCloudParam("CIDRS")
    private List<String> cidrs;

    /** 备注信息 */
    @UCloudParam("Remark")
    private String remark;

    /** 名称 */
    @UCloudParam("Name")
    private String name;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getFullDomain() {
        return fullDomain;
    }

    public void setFullDomain(String fullDomain) {
        this.fullDomain = fullDomain;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getDestIp() {
        return destIp;
    }

    public void setDestIp(String destIp) {
        this.destIp = destIp;
    }

    public List<String> getCIDRS() {
        return cidrs;
    }

    public void setCIDRS(List<String> cidrs) {
        this.cidrs = cidrs;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
