package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckinReceiver extends aacn {

    /* renamed from: a */
    public jvn f11361a;

    /* renamed from: b */
    public final Context f11362b;

    /* renamed from: c */
    public final Object f11363c = new Object();

    /* renamed from: d */
    public boolean f11364d;

    public CheckinReceiver(Context context) {
        super("auth_account");
        this.f11362b = context;
    }

    /* renamed from: a */
    public final void mo7868a() {
        synchronized (this.f11363c) {
            if (this.f11364d) {
                this.f11362b.unregisterReceiver(this);
                this.f11361a = null;
                this.f11364d = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (!"com.google.android.checkin.CHECKIN_COMPLETE".equals(intent.getAction())) {
            return;
        }
        if (spn.m35843a(context) != 0) {
            ((jvm) this.f11361a).mo14152a(true);
        } else {
            ((jvm) this.f11361a).mo14152a(false);
        }
    }
}
