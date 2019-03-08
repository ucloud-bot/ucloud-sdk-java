package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description :  模型类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class TrafficDaily  {
            /**
            * 日期
            */
            @SerializedName("Date")
                private Integer date;
            /**
            * 流量（单位GB）
            */
            @SerializedName("Traffic")
                private Integer traffic;
            /**
            * Yes:已扣费, No:未扣费
            */
            @SerializedName("BillingState")
                private String billingState;


                public Integer getDate() {
                return this.date;
                }

                public void setDate(Integer date) {
                this.date = date;
                }




                public Integer getTraffic() {
                return this.traffic;
                }

                public void setTraffic(Integer traffic) {
                this.traffic = traffic;
                }




                public String getBillingState() {
                return this.billingState;
                }

                public void setBillingState(String billingState) {
                this.billingState = billingState;
                }






}