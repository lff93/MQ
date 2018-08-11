/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: QueueEnum
 * Author:   Lifeifei
 * Date:     2018/8/10 14:48
 * Description: 定义queue
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.constant;

/**
 * 〈定义queue〉
 *
 * @author Lifeifei
 * @create 2018/8/10
 * @since 1.0.0
 */
public enum QueueEnum {
    CARTY_QUEUE("carty.test.queue"),
    ORDER_QUEUE("order.queue");

    private String val;

    QueueEnum(String val) {
        this.val = val;
    }
}