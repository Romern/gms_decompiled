package com.google.android.gms.mdisync.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdiSyncGcmChimeraBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private static final bnsn f80041b = afvx.m53604b();

    /* renamed from: c */
    private final bmzi f80042c;

    public MdiSyncGcmChimeraBroadcastReceiver() {
        this(afxb.f64905a);
    }

    public final void onReceive(Context context, Intent intent) {
        if (!cfgy.m139569f() || !cfgy.f184062a.mo6606a().mo81225j()) {
            bnsi d = f80041b.mo68390d();
            d.mo68432a("com.google.android.gms.mdisync.service.MdiSyncGcmChimeraBroadcastReceiver", "onReceive", 32, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Disabled - skipping GCM push notification handling.");
            return;
        }
        bnsi d2 = f80041b.mo68390d();
        d2.mo68432a("com.google.android.gms.mdisync.service.MdiSyncGcmChimeraBroadcastReceiver", "onReceive", 36, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68405a("Received GCM push notification!");
        afxa afxa = (afxa) this.f80042c.mo6606a();
        if (intent != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            bngs j = bngx.m109377j();
            for (afwn afwn : afxa.f64904b) {
                j.mo67668c(afwn.mo35018a(intent));
            }
            bngx a = j.mo67664a();
            bqga.m112781a(bqga.m112782b(a).mo69216a(new afwy(a), bqfb.INSTANCE), new afwz(goAsync), bqfb.INSTANCE);
            return;
        }
        bnsi d3 = afxa.f64903a.mo68390d();
        d3.mo68432a("afxa", "a", 34, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d3.mo68405a("Skipping push message handling due to null intent...");
    }

    public MdiSyncGcmChimeraBroadcastReceiver(bmzi bmzi) {
        this.f80042c = bmzi;
    }
}
