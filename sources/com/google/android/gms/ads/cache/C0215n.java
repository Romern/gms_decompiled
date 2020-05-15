package com.google.android.gms.ads.cache;

/* renamed from: com.google.android.gms.ads.cache.n */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0215n extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final C0215n f7897h;

    /* renamed from: i */
    private static volatile bxxk f7898i;

    /* renamed from: a */
    public int f7899a;

    /* renamed from: b */
    public bxwc f7900b = bxxn.f165040b;

    /* renamed from: c */
    public long f7901c;

    /* renamed from: d */
    public long f7902d;

    /* renamed from: e */
    public long f7903e;

    /* renamed from: f */
    public boolean f7904f;

    /* renamed from: g */
    public int f7905g;

    static {
        C0215n nVar = new C0215n();
        f7897h = nVar;
        GeneratedMessageLite.m124024a(C0215n.class, nVar);
    }

    private C0215n() {
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
            return GeneratedMessageLite.m124022a(f7897h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဇ\u0003\u0006င\u0004", new Object[]{"a", "b", C0214m.class, "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new C0215n();
        } else {
            if (i2 == 4) {
                return new bxvd(f7897h);
            }
            if (i2 == 5) {
                return f7897h;
            }
            bxxk bxxk = f7898i;
            if (bxxk == null) {
                synchronized (C0215n.class) {
                    bxxk = f7898i;
                    if (bxxk == null) {
                        bxxk = new bxve(f7897h);
                        f7898i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
