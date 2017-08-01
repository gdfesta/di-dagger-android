package com.gdfesta.di_dagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * {@link javax.inject.Scope} annotation for Dagger 2 to represent an Activity Scope
 *
 * @author gdfesta
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
