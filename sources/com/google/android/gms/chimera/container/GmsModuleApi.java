package com.google.android.gms.chimera.container;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.chimera.container.ModuleApi;
import com.google.android.gms.chimera.GmsModuleInitializer;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsModuleApi extends ModuleApi {
    public Set getInstrumentationFilterRules(Context context) {
        qnw a = qnw.m32533a(context);
        if (a != null) {
            return a.f41809c;
        }
        return null;
    }

    public void onApkLoaded(Context context) {
        ModuleApi.m4868a(context.getClassLoader().loadClass(GmsModuleInitializer.class.getName()).getMethod("initializeModuleV0", Context.class, BaseApplicationContext.class), context, rpr.m34216b());
    }

    public void onBeforeApkLoad(Context context, dht dht) {
        qnw a = qnw.m32533a(context);
        if (a != null) {
            String a2 = a.mo24143a();
            if (!TextUtils.isEmpty(a2)) {
                dht.f13187g = a2;
            }
            String b = a.mo24144b();
            if (!TextUtils.isEmpty(b)) {
                dht.f13188h = b;
            }
        }
    }
}
