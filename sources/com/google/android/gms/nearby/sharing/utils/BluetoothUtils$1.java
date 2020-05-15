package com.google.android.gms.nearby.sharing.utils;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothUtils$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bqgy f81142a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothUtils$1(String str, bqgy bqgy) {
        super(str);
        this.f81142a = bqgy;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction()) && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) == 12) {
            this.f81142a.mo69138b((Object) null);
        }
    }
}
