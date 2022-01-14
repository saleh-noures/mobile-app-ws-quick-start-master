package com.appsdeveloperblog.app.ws.userservice;

import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;

import java.util.Map;

public interface UserService {
	UserRest createUser(UserDetailsRequestModel userDetails, Map<String, UserRest> users);
}
