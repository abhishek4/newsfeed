package service;

public class QueryStrings {
    public static final String IS_VALID_USER = "select count(*) from userinfo where email='#0' and password='#1'";
    public static final String IS_USER_EXIST = "select count(*) from userinfo where email='#0'";
    public static final String ALL_USER_INFO_S = "select * from userinfo where #0='#1'";
    public static final String ALL_USER_INFO_NS = "select * from userinfo where #0=#1";
}
