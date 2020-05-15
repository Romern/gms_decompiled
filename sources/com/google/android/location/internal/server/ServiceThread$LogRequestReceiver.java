package com.google.android.location.internal.server;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ServiceThread$LogRequestReceiver extends aacn {

    /* renamed from: a */
    public final bfon f150815a;

    /* renamed from: b */
    public final /* synthetic */ bgdo f150816b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceThread$LogRequestReceiver(bgdo bgdo, bfon bfon) {
        super("location");
        this.f150816b = bgdo;
        this.f150815a = bfon;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        new soc(1, 10).execute(new bgdm(this, context, intent));
    }
}
