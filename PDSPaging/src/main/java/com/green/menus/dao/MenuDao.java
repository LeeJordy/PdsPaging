package com.green.menus.dao;

import java.util.List;

import com.green.menus.vo.MenuVo;

public interface MenuDao {

	List<MenuVo> getMenuList();

	void insertMenu(MenuVo menuVo);

	void insertMenu2(MenuVo menuVo);

	void deleteMenu(MenuVo menuVo);

	MenuVo getMenu(MenuVo menuVo);

	void updateMenu(MenuVo menuVo);

	String getMenuName(String menu_id);

}
