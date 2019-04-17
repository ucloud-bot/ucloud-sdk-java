package cn.ucloud.censor.client;

import cn.ucloud.censor.model.CreateUAICensorResourceParam;
import cn.ucloud.censor.model.CreateUAICensorResourceResult;
import cn.ucloud.censor.model.GetUAICensorAvailResourceTypeParam;
import cn.ucloud.censor.model.GetUAICensorAvailResourceTypeResult;
import cn.ucloud.censor.model.GetUAICensorResourceListParam;
import cn.ucloud.censor.model.GetUAICensorResourceListResult;
import cn.ucloud.censor.model.ModifyUAICensorResourceMemoParam;
import cn.ucloud.censor.model.ModifyUAICensorResourceMemoResult;
import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;

/**
 * @Description : censor 客户端接口
 * @Author : codezhang
 * @Date : 2019-04-17 10:47
 **/
public interface CensorClient extends UcloudClient {

    /**
     * 修改UAI安全审查资源备注
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyUAICensorResourceMemoResult modifyUAICensorResourceMemo(
            ModifyUAICensorResourceMemoParam param) throws Exception;

    /**
     * 修改UAI安全审查资源备注 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyUAICensorResourceMemo(ModifyUAICensorResourceMemoParam param,
                                  UcloudHandler<ModifyUAICensorResourceMemoResult> handler,
                                  Boolean... asyncFlag);


    /**
     * 获取UAI安全审查资源列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetUAICensorResourceListResult getUAICensorResourceList(
            GetUAICensorResourceListParam param) throws Exception;

    /**
     * 获取UAI安全审查资源列表 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getUAICensorResourceList(GetUAICensorResourceListParam param,
                                  UcloudHandler<GetUAICensorResourceListResult> handler,
                                  Boolean... asyncFlag);

    /**
     * 创建UAI安全审查资源
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateUAICensorResourceResult createUAICensorResource(
            CreateUAICensorResourceParam param) throws Exception;

    /**
     * 创建UAI安全审查资源 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createUAICensorResource(CreateUAICensorResourceParam param,
                                 UcloudHandler<CreateUAICensorResourceResult> handler,
                                 Boolean... asyncFlag);


    /**
     * 获取可用的UAI安全审查资源类型
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetUAICensorAvailResourceTypeResult getUAICensorAvailResourceType(
            GetUAICensorAvailResourceTypeParam param) throws Exception;

    /**
     * 获取可用的UAI安全审查资源类型 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getUAICensorAvailResourceType(GetUAICensorAvailResourceTypeParam param,
                                       UcloudHandler<GetUAICensorAvailResourceTypeResult> handler,
                                       Boolean... asyncFlag);

}
