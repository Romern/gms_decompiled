package com.google.android.gms.ads.cache;

/* renamed from: com.google.android.gms.ads.cache.p */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0217p extends bxvk implements bxxd {

    /* renamed from: g */
    public static final C0217p f7911g;

    /* renamed from: h */
    private static volatile bxxk f7912h;

    /* renamed from: a */
    public int f7913a;

    /* renamed from: b */
    public String f7914b = "";

    /* renamed from: c */
    public C0213l f7915c;

    /* renamed from: d */
    public C0216o f7916d;

    /* renamed from: e */
    public C0215n f7917e;

    /* renamed from: f */
    public String f7918f = "";

    static {
        C0217p pVar = new C0217p();
        f7911g = pVar;
        bxvk.m124024a(C0217p.class, pVar);
    }

    private C0217p() {
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
            return bxvk.m124022a(f7911g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new C0217p();
        } else {
            if (i2 == 4) {
                return new bxvd(f7911g);
            }
            if (i2 == 5) {
                return f7911g;
            }
            bxxk bxxk = f7912h;
            if (bxxk == null) {
                synchronized (C0217p.class) {
                    bxxk = f7912h;
                    if (bxxk == null) {
                        bxxk = new bxve(f7911g);
                        f7912h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
