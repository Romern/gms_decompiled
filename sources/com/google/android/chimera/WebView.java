package com.google.android.chimera;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WebView extends android.webkit.WebView {
    public WebView(Context context) {
        super(context);
        m4861a(context);
    }

    /* renamed from: a */
    private static final void m4861a(Context context) {
        int i = Build.VERSION.SDK_INT;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null) {
            dht moduleApk = moduleContext.getModuleApk();
            if (!(moduleApk instanceof dfz)) {
                try {
                    ApplicationInfo overrideApplicationInfo = moduleContext.overrideApplicationInfo(moduleApk.mo8907a());
                    try {
                        new android.webkit.WebView(context);
                    } finally {
                        moduleContext.overrideApplicationInfo(overrideApplicationInfo);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    String obj = moduleApk.toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 77);
                    sb.append("Failed to obtain the resources for ");
                    sb.append(obj);
                    sb.append(". Skipping injection of WebView resources.");
                    Log.e("ChimeraWebView", sb.toString(), e);
                }
            }
        }
    }

    public WebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4861a(context);
    }

    public WebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4861a(context);
    }

    public WebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m4861a(context);
    }

    public WebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
        m4861a(context);
    }
}
