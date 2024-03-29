package com.tower.smartservice.bean.response;

import com.tower.smartservice.bean.db.UserEntity;

import com.google.gson.annotations.Expose;

import javax.annotation.Nonnull;

/**
 * AccountRspModel
 *
 * @author zpsong-tower <pingzisong2012@gmail.com>
 * @since 2021/6/2 17:07
 */
public class AccountCard {
	@Expose
	private UserCard userCard;

	@Expose
	private String phone;

	@Expose
	private String token;

	@Expose
	private boolean isBind;

	public AccountCard(@Nonnull UserEntity user) {
		this(user, false);
	}

	public AccountCard(@Nonnull UserEntity user, boolean isBind) {
		this.userCard = new UserCard(user);
		this.phone = user.getPhone();
		this.token = user.getToken();
		this.isBind = isBind;
	}

	public UserCard getUserCard() {
		return userCard;
	}

	public void setUserCard(UserCard userCard) {
		this.userCard = userCard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean isBind() {
		return isBind;
	}

	public void setBind(boolean bind) {
		isBind = bind;
	}
}
