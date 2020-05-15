package p000;

/* renamed from: bogt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bogt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bogt f133026e;

    /* renamed from: f */
    private static volatile bxxk f133027f;

    /* renamed from: a */
    public int f133028a;

    /* renamed from: b */
    public long f133029b;

    /* renamed from: c */
    public int f133030c;

    /* renamed from: d */
    public int f133031d;

    static {
        bogt bogt = new bogt();
        f133026e = bogt;
        bxvk.m124024a(bogt.class, bogt);
    }

    private bogt() {
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
            return bxvk.m124022a(f133026e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", bogs.f133025a, "d"});
        } else if (i2 == 3) {
            return new bogt();
        } else {
            if (i2 == 4) {
                return new bxvd(f133026e);
            }
            if (i2 == 5) {
                return f133026e;
            }
            bxxk bxxk = f133027f;
            if (bxxk == null) {
                synchronized (bogt.class) {
                    bxxk = f133027f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133026e);
                        f133027f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
