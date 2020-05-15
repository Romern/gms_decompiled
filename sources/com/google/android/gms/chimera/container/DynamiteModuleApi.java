package com.google.android.gms.chimera.container;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.container.ModuleApi;
import java.io.File;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DynamiteModuleApi extends ModuleApi {
    public Set getInstrumentationFilterRules(Context context) {
        qnw a = qnw.m32533a(context);
        if (a != null) {
            return a.f41809c;
        }
        return null;
    }

    public void onApkLoaded(Context context) {
        try {
            ModuleApi.m4868a(context.getClassLoader().loadClass("com.google.android.gms.chimera.DynamiteModuleInitializer").getDeclaredMethod("initializeModuleV1", Context.class), context);
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("Failed to set dynamite application context: ");
            sb.append(valueOf);
            Log.i("DynamiteModuleApi", sb.toString());
        }
    }

    public void onBeforeApkLoad(Context context, dht dht) {
        if (dht instanceof dgl) {
            dgl dgl = (dgl) dht;
            dgl.f13063a = "com.google.android.gms.chimera.DynamiteModuleInitializer";
            dgl.f13064b = new File(context.getFilesDir(), ".gms-dynamite-code-cache").getAbsolutePath();
            dgl.f13065c = dgl.mo8959h();
        }
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
