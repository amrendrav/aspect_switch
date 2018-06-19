package com.poc;


import org.togglz.core.Feature;
import org.togglz.core.activation.SystemPropertyActivationStrategy;
import org.togglz.core.activation.UserRoleActivationStrategy;
import org.togglz.core.annotation.ActivationParameter;
import org.togglz.core.annotation.DefaultActivationStrategy;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

/**
 * Created by vim758 on 6/19/18.
 */
public enum MOMSFeatures implements Feature {


    @Label("A2C Management Feature")
    @EnabledByDefault
    @DefaultActivationStrategy(id = SystemPropertyActivationStrategy.ID,
            parameters = {  @ActivationParameter(name = SystemPropertyActivationStrategy.PARAM_PROPERTY_NAME, value = "a2c.feature"),
                            @ActivationParameter(name = SystemPropertyActivationStrategy.PARAM_PROPERTY_VALUE, value = "true") })
    A2C_MANAGEMENT_FEATURE,


    @Label("MLP Management Feature")
    @EnabledByDefault
    @DefaultActivationStrategy(id = UserRoleActivationStrategy.ID,
            parameters = {  @ActivationParameter(name = UserRoleActivationStrategy.PARAM_ROLES_NAME, value = "sthing"),
                            @ActivationParameter(name = SystemPropertyActivationStrategy.PARAM_PROPERTY_VALUE, value = "false") })
    MLP_MANAGEMENT_FEATURE;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }


}
