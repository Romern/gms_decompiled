package p000;

/* renamed from: boqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final boqb f134228d;

    /* renamed from: e */
    private static volatile bxxk f134229e;

    /* renamed from: a */
    public int f134230a;

    /* renamed from: b */
    public bzrn f134231b;

    /* renamed from: c */
    public bopz f134232c;

    static {
        boqb boqb = new boqb();
        f134228d = boqb;
        bxvk.m124024a(boqb.class, boqb);
    }

    private boqb() {
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
            return bxvk.m124022a(f134228d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new boqb();
        } else {
            if (i2 == 4) {
                return new bxvd(f134228d);
            }
            if (i2 == 5) {
                return f134228d;
            }
            bxxk bxxk = f134229e;
            if (bxxk == null) {
                synchronized (boqb.class) {
                    bxxk = f134229e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134228d);
                        f134229e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
