package com.google.android.gms.fitness.service.sensors;

import android.content.Intent;
import android.os.Message;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitSensorsChimeraBroker extends zme {
    public FitSensorsChimeraBroker() {
        super("com.google.android.gms.fitness.service.sensors.FitSensorsBroker");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo19167a() {
        return zas.f54897a.mo3214a();
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 100) {
            return super.handleMessage(message);
        }
        for (zon zon : this.f55433a.values()) {
            int beginBroadcast = zon.f55616k.beginBroadcast();
            while (beginBroadcast > 0) {
                beginBroadcast--;
                zon.mo31297a(zon.mo31296a(beginBroadcast));
            }
            zon.f55616k.finishBroadcast();
            zon.f55616k.kill();
        }
        return true;
    }

    public final void onDestroy() {
        this.f55436d.sendEmptyMessage(100);
        super.onDestroy();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zlz mo19168a(String str) {
        return new zon(this, str, this.f55436d, this.f55438f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo19169a(Intent intent) {
        return "com.google.android.gms.fitness.SensorsApi".equals(intent.getAction());
    }
}
