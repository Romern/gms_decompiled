package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.C0387d;

/* renamed from: com.google.android.gms.ads.internal.util.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0641f extends adzt {
    public C0641f(Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6820a(Message message) {
        try {
            super.mo6820a(message);
        } catch (Throwable th) {
            C0387d.m5363a().mo6855a(C0387d.m5366d().f8896b, th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            C0387d.m5366d().mo6783a(e, "AdMobHandler.handleMessage");
        }
    }
}
