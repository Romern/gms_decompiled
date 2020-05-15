package com.google.android.gms.car.bluetooth;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothUtil$AdapterStateChangeReceiver extends TracingBroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ nyr f29468a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothUtil$AdapterStateChangeReceiver(nyr nyr) {
        super("car");
        this.f29468a = nyr;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        bnsn bnsn = nyr.f36964a;
        intent.getAction();
        if (this.f29468a.f36977n != 0) {
            return;
        }
        if (!"android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            bnsi b = nyr.f36964a.mo68387b();
            b.mo68432a("com.google.android.gms.car.bluetooth.BluetoothUtil$AdapterStateChangeReceiver", "a", 600, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("AdapterStateChangeReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
        if (intExtra == 12) {
            bmxy.m108581a(this.f29468a.f36966c);
            this.f29468a.f36966c.mo21821c();
            this.f29468a.f36969f.mo20945a();
        } else if (intExtra == 10) {
            nyl nyl = this.f29468a.f36978o;
            if (nyl != null) {
                nyl.mo21849e();
                this.f29468a.f36978o = null;
            }
            this.f29468a.f36969f.mo20949b();
        }
    }
}
