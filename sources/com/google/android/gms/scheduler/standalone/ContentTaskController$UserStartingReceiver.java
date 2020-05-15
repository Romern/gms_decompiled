package com.google.android.gms.scheduler.standalone;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContentTaskController$UserStartingReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ apkr f107342a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentTaskController$UserStartingReceiver(apkr apkr) {
        super("scheduler");
        this.f107342a = apkr;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        this.f107342a.mo47373a(aajg.m21340b(intent.getIntExtra("android.intent.extra.user_handle", -1)));
    }
}
