package com.google.android.gms.fitness.service.base;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BrokerService$PackageDisconnectedReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ zmb f32392a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrokerService$PackageDisconnectedReceiver(zmb zmb) {
        super("fitness");
        this.f32392a = zmb;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.google.android.gms.fitness.app_disconnected".equals(intent.getAction())) {
            this.f32392a.mo31241c(intent.getStringExtra("com.google.android.gms.fitness.disconnected_app"));
            return;
        }
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("Unexpected intent ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
