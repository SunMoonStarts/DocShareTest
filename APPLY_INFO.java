package bean;

import java.math.BigDecimal;

public class APPLY_INFO {
	private BigDecimal APPLY_ID;
	private String APPLY_TIME;
	private BigDecimal APPLY_NUM;
	private String CHECK_NAME;
	private String APPLY_NAME;
	private String CHECK_TIME;
	private String CHECK_STATE;
	private String CHECK_NUM;
	
	
	
	public APPLY_INFO(BigDecimal aPPLY_ID, String aPPLY_TIME, BigDecimal aPPLY_NUM, String cHECK_NAME,
			String aPPLY_NAME, String cHECK_TIME, String cHECK_STATE, String cHECK_NUM) {
		super();
		APPLY_ID = aPPLY_ID;
		APPLY_TIME = aPPLY_TIME;
		APPLY_NUM = aPPLY_NUM;
		CHECK_NAME = cHECK_NAME;
		APPLY_NAME = aPPLY_NAME;
		CHECK_TIME = cHECK_TIME;
		CHECK_STATE = cHECK_STATE;
		CHECK_NUM = cHECK_NUM;
	}

	 

	public String getAPPLY_NAME() {
		return APPLY_NAME;
	}

	public void setAPPLY_NAME(String aPPLY_NAME) {
		APPLY_NAME = aPPLY_NAME;
	}

	public BigDecimal getAPPLY_ID() {
		return APPLY_ID;
	}

	public void setAPPLY_ID(BigDecimal aPPLY_ID) {
		APPLY_ID = aPPLY_ID;
	}

	public String getAPPLY_TIME() {
		return APPLY_TIME;
	}

	public String getCHECK_NUM() {
		return CHECK_NUM;
	}

	public void setCHECK_NUM(String cHECK_NUM) {
		CHECK_NUM = cHECK_NUM;
	}

	public void setAPPLY_TIME(String aPPLY_TIME) {
		APPLY_TIME = aPPLY_TIME;
	}

	public BigDecimal getAPPLY_NUM() {
		return APPLY_NUM;
	}

	public void setAPPLY_NUM(BigDecimal aPPLY_NUM) {
		APPLY_NUM = aPPLY_NUM;
	}

	public String getCHECK_NAME() {
		return CHECK_NAME;
	}

	public void setCHECK_NAME(String cHECK_NAME) {
		CHECK_NAME = cHECK_NAME;
	}

	public String getCHECK_TIME() {
		return CHECK_TIME;
	}

	public void setCHECK_TIME(String cHECK_TIME) {
		CHECK_TIME = cHECK_TIME;
	}

	public String getCHECK_STATE() {
		return CHECK_STATE;
	}

	public void setCHECK_STATE(String cHECK_STATE) {
		CHECK_STATE = cHECK_STATE;
	}

	public APPLY_INFO() {
		super();
	}

	public APPLY_INFO(BigDecimal aPPLY_ID, String aPPLY_TIME, BigDecimal aPPLY_NUM, String cHECK_NAME,
			String cHECK_TIME, String cHECK_STATE) {
		super();
		APPLY_ID = aPPLY_ID;
		APPLY_TIME = aPPLY_TIME;
		APPLY_NUM = aPPLY_NUM;
		CHECK_NAME = cHECK_NAME;
		CHECK_TIME = cHECK_TIME;
		CHECK_STATE = cHECK_STATE;
	}
}
