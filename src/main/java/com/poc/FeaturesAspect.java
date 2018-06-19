package com.poc;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;



/**
 * Created by vim758 on 6/19/18.
 */

@Aspect
@Component
public class FeaturesAspect {
    private static final Logger LOG = LogManager.getLogger(FeaturesAspect.class);

    @Around(
            "@within(enableFeature) || @annotation(enableFeature)"
    )
    public Object checkAspect(ProceedingJoinPoint joinPoint,
                              EnableFeature enableFeature) throws Throwable {

        if (enableFeature.value().isActive()) {
            return joinPoint.proceed();
        } else {
            LOG.info(
                    "Feature " + enableFeature.value().name() + " is not enabled!");
            return null;
        }
    }

}
