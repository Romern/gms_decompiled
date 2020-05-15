package com.google.android.gms.auth.proximity;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleBackgroundAdvertiser$WakeUpBroadcastReceiver extends aacn {

    /* renamed from: a */
    public final /* synthetic */ jiu f11093a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BleBackgroundAdvertiser$WakeUpBroadcastReceiver(jiu jiu) {
        super("auth_proximity");
        this.f11093a = jiu;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        asfb asfb = new asfb(context, 1, "BleBackgroundAdvertiser");
        asfb.mo49111a(jiu.f22569b);
        this.f11093a.mo13769a();
        this.f11093a.mo13770a(new jit(this, asfb));
    }
}
