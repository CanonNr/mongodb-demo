package com.example.mongo;

import com.example.mongo.entity.Info;
import com.example.mongo.entity.Target;
import com.example.mongo.repository.TargetRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@SpringBootTest
class MongoApplicationTests {

    @Resource
    TargetRepository targetRepository;

    @Test
    void contextLoads() {

//        LinkedList<Info> infos = new LinkedList<>();
//        infos.add(Info.builder().name("测试七").image("image7").build());
//        infos.add(Info.builder().name("测试四").image("image4").build());
//
//        Target target = Target.builder()
//                .id(400)
//                .flag("flag{"+UUID.randomUUID().toString().replace("-", "")+"}")
//                .info(infos)
//                .type(2)
//                .status(0)
//                .taskId(UUID.randomUUID().toString().replace("-", ""))
//                .build();
//        targetRepository.insert(target);


//        System.out.println(targetRepository.count());
//        List<Target> all = targetRepository.findAll();
//        System.out.println(all);

//        List<Target> byType = targetRepository.findByType(1);
//        System.out.println(byType);

        System.out.println(targetRepository.findByInfoName("测试三"));
    }

}
