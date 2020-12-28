
package com.mylink.sdk.admin.utils;

/**
 * @author:  admin
 * @date: 2020/6/11 15:49
 * @apiNote: 关于缓存的Key集合
 */
public interface CacheKey {

    /**
     * 用户
     */
    String USER_ID = "user::id:";
    /**
     * 数据
     */
    String DATE_USER = "data::user:";
    /**
     * 菜单
     */
    String MENU_USER = "menu::user:";
    /**
     * 角色授权
     */
    String ROLE_AUTH = "role::auth:";
    /**
     * 角色信息
     */
    String ROLE_ID = "role::id:";
}
