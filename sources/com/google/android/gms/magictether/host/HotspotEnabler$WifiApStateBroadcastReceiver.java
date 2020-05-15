package com.google.android.gms.magictether.host;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HotspotEnabler$WifiApStateBroadcastReceiver extends aacn {

    /* renamed from: a */
    public final Handler f79819a = new adzt();

    /* renamed from: b */
    public Runnable f79820b;

    /* renamed from: c */
    public final /* synthetic */ afan f79821c;

    /* renamed from: d */
    private final ResultReceiver f79822d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HotspotEnabler$WifiApStateBroadcastReceiver(afan afan, ResultReceiver resultReceiver) {
        super("auth_magictether");
        this.f79821c = afan;
        this.f79822d = resultReceiver;
    }

    /* renamed from: a */
    public final void mo43838a(Context context, int i) {
        afan afan = this.f79821c;
        ResultReceiver resultReceiver = this.f79822d;
        long j = afan.f64089a;
        afan.mo34713a(resultReceiver, i, null);
        context.unregisterReceiver(this);
        this.f79819a.removeCallbacks(this.f79820b);
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.net.wifi.WIFI_AP_STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("wifi_state", -1);
            if (intExtra == 13) {
                mo43838a(context, 0);
            } else if (intExtra == 14) {
                mo43838a(context, 2);
            }
        }
    }
}
