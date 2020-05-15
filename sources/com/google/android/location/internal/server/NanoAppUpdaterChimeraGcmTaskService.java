package com.google.android.location.internal.server;

import android.content.Context;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NanoAppUpdaterChimeraGcmTaskService extends aeah {

    /* renamed from: a */
    private static final bqgj f150812a = new soc(1, 10);

    /* renamed from: b */
    private static boolean f150813b = false;

    /* renamed from: c */
    private static final Object f150814c = new Object();

    /* renamed from: a */
    public static void m117274a(Context context) {
        synchronized (f150814c) {
            if (!f150813b) {
                f150813b = true;
                m117275a(context.getApplicationContext(), 1);
            }
        }
    }

    /* renamed from: b */
    public static void m117277b() {
        m117274a(rpr.m34216b());
    }

    /* renamed from: a */
    public static void m117275a(Context context, int i) {
        f150812a.execute(new bgcj(context, i));
    }

    /* renamed from: a */
    public static void m117276a(Context context, long j) {
        try {
            aebl aebl = new aebl();
            aebl.f63070a = j;
            aebl.f63102n = true;
            aebl.f63097i = "com.google.android.location.internal.NanoAppUpdaterGcmTaskService";
            aebl.mo34024a(1, 1);
            aebl.mo34023a(2);
            aebl.mo34027b(1);
            aebl.f63099k = "LocationNanoAppUpdate";
            aeat.m51532a(context).mo33984a(aebl.mo33974b());
        } catch (Exception e) {
            Log.e("NanoAppLifecycle", "Service: Scheduling periodic check", e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.location.internal.server.NanoAppUpdaterChimeraGcmTaskService.a(android.content.Context, int):void
     arg types: [com.google.android.location.internal.server.NanoAppUpdaterChimeraGcmTaskService, int]
     candidates:
      com.google.android.location.internal.server.NanoAppUpdaterChimeraGcmTaskService.a(android.content.Context, long):void
      aeah.a(aecc, aebu):bqgg
      aebd.a(aecc, aebu):bqgg
      com.google.android.location.internal.server.NanoAppUpdaterChimeraGcmTaskService.a(android.content.Context, int):void */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        new Object[1][0] = "Service:";
        m117275a((Context) this, 2);
        return 0;
    }
}
