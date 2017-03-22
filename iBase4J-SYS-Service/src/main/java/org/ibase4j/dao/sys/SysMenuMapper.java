package org.ibase4j.dao.sys;

import java.util.List;
import java.util.Map;

import org.ibase4j.core.base.BaseMapper;
import org.ibase4j.model.sys.SysMenu;

public interface SysMenuMapper extends BaseMapper<SysMenu> {
    /** 获取所有权限 */
    public List<Map<String, String>> getPermissions();
}