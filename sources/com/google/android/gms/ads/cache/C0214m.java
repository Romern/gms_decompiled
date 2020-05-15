package com.google.android.gms.ads.cache;

/* renamed from: com.google.android.gms.ads.cache.m */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0214m extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final C0214m f7892d;

    /* renamed from: e */
    private static volatile bxxk f7893e;

    /* renamed from: a */
    public int f7894a;

    /* renamed from: b */
    public String f7895b = "";

    /* renamed from: c */
    public String f7896c = "";

    static {
        C0214m mVar = new C0214m();
        f7892d = mVar;
        GeneratedMessageLite.m124024a(C0214m.class, mVar);
    }

    private C0214m() {
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
            return GeneratedMessageLite.m124022a(f7892d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new C0214m();
        } else {
            if (i2 == 4) {
                return new bxvd(f7892d);
            }
            if (i2 == 5) {
                return f7892d;
            }
            bxxk bxxk = f7893e;
            if (bxxk == null) {
                synchronized (C0214m.class) {
                    bxxk = f7893e;
                    if (bxxk == null) {
                        bxxk = new bxve(f7892d);
                        f7893e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
