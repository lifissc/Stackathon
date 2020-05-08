package com.simplemall.micro.serv.common.constant;

/**
 * system constant
 * 
 * @author lifissc
 *
 */
public interface SystemConstants {
	public static final String API_KEY = "9223a431a6e24355901e95a521bb3455";

	public static final class Code {
		public static final String SUCCESS = "1";

		public static final String FAIL = "0";
		/**
		 * @Fields ok : success
		 */
		public static final int success = 1;
		/**
		 * @Fields error : fail
		 */
		public static final int error = 0;
	}

	/**
	 * transaction type
	 * 
	 * @author lifissc
	 *
	 */
	public static final class PAY_TYPE {

		public static final String ALIPAY = "ALIPAY";

		public static final String TENPAY = "TENPAY";

		public static final String CARD = "CARD";
	}
}
