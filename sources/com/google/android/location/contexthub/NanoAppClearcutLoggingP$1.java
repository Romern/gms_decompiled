package com.google.android.location.contexthub;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NanoAppClearcutLoggingP$1 extends aacn {

    /* renamed from: a */
    public final /* synthetic */ bflg f150712a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NanoAppClearcutLoggingP$1(bflg bflg, String str) {
        super(str);
        this.f150712a = bflg;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (ceyy.m138450c() && "com.google.android.location".equals(stringExtra)) {
            bflg bflg = this.f150712a;
            int i = bflg.f114332h;
            bflg.f114335b.post(new bfle(this));
        } else if (!ceyy.m138450c()) {
            bflg bflg2 = this.f150712a;
            int i2 = bflg.f114332h;
            bflg2.f114335b.post(new bflf(this));
        }
    }
}
