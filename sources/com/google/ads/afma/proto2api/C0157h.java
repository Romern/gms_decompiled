package com.google.ads.afma.proto2api;

/* renamed from: com.google.ads.afma.proto2api.h */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0157h extends bxvk implements bxxd {

    /* renamed from: e */
    public static final C0157h f7558e;

    /* renamed from: f */
    private static volatile bxxk f7559f;

    /* renamed from: a */
    public int f7560a;

    /* renamed from: b */
    public long f7561b;

    /* renamed from: c */
    public String f7562c = "";

    /* renamed from: d */
    public bxtx f7563d = bxtx.f164797b;

    static {
        C0157h hVar = new C0157h();
        f7558e = hVar;
        bxvk.m124024a(C0157h.class, hVar);
    }

    private C0157h() {
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
            return bxvk.m124022a(f7558e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new C0157h();
        } else {
            if (i2 == 4) {
                return new bxvd(f7558e);
            }
            if (i2 == 5) {
                return f7558e;
            }
            bxxk bxxk = f7559f;
            if (bxxk == null) {
                synchronized (C0157h.class) {
                    bxxk = f7559f;
                    if (bxxk == null) {
                        bxxk = new bxve(f7558e);
                        f7559f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
