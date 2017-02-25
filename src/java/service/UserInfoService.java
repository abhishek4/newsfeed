package service;

import java.util.ArrayList;

public class UserInfoService {

    boolean isValidUser(String email, String password) {
        String[] params = {email, password};
        String query = Utility.format(QueryStrings.IS_VALID_USER, params);
        ArrayList<Object> data = DBConnection.getResults(query);
        if(data.size() == 1)
            return true;
        else
            return false;
    }
}
