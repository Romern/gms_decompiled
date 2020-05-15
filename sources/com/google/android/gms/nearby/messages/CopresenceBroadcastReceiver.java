package com.google.android.gms.nearby.messages;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CopresenceBroadcastReceiver extends aacn {

    /* renamed from: a */
    public final ajat f80671a;

    /* renamed from: b */
    private final buqh f80672b;

    public CopresenceBroadcastReceiver(ajat ajat, buqh buqh) {
        super("nearby");
        this.f80671a = ajat;
        this.f80672b = buqh;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        this.f80672b.mo72987c(new aiwl(this, "CopresenceBroadcast", intent.getAction()));
    }
}
