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


import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class DeleteWafDomainHostInfoRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 要删除的域名，该字段与RecordId不能同时为空，优先取RecordId进行删除 */
    @UCloudParam("FullDomain")
    private String fullDomain;

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
}
