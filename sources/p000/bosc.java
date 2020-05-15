package p000;

/* renamed from: bosc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bosc f134554e;

    /* renamed from: f */
    private static volatile bxxk f134555f;

    /* renamed from: a */
    public int f134556a;

    /* renamed from: b */
    public int f134557b;

    /* renamed from: c */
    public int f134558c;

    /* renamed from: d */
    public long f134559d;

    static {
        bosc bosc = new bosc();
        f134554e = bosc;
        bxvk.m124024a(bosc.class, bosc);
    }

    private bosc() {
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
            return bxvk.m124022a(f134554e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bosc();
        } else {
            if (i2 == 4) {
                return new bxvd(f134554e);
            }
            if (i2 == 5) {
                return f134554e;
            }
            bxxk bxxk = f134555f;
            if (bxxk == null) {
                synchronized (bosc.class) {
                    bxxk = f134555f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134554e);
                        f134555f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
