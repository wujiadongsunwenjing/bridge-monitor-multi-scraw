/**
 * Copyright(C),2022,华设检测科技有限公司
 * FileName:AsyncMongoService
 * Author: WJD
 * Date: 2022/8/26 15:52
 * Description: 消费雷图设备,异步访问mogodb服务
 */
package cn.com.cdg.hsjc.mongodb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Collections;

@Async
@Service
@Slf4j
public class AsyncMongoService {

    @Resource
    private MongoTemplate template;

    @Async
    public <E> Collection<E> insert(Collection<E> list, String table) {
        if (list == null || list.size() == 0) {
            log.warn("list集合为空");
            return Collections.emptyList();
        }
        return template.insert(list, table);
    }

}
