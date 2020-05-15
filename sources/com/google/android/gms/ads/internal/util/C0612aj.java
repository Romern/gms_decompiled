package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: com.google.android.gms.ads.internal.util.aj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0612aj {

    /* renamed from: a */
    public Handler f8923a = null;

    /* renamed from: b */
    private HandlerThread f8924b = null;

    /* renamed from: c */
    private int f8925c = 0;

    /* renamed from: d */
    private final Object f8926d = new Object();

    /* renamed from: a */
    public final Looper mo6792a() {
        Looper looper;
        synchronized (this.f8926d) {
            if (this.f8925c != 0) {
                sdo.m34966a(this.f8924b, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f8924b == null) {
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f8924b = handlerThread;
                handlerThread.start();
                this.f8923a = new adzt(this.f8924b.getLooper());
            } else {
                this.f8926d.notifyAll();
            }
            this.f8925c++;
            looper = this.f8924b.getLooper();
        }
        return looper;
    }
}
