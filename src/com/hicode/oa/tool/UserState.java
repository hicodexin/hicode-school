package com.hicode.oa.tool;

import java.io.Serializable;

/**
 * 用户禁用状态
 * 
 * @author Administrator
 *
 */
public class UserState implements Serializable {

	private static final long serialVersionUID = 132134541546451L;

	/**
	 * id
	 */
	private Integer state_id;
	/**
	 * 用户状态（0：未锁定；1：已禁用；）
	 */
	private Integer state_type;

	public Integer getState_id() {
		return state_id;
	}

	public void setState_id(Integer state_id) {
		this.state_id = state_id;
	}

	public Integer getState_type() {
		return state_type;
	}

	public void setState_type(Integer state_type) {
		this.state_type = state_type;
	}

	@Override
	public String toString() {
		return "UserState [state_id=" + state_id + ", state_type=" + state_type + "]";
	}

	

}
