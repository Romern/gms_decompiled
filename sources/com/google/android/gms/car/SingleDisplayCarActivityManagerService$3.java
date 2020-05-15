package com.google.android.gms.car;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SingleDisplayCarActivityManagerService$3 extends TracingBroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ nwe f29453a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleDisplayCarActivityManagerService$3(nwe nwe, String str) {
        super(str);
        this.f29453a = nwe;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("package:com.google.android.projection.gearhead".equals(intent.getDataString())) {
            Intent intent2 = new Intent();
            nwe nwe = this.f29453a;
            int i = nwe.f36732u;
            intent2.setComponent(nwe.f36779d);
            intent2.addCategory("android.intent.category.HOME");
            this.f29453a.mo20816a(intent2);
            context.unregisterReceiver(this);
        }
    }
}
