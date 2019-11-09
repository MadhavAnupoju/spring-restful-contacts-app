package com.spring.restful.contacts.app.common;

public interface DbQueries {
	String INSERT_CONCT="INSERT INTO CONTACT (ID, MOBILE, EMAIL, STATUS, CREATEDATE, LASTMODIFIED) VALUES (CONCT_SEQ_ID.NEXTVAL ,?,?,?,?,?)";
	String GET_ALL_CONCTS="SELECT ID, MOBILE, EMAIL, STATUS, CREATEDATE, LASTMODIFIED FROM CONTACT";
	String GET_CONCT_BY_ID="SELECT ID, MOBILE, EMAIL, STATUS, CREATEDATE, LASTMODIFIED FROM CONTACT WHERE ID=?";
	String UPDATE_CONCT_BY_ID="UPDATE CONTACT SET MOBILE =?, EMAIL =?, STATUS =?, LASTMODIFIED =? WHERE  ID =?";
	String DELETE_CONCT_BY_ID="DELETE FROM CONTACT WHERE ID =?";
	
	

}
