package com.google.android.gms.wearable.node.ble;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleConnectionManager$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ aybu f110988a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BleConnectionManager$1(aybu aybu, String str) {
        super(str);
        this.f110988a = aybu;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        aybu aybu = this.f110988a;
        int i = aybu.f97038z;
        if (!((ConnectionConfiguration) aybu.f97057g.get()).f110868e) {
            return;
        }
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
            if (intExtra == 10 || intExtra == 12) {
                this.f110988a.mo53899d(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10));
            }
        } else if ("android.gms.wearable.altReconnect".equals(intent.getAction())) {
            this.f110988a.mo53895b(9);
        }
    }
}
