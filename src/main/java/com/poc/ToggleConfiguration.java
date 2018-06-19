package com.poc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.spi.FeatureProvider;

/**
 * Created by vim758 on 6/19/18.
 */
@Configuration
public class ToggleConfiguration {

    /**
     *
     * @return EnumBasedFeatureProvider
     */
    @Bean
    public FeatureProvider featureProvider(){
        return new EnumBasedFeatureProvider(MOMSFeatures.class);
    }
}
