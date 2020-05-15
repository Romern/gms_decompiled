package com.google.android.gms.ads.internal.clearcut;

/* renamed from: com.google.android.gms.ads.internal.clearcut.h */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0333h extends bxvk implements bxxd {

    /* renamed from: d */
    public static final C0333h f8108d;

    /* renamed from: e */
    private static volatile bxxk f8109e;

    /* renamed from: a */
    public int f8110a;

    /* renamed from: b */
    public boolean f8111b;

    /* renamed from: c */
    public int f8112c;

    static {
        C0333h hVar = new C0333h();
        f8108d = hVar;
        bxvk.m124024a(C0333h.class, hVar);
    }

    private C0333h() {
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
            return bxvk.m124022a(f8108d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new C0333h();
        } else {
            if (i2 == 4) {
                return new bxvd(f8108d);
            }
            if (i2 == 5) {
                return f8108d;
            }
            bxxk bxxk = f8109e;
            if (bxxk == null) {
                synchronized (C0333h.class) {
                    bxxk = f8109e;
                    if (bxxk == null) {
                        bxxk = new bxve(f8108d);
                        f8109e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
