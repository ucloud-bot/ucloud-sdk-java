package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 删除全球加速服务加速配置 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class DeleteUGAInstanceParam extends BaseRequestParam {
            /**
            * 全球加速实例ID
            */
            @UcloudParam("UGAId")
                    @NotEmpty(message = "uGAId can not be empty")
                private String uGAId;


public DeleteUGAInstanceParam(                    String projectId
                    ,String uGAId
){
    super("DeleteUGAInstance");
                this.projectId = projectId;
                this.uGAId = uGAId;
}


                public String getUGAId() {
                return this.uGAId;
                }

                public void setUGAId(String uGAId) {
                this.uGAId = uGAId;
                }



}