package com.google.android.ads.tasks;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.ads.tasks.u */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0180u {

    /* renamed from: a */
    public final dca f7586a;

    /* renamed from: b */
    public final String f7587b;

    /* renamed from: c */
    public final String f7588c;

    /* renamed from: d */
    public volatile Method f7589d = null;

    /* renamed from: e */
    public final Class[] f7590e;

    /* renamed from: f */
    public final CountDownLatch f7591f = new CountDownLatch(1);

    static {
        C0180u.class.getSimpleName();
    }

    public C0180u(dca dca, String str, String str2, Class... clsArr) {
        this.f7586a = dca;
        this.f7587b = str;
        this.f7588c = str2;
        this.f7590e = clsArr;
        dca.f12766b.submit(new C0179t(this));
    }

    /* renamed from: a */
    public final String mo5039a(byte[] bArr, String str) {
        dbh dbh = this.f7586a.f12768d;
        return new String(dbh.m8118a(bArr, str), "UTF-8");
    }
}
