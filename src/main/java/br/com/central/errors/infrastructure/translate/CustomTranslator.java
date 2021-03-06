package br.com.central.errors.infrastructure.translate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class CustomTranslator {

    static MessageSource messageSource;

    @Autowired
    CustomTranslator(@Qualifier("messageSource") MessageSource msg) {
        CustomTranslator.messageSource = msg;
    }

    public static String toLocale(String msg) {
        return messageSource.getMessage(msg, null, LocaleContextHolder.getLocale());
    }

    public static String toLocale(String msg, String... args) {
        return messageSource.getMessage(msg, args, LocaleContextHolder.getLocale());
    }
}
