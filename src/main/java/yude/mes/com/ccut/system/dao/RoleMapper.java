package yude.mes.com.ccut.system.dao;


import org.apache.ibatis.annotations.*;
import yude.mes.com.ccut.system.domain.RoleDO;

import java.util.List;

public interface RoleMapper {
	@Select("SELECT role_id, role_name, role_sign, remark, user_id_create, gmt_create, gmt_modified FROM sys_role")
	@Results({ @Result(property = "roleId", column = "role_id"), @Result(property = "roleName", column = "role_name") })
	List<RoleDO> listRole();

	@Insert("INSERT INTO sys_role(role_id, role_name, role_sign, remark, user_id_create, gmt_create, gmt_modified)VALUES(#{roleId}, #{roleName}, #{roleSign}, #{remark}, #{userIdCreate}, #{gmtCreate}, #{gmtModified})")
	@Options(useGeneratedKeys = true,keyProperty="roleId")
	int save(RoleDO role);

	@Delete("DELETE FROM sys_role WHERE role_id=#{id}")
	int remove(Long id);

	@Select("SELECT role_id, role_name, role_sign, remark, user_id_create, gmt_create, gmt_modified FROM sys_role where role_id = #{roleId}")
	@Results({ @Result(property = "roleId", column = "role_id"), @Result(property = "roleName", column = "role_name") })
	RoleDO get(Long id);

	@Update("update sys_role set role_name = #{roleName}, remark=#{remark} where role_id=#{roleId}")
	int update(RoleDO role);

	@Delete("<script>"+
			"delete from sys_role where role_id in "+
			"<foreach collection=\"list\" index=\"i\" open=\"(\" separator=\",\" close=\")\" item=\"item\"  >#{item}</foreach>"+
			"</script>")
	int batchRemove(List<Long> list);
}
