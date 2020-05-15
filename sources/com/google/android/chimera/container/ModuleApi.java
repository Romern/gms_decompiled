package com.google.android.chimera.container;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleApi {
    /* renamed from: a */
    protected static final void m4868a(Method method, Object... objArr) {
        try {
            method.invoke(null, objArr);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Exception) {
                throw ((Exception) cause);
            }
            throw new Exception(cause);
        } catch (VerifyError e2) {
            throw new Exception(e2);
        }
    }

    public Set getInstrumentationFilterRules(Context context) {
        return null;
    }

    public void onApkLoaded(Context context) {
    }

    public void onBeforeApkLoad(Context context, dht dht) {
    }
}
