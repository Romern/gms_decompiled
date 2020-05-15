package com.google.android.gms.ads.cache;

/* renamed from: com.google.android.gms.ads.cache.o */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0216o extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final C0216o f7906d;

    /* renamed from: e */
    private static volatile bxxk f7907e;

    /* renamed from: a */
    public int f7908a;

    /* renamed from: b */
    public String f7909b = "";

    /* renamed from: c */
    public long f7910c;

    static {
        C0216o oVar = new C0216o();
        f7906d = oVar;
        GeneratedMessageLite.m124024a(C0216o.class, oVar);
    }

    private C0216o() {
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
            return GeneratedMessageLite.m124022a(f7906d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new C0216o();
        } else {
            if (i2 == 4) {
                return new bxvd(f7906d);
            }
            if (i2 == 5) {
                return f7906d;
            }
            bxxk bxxk = f7907e;
            if (bxxk == null) {
                synchronized (C0216o.class) {
                    bxxk = f7907e;
                    if (bxxk == null) {
                        bxxk = new bxve(f7906d);
                        f7907e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
