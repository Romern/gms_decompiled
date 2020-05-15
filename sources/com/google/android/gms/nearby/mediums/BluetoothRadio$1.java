package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothRadio$1 extends aacn {

    /* renamed from: a */
    public final /* synthetic */ aikz f80650a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothRadio$1(aikz aikz, String str) {
        super(str);
        this.f80650a = aikz;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        aikz aikz = this.f80650a;
        aikz.f69104a.execute(new aiky(this, intent));
    }
}
