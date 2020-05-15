package com.google.ads.afma.proto2api;

/* renamed from: com.google.ads.afma.proto2api.i */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0158i extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final C0158i f7564e;

    /* renamed from: f */
    private static volatile bxxk f7565f;

    /* renamed from: a */
    public int f7566a;

    /* renamed from: b */
    public bxwc f7567b = bxxn.f165040b;

    /* renamed from: c */
    public bxtx f7568c = bxtx.f164797b;

    /* renamed from: d */
    public int f7569d = 1;

    static {
        C0158i iVar = new C0158i();
        f7564e = iVar;
        GeneratedMessageLite.m124024a(C0158i.class, iVar);
    }

    private C0158i() {
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
            return GeneratedMessageLite.m124022a(f7564e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0004ဌ\u0002", new Object[]{"a", "b", "c", "d", C0155f.f7556a});
        } else if (i2 == 3) {
            return new C0158i();
        } else {
            if (i2 == 4) {
                return new bxvd(f7564e);
            }
            if (i2 == 5) {
                return f7564e;
            }
            bxxk bxxk = f7565f;
            if (bxxk == null) {
                synchronized (C0158i.class) {
                    bxxk = f7565f;
                    if (bxxk == null) {
                        bxxk = new bxve(f7564e);
                        f7565f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
