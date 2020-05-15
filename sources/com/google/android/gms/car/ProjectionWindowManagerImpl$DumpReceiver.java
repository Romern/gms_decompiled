package com.google.android.gms.car;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ProjectionWindowManagerImpl$DumpReceiver extends TracingBroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ nvk f29413a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProjectionWindowManagerImpl$DumpReceiver(nvk nvk) {
        super("car");
        this.f29413a = nvk;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        nvk nvk = this.f29413a;
        bnsn bnsn = nvk.f36599a;
        nvk.mo21667a(true);
    }
}
