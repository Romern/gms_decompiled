package com.google.android.gms.magictether.host;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.magictether.logging.MetricTaskDurationTimerIntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HotspotEnabler$1 extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ ResultReceiver f79813a;

    /* renamed from: b */
    final /* synthetic */ afan f79814b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HotspotEnabler$1(afan afan, Handler handler, ResultReceiver resultReceiver) {
        super(handler);
        this.f79814b = afan;
        this.f79813a = resultReceiver;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        afan afan = this.f79814b;
        long j = afan.f64089a;
        MetricTaskDurationTimerIntentOperation.m67151b(afan.f64092c, "magictether_performance_provisioning_check_duration");
        if (i == 0) {
            afan afan2 = this.f79814b;
            ResultReceiver resultReceiver = this.f79813a;
            HotspotEnabler$WifiApStateBroadcastReceiver hotspotEnabler$WifiApStateBroadcastReceiver = new HotspotEnabler$WifiApStateBroadcastReceiver(afan2, resultReceiver);
            if (afan2.f64093d.mo34733c() == 13) {
                afan2.mo34713a(resultReceiver, 0, null);
                return;
            }
            hotspotEnabler$WifiApStateBroadcastReceiver.f79820b = new afam(hotspotEnabler$WifiApStateBroadcastReceiver);
            hotspotEnabler$WifiApStateBroadcastReceiver.f79821c.f64092c.registerReceiver(hotspotEnabler$WifiApStateBroadcastReceiver, new IntentFilter("android.net.wifi.WIFI_AP_STATE_CHANGED"));
            hotspotEnabler$WifiApStateBroadcastReceiver.f79819a.postDelayed(hotspotEnabler$WifiApStateBroadcastReceiver.f79820b, afan.f64090b);
            return;
        }
        this.f79814b.mo34713a(this.f79813a, 1, bundle);
    }
}
