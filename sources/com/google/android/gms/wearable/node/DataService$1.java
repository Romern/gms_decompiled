package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataService$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ axxv f110978a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataService$1(axxv axxv, String str) {
        super(str);
        this.f110978a = axxv;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        this.f110978a.mo53745c();
        new soa(10, new axxk(this.f110978a)).start();
    }
}
