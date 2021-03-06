package com.google.android.chimera.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ChimeraApiVersion(added = 101)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public @interface ChimeraApiVersion {
    long added();

    @ChimeraApiVersion(added = 108)
    long removed() default -1;
}
