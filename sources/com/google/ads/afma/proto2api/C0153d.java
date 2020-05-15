package com.google.ads.afma.proto2api;

/* renamed from: com.google.ads.afma.proto2api.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0153d extends bxvk implements bxxd {

    /* renamed from: d */
    public static final C0153d f7544d;

    /* renamed from: e */
    private static volatile bxxk f7545e;

    /* renamed from: a */
    public int f7546a;

    /* renamed from: b */
    public bxtx f7547b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f7548c = bxtx.f164797b;

    static {
        C0153d dVar = new C0153d();
        f7544d = dVar;
        bxvk.m124024a(C0153d.class, dVar);
    }

    private C0153d() {
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
            return bxvk.m124022a(f7544d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new C0153d();
        } else {
            if (i2 == 4) {
                return new bxvd(f7544d);
            }
            if (i2 == 5) {
                return f7544d;
            }
            bxxk bxxk = f7545e;
            if (bxxk == null) {
                synchronized (C0153d.class) {
                    bxxk = f7545e;
                    if (bxxk == null) {
                        bxxk = new bxve(f7544d);
                        f7545e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
