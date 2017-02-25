package service;

public class Utility {	
    public static String format(String query, String[] params) {
        for (int i = 0; i < params.length; i++) {
            query = query.replaceAll("#" + i, params[i]);
        }
        return query;
    }
}
