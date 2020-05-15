package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.util.p */
final /* synthetic */ class C0659p implements Callable {

    /* renamed from: a */
    private final Context f9018a;

    /* renamed from: b */
    private final WebSettings f9019b;

    public C0659p(Context context, WebSettings webSettings) {
        this.f9018a = context;
        this.f9019b = webSettings;
    }

    public final Object call() {
        Context context = this.f9018a;
        WebSettings webSettings = this.f9019b;
        if (context.getCacheDir() != null) {
            webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
            webSettings.setAppCacheMaxSize(0);
            webSettings.setAppCacheEnabled(true);
        }
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        webSettings.setAllowContentAccess(false);
        return true;
    }
}
