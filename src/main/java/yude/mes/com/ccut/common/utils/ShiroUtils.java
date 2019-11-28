package yude.mes.com.ccut.common.utils;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import yude.mes.com.ccut.system.domain.SysUserDO;

public class ShiroUtils {
	public static Subject getSubjct() {
		return SecurityUtils.getSubject();
	}
	public static SysUserDO getUser() {
		return (SysUserDO)getSubjct().getPrincipal();
	}
	public static Long getUserId() {
		return getUser().getUserId();
	}
	public static void logout() {
		getSubjct().logout();
	}
}
