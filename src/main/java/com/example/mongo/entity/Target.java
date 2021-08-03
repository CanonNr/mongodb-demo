package com.example.mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Target implements Serializable {

    @Id
    private Integer id;

    /**
     * 任务ID
     */
    private String taskId;

    /**
     * 会话ID
     */
    private String sessionId;


    /**
     * 靶机类型：来自不同的模块
     */
    private Integer type;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 资源id：
     */
    private String sourceId;

    /**
     * flag
     */
    private String flag;

    /**
     * 靶机信息
     */
    private List<Info> info;

    /**
     * 镜像配置
     */
    private String imgConfig;

    /**
     * 0:未执行;1:生成;2:已死亡
     */
    private Integer status;

    /**
     * 销毁时间（时间戳）
     */
    private Integer destroyAt;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

}