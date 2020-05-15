package com.google.android.gms.trustagent.trustlet.device.bluetooth.internal;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothConnectionTracker$IntervalBasedDeviceTimer$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ ausy f109167a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothConnectionTracker$IntervalBasedDeviceTimer$1(ausy ausy, String str) {
        super(str);
        this.f109167a = ausy;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (this.f109167a.f92450c.equals(intent.getAction())) {
            for (ausx ausx : this.f109167a.f92451d) {
                String stringExtra = intent.getStringExtra("key-timer-extra-device-address");
                synchronized (ausy.f92448a) {
                    if (this.f109167a.f92449b.containsKey(stringExtra)) {
                        ausy ausy = this.f109167a;
                        ausy.mo50890a(stringExtra, ((Integer) ausy.f92449b.get(stringExtra)).intValue() + 1);
                    } else {
                        this.f109167a.mo50893c(stringExtra);
                    }
                }
                ausx.mo50887a(stringExtra);
            }
        }
    }
}
