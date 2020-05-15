package com.google.android.gms.ads.cache;

/* renamed from: com.google.android.gms.ads.cache.l */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0213l extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final C0213l f7887d;

    /* renamed from: e */
    private static volatile bxxk f7888e;

    /* renamed from: a */
    public int f7889a;

    /* renamed from: b */
    public String f7890b = "";

    /* renamed from: c */
    public String f7891c = "";

    static {
        C0213l lVar = new C0213l();
        f7887d = lVar;
        GeneratedMessageLite.m124024a(C0213l.class, lVar);
    }

    private C0213l() {
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
            return GeneratedMessageLite.m124022a(f7887d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new C0213l();
        } else {
            if (i2 == 4) {
                return new bxvd(f7887d);
            }
            if (i2 == 5) {
                return f7887d;
            }
            bxxk bxxk = f7888e;
            if (bxxk == null) {
                synchronized (C0213l.class) {
                    bxxk = f7888e;
                    if (bxxk == null) {
                        bxxk = new bxve(f7887d);
                        f7888e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
