package com.google.android.gms.ads;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.webkit.WebView;
import com.google.android.chimera.Service;
import com.google.android.gms.ads.eventattestation.C0243c;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AdRequestBrokerChimeraService extends Service {

    /* renamed from: a */
    private static boolean f7823a = false;

    /* renamed from: b */
    private static synchronized void m5036b() {
        synchronized (AdRequestBrokerChimeraService.class) {
            int i = Build.VERSION.SDK_INT;
            if (!f7823a) {
                f7823a = true;
                WebView.setDataDirectorySuffix("admob-service");
            }
        }
    }

    /* renamed from: a */
    public final void mo6370a() {
        C0243c.m5113a(this).mo6449a();
    }

    public final IBinder onBind(Intent intent) {
        C0371o.m5339a(this);
        m5036b();
        mo6370a();
        C0633h.m5664a("Binding to the ad request service.");
        if ("com.google.android.gms.ads.service.START".equals(intent.getAction())) {
            return new fhn(this, this);
        }
        return null;
    }
}
