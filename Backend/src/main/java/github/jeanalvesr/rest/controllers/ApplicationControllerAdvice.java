package github.jeanalvesr.rest.controllers;

import github.jeanalvesr.exceptions.AtributoIlegalException;
import github.jeanalvesr.exceptions.EntityNotFound;
import github.jeanalvesr.rest.ApiErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler(AtributoIlegalException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleDataException(AtributoIlegalException e){
        String mensagemErro = e.getMessage();
        return new ApiErrors(mensagemErro);
    }

    @ExceptionHandler(EntityNotFound.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleDataException(EntityNotFound e){
        String mensagemErro = e.getMessage();
        return new ApiErrors(mensagemErro);
    }

}