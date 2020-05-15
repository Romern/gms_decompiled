package com.google.android.gms.ads.internal.clearcut;

/* renamed from: com.google.android.gms.ads.internal.clearcut.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0332g extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final C0332g f8102e;

    /* renamed from: f */
    private static volatile bxxk f8103f;

    /* renamed from: a */
    public int f8104a;

    /* renamed from: b */
    public String f8105b = "";

    /* renamed from: c */
    public bxvw f8106c = bxwq.f165002b;

    /* renamed from: d */
    public C0333h f8107d;

    static {
        C0332g gVar = new C0332g();
        f8102e = gVar;
        GeneratedMessageLite.m124024a(C0332g.class, gVar);
    }

    private C0332g() {
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
            return GeneratedMessageLite.m124022a(f8102e, "\u0001\u0003\u0000\u0001\n\u0014\u0003\u0000\u0001\u0000\nဈ\u0001\u000e\u0015\u0014ဉ\n", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new C0332g();
        } else {
            if (i2 == 4) {
                return new bxvd(f8102e);
            }
            if (i2 == 5) {
                return f8102e;
            }
            bxxk bxxk = f8103f;
            if (bxxk == null) {
                synchronized (C0332g.class) {
                    bxxk = f8103f;
                    if (bxxk == null) {
                        bxxk = new bxve(f8102e);
                        f8103f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
