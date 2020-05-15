package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmSenderChimeraProxy extends BroadcastReceiver {

    /* renamed from: b */
    static asfb f32799b;

    /* renamed from: a */
    public static void m24315a() {
        asfb asfb = f32799b;
        if (asfb != null) {
            asfb.mo49120c();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        aajg.m21335a(context);
        for (String str : intent.getExtras().keySet()) {
            if (str.startsWith("GOOG.") || str.startsWith("GOOGLE.")) {
                intent.removeExtra(str);
            }
        }
        if (aajg.m21344d() != 0) {
            intent.putExtra("GOOGLE.UAID", aakb.m21381a().f28341b.mo16954b());
        }
        GcmProxyIntentOperation.m24313a(context, intent);
    }

    /* renamed from: a */
    static synchronized void m24316a(Context context) {
        synchronized (GcmSenderChimeraProxy.class) {
            if (f32799b == null) {
                asfb asfb = new asfb(context, 1, "GCMSEND", null, "com.google.android.gms");
                f32799b = asfb;
                asfb.mo49115a(false);
            }
            f32799b.mo49111a(500);
        }
    }
}
