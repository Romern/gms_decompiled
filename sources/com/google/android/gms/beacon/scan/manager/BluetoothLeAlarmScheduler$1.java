package com.google.android.gms.beacon.scan.manager;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothLeAlarmScheduler$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ String f29278a;

    /* renamed from: b */
    final /* synthetic */ ngc f29279b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothLeAlarmScheduler$1(String str, String str2, ngc ngc) {
        super(str);
        this.f29278a = str2;
        this.f29279b = ngc;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (this.f29278a.equals(intent.getAction())) {
            this.f29279b.f35476a.mo20592d();
        }
    }
}
