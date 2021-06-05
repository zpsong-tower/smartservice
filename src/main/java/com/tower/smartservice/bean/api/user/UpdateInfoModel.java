package com.tower.smartservice.bean.api.user;

import com.google.gson.annotations.Expose;
import com.tower.smartservice.bean.db.UserEntity;
import com.tower.smartservice.utils.TextUtil;

import javax.annotation.Nonnull;

/**
 * 更新用户信息Model
 *
 * @author zpsong-tower <pingzisong2012@gmail.com>
 * @since 2021/6/5 18:52
 */
public class UpdateInfoModel {
	@Expose
	private String name;

	@Expose
	private String portrait;

	@Expose
	private String description;

	@Expose
	private int sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPortrait() {
		return portrait;
	}

	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	/**
	 * 把当前Model实例中的数据填充到UserEntity中
	 *
	 * @param user UserEntity
	 * @return User UserEntity
	 */
	public UserEntity updateToUser(@Nonnull UserEntity user) {
		if (!TextUtil.isEmpty(name)) {
			user.setName(name);
		}
		if (!TextUtil.isEmpty(portrait)) {
			user.setPortrait(portrait);
		}
		if (!TextUtil.isEmpty(description)) {
			user.setDescription(description);
		}
		if (sex != UserEntity.SEX_TYPE_UNKNOWN) {
			user.setSex(sex);
		}
		return user;
	}

	public static boolean isAvailable(UpdateInfoModel model) {
		return model != null
				&& (!TextUtil.isEmpty(model.name) || !TextUtil.isEmpty(model.portrait)
				|| !TextUtil.isEmpty(model.description) || model.sex != UserEntity.SEX_TYPE_UNKNOWN);
	}
}