package p000;

/* renamed from: boub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boub extends bxvk implements bxxd {

    /* renamed from: d */
    public static final boub f134908d;

    /* renamed from: e */
    private static volatile bxxk f134909e;

    /* renamed from: a */
    public int f134910a;

    /* renamed from: b */
    public int f134911b;

    /* renamed from: c */
    public int f134912c;

    static {
        boub boub = new boub();
        f134908d = boub;
        bxvk.m124024a(boub.class, boub);
    }

    private boub() {
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
            return bxvk.m124022a(f134908d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", boua.f134907a, "c"});
        } else if (i2 == 3) {
            return new boub();
        } else {
            if (i2 == 4) {
                return new bxvd(f134908d);
            }
            if (i2 == 5) {
                return f134908d;
            }
            bxxk bxxk = f134909e;
            if (bxxk == null) {
                synchronized (boub.class) {
                    bxxk = f134909e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134908d);
                        f134909e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
