package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class A2AEncryption$PairingReceiver extends aacn {

    /* renamed from: a */
    public Boolean f110969a;

    /* renamed from: b */
    private final String f110970b;

    /* renamed from: c */
    private final Semaphore f110971c;

    public A2AEncryption$PairingReceiver(Semaphore semaphore, String str) {
        super("wearable");
        this.f110971c = semaphore;
        this.f110970b = str;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (this.f110969a == null && this.f110970b.equals(intent.getStringExtra("code"))) {
            this.f110969a = Boolean.valueOf("com.google.android.clockwork.A2AAccept".equals(intent.getAction()));
            this.f110971c.release();
        }
    }
}
