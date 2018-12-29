package cn.ucloud.vpc.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.model.DescribeSubnetParam;
import cn.ucloud.vpc.model.DescribeSubnetResult;
import cn.ucloud.vpc.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description: unet客户端 默认实现
 * @author: codezhang
 * @date: 2018-09-21 16:32
 **/
public class DescribeSubnetTest {



    private VPCClient client;

    private DescribeSubnetParam param;


    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeSubnetParam("cn-bj2");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeSubnet() {
        try {
            DescribeSubnetResult describeSubnetResult = client.describeSubnet(param);
            System.out.println(describeSubnetResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}