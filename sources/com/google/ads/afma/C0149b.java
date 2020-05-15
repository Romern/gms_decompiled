package com.google.ads.afma;

/* renamed from: com.google.ads.afma.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0149b extends bxvk implements bxxd {

    /* renamed from: i */
    public static final C0149b f7489i;

    /* renamed from: j */
    private static volatile bxxk f7490j;

    /* renamed from: a */
    public int f7491a;

    /* renamed from: b */
    public String f7492b = "";

    /* renamed from: c */
    public long f7493c;

    /* renamed from: d */
    public String f7494d = "";

    /* renamed from: e */
    public String f7495e = "";

    /* renamed from: f */
    public String f7496f = "";

    /* renamed from: g */
    public String f7497g = "";

    /* renamed from: h */
    public int f7498h;

    static {
        C0149b bVar = new C0149b();
        f7489i = bVar;
        bxvk.m124024a(C0149b.class, bVar);
    }

    private C0149b() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f7489i, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u000bဈ\n\rဌ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", C0148a.f7488a});
        } else if (i2 == 3) {
            return new C0149b();
        } else {
            if (i2 == 4) {
                return new bxvd(f7489i);
            }
            if (i2 == 5) {
                return f7489i;
            }
            bxxk bxxk = f7490j;
            if (bxxk == null) {
                synchronized (C0149b.class) {
                    bxxk = f7490j;
                    if (bxxk == null) {
                        bxxk = new bxve(f7489i);
                        f7490j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
