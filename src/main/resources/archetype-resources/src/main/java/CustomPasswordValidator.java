package $package;

import java.util.Map;

import org.wso2.carbon.identity.mgt.policy.AbstractPasswordPolicyEnforcer;

public class CustomPasswordValidator extends AbstractPasswordPolicyEnforcer {

	@Override
	public void init(Map<String, String> params) {

		/**
		 * initialization method, loads the properties from 
		 * identity-mgt.properties file to Map<String, String>
		 */

		// TODO: initialize variables from properties file and etc.
	}

	@Override
	public boolean enforce(Object... args) {

		// TODO: implement your password validator logic ...

		/**
		 * HINT: 
		 * retrieve the username and password entered using 
		 * the following snippet
		 * 
		 * String password = args[0].toString();
		 * String username = args[1].toString();
		 */

		return false;
	}

}
