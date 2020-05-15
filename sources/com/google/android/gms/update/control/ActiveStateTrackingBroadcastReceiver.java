package com.google.android.gms.update.control;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ActiveStateTrackingBroadcastReceiver extends aacn {

    /* renamed from: a */
    public final Object f109489a = new Object();

    /* renamed from: b */
    public boolean f109490b = false;

    public ActiveStateTrackingBroadcastReceiver() {
        super("ota");
    }

    /* renamed from: a */
    public final void mo59673a(Context context) {
        synchronized (this.f109489a) {
            if (this.f109490b) {
                context.unregisterReceiver(this);
                this.f109490b = false;
            }
        }
    }

    /* renamed from: a */
    public abstract void mo59675a(Intent intent);

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        new avmf(this, intent).start();
    }

    /* renamed from: a */
    public final void mo59674a(Context context, IntentFilter intentFilter) {
        synchronized (this.f109489a) {
            if (!this.f109490b) {
                this.f109490b = true;
                context.registerReceiver(this, intentFilter);
            }
        }
    }
}
