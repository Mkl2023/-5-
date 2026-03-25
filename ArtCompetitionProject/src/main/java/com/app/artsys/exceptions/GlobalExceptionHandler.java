package com.app.artsys.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleAllExceptions(Exception ex, Model model) {
        model.addAttribute("errorMessage", "Произошла системная ошибка: " + ex.getMessage());
        model.addAttribute("recommendation", "Пожалуйста, проверьте корректность введенных данных или обратитесь к администратору.");
        return "error_page";
    }
}
