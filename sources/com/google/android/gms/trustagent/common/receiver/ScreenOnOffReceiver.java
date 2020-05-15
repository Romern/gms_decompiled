package com.google.android.gms.trustagent.common.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ScreenOnOffReceiver extends aacn {

    /* renamed from: a */
    private static final aunx f109150a = new aunx("TrustAgent", "ScreenOnOffReceiver");

    /* renamed from: b */
    private final Context f109151b;

    /* renamed from: c */
    private final auny f109152c;

    public ScreenOnOffReceiver(Context context, auny auny) {
        super("trustagent");
        this.f109151b = context;
        this.f109152c = auny;
    }

    /* renamed from: a */
    public final void mo59552a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.f109151b.registerReceiver(this, intentFilter);
    }

    /* renamed from: b */
    public final void mo59553b() {
        this.f109151b.unregisterReceiver(this);
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        f109150a.mo50711a("Received intent: %s.", intent);
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f109152c.mo50641b();
        } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            this.f109152c.mo50643c();
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f109152c.mo50642bO();
        }
    }
}
