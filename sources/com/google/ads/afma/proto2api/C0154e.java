package com.google.ads.afma.proto2api;

/* renamed from: com.google.ads.afma.proto2api.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0154e extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final C0154e f7549f;

    /* renamed from: g */
    private static volatile bxxk f7550g;

    /* renamed from: a */
    public int f7551a;

    /* renamed from: b */
    public bxtx f7552b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f7553c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f7554d = bxtx.f164797b;

    /* renamed from: e */
    public bxtx f7555e = bxtx.f164797b;

    static {
        C0154e eVar = new C0154e();
        f7549f = eVar;
        GeneratedMessageLite.m124024a(C0154e.class, eVar);
    }

    private C0154e() {
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
            return GeneratedMessageLite.m124022a(f7549f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new C0154e();
        } else {
            if (i2 == 4) {
                return new bxvd(f7549f);
            }
            if (i2 == 5) {
                return f7549f;
            }
            bxxk bxxk = f7550g;
            if (bxxk == null) {
                synchronized (C0154e.class) {
                    bxxk = f7550g;
                    if (bxxk == null) {
                        bxxk = new bxve(f7549f);
                        f7550g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
