package yude.mes.com.ccut.system.service;


import org.springframework.stereotype.Service;
import yude.mes.com.ccut.system.domain.RoleDO;

import java.util.List;

@Service
public interface RoleService {
	RoleDO get(Long id);
	List<RoleDO> list();
	int save(RoleDO role);
	int update(RoleDO role);
	int remove(Long id);
	List<RoleDO> list(Long userId);

    int batchremove(List<Long> ids);
}
