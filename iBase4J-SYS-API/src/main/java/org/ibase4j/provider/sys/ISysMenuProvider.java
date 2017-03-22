package org.ibase4j.provider.sys;

import java.util.List;
import java.util.Map;

import org.ibase4j.core.base.BaseProvider;
import org.ibase4j.model.sys.SysMenu;

public interface ISysMenuProvider extends BaseProvider<SysMenu> {

    /** 获取所有权限选项(value-text) */
    public List<Map<String, String>> getPermissions();
}
