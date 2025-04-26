package ma.enset.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class SecurityAspect {
    private static String username;
    private static String password;

    @Around("execution(* ma.enset.Dessin.*(..))")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {
        if (username == null || password == null) {
            throw new RuntimeException("Authentication required");
        }
        return joinPoint.proceed();
    }

    public static void login(String user, String pass) {
        username = user;
        password = pass;
    }

    public static void logout() {
        username = null;
        password = null;
    }
} 