package com.inaya.recettesDuMonde.restImpl;

import com.inaya.recettesDuMonde.constants.RecettesConstants;
import com.inaya.recettesDuMonde.rest.UserRest;
import com.inaya.recettesDuMonde.service.UserService;
import com.inaya.recettesDuMonde.utils.RecettesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {
    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try {
            return userService.signUp(requestMap);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return RecettesUtils.getResponseEntity(RecettesConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<String> login(Map<String, String> requestMap) {
        try {
            return userService.login(requestMap);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return RecettesUtils.getResponseEntity(RecettesConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
