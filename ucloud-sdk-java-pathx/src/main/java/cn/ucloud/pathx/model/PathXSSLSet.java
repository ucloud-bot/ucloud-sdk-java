package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : Describle PathX SSL 模型类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class PathXSSLSet  {
            /**
            * SSL证书的Id
            */
            @SerializedName("SSLId")
                private String sSLId;
            /**
            * SSL证书的名字
            */
            @SerializedName("SSLName")
                private String sSLName;
            /**
            * SSL证书（用户证书、私钥、ca证书合并）内容md5值
            */
            @SerializedName("SSLMD5")
                private String sSLMD5;
            /**
            * SSL证书的创建时间
            */
            @SerializedName("CreateTime")
                private Integer createTime;
            /**
            * SSL证书绑定的对象
            */
            @SerializedName("SSLBindedTargetSet")
                private List<SSLBindedTargetSet> sSLBindedTargetSet;


                public String getSSLId() {
                return this.sSLId;
                }

                public void setSSLId(String sSLId) {
                this.sSLId = sSLId;
                }




                public String getSSLName() {
                return this.sSLName;
                }

                public void setSSLName(String sSLName) {
                this.sSLName = sSLName;
                }




                public String getSSLMD5() {
                return this.sSLMD5;
                }

                public void setSSLMD5(String sSLMD5) {
                this.sSLMD5 = sSLMD5;
                }




                public Integer getCreateTime() {
                return this.createTime;
                }

                public void setCreateTime(Integer createTime) {
                this.createTime = createTime;
                }






}