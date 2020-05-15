package p000;

import java.util.Map;

/* renamed from: agig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agig implements Runnable {

    /* renamed from: a */
    private final agif f65578a;

    /* renamed from: b */
    private final int f65579b;

    /* renamed from: c */
    private final Throwable f65580c;

    /* renamed from: d */
    private final byte[] f65581d;

    /* renamed from: e */
    private final String f65582e;

    /* renamed from: f */
    private final Map f65583f;

    public agig(String str, agif agif, int i, Throwable th, byte[] bArr, Map map) {
        sdo.m34959a(agif);
        this.f65578a = agif;
        this.f65579b = i;
        this.f65580c = th;
        this.f65581d = bArr;
        this.f65582e = str;
        this.f65583f = map;
    }

    public final void run() {
        this.f65578a.mo35445a(this.f65582e, this.f65579b, this.f65580c, this.f65581d, this.f65583f);
    }
}
