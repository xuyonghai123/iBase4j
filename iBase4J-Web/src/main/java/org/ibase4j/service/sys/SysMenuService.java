package org.ibase4j.service.sys;

import java.util.List;
import java.util.Map;

import org.ibase4j.core.base.BaseService;
import org.ibase4j.core.support.dubbo.spring.annotation.DubboReference;
import org.ibase4j.model.sys.SysMenu;
import org.ibase4j.provider.sys.ISysMenuProvider;
import org.springframework.stereotype.Service;

/**
 * @author ShenHuaJie
 * @version 2016年5月20日 下午3:16:07
 */
@Service
public class SysMenuService extends BaseService<ISysMenuProvider, SysMenu> {
    @DubboReference
    public void setProvider(ISysMenuProvider provider) {
        this.provider = provider;
    }

    public List<Map<String, String>> getPermissions() {
        return provider.getPermissions();
    }
}
