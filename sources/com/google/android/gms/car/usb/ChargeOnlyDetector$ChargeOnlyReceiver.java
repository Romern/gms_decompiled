package com.google.android.gms.car.usb;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChargeOnlyDetector$ChargeOnlyReceiver extends TracingBroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ ona f29525a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChargeOnlyDetector$ChargeOnlyReceiver(ona ona) {
        super("car");
        this.f29525a = ona;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            ona ona = this.f29525a;
            bnsn bnsn = ona.f37985a;
            ona.mo22350a(ona.mo22351a(intent));
        }
    }
}
