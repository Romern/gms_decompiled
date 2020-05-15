package com.google.android.location.quake;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PowerStateListener$PowerBroadcastReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ bgpt f150843a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PowerStateListener$PowerBroadcastReceiver(bgpt bgpt) {
        super("location");
        this.f150843a = bgpt;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int i = bgpt.f117243c;
        intent.getAction();
        this.f150843a.f117474g.mo63137a();
    }
}
