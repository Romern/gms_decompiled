package com.google.android.gms.cast.analytics;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CastAnalytics$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ phy f29867a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CastAnalytics$1(phy phy, String str) {
        super(str);
        this.f29867a = phy;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            this.f29867a.mo23107a(context.getApplicationContext());
        }
    }
}
