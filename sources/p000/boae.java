package p000;

/* renamed from: boae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boae extends bxvk implements bxxd {

    /* renamed from: b */
    public static final boae f132446b;

    /* renamed from: d */
    private static volatile bxxk f132447d;

    /* renamed from: a */
    public String f132448a = "";

    /* renamed from: c */
    private int f132449c;

    static {
        boae boae = new boae();
        f132446b = boae;
        bxvk.m124024a(boae.class, boae);
    }

    private boae() {
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
            return bxvk.m124022a(f132446b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new boae();
        } else {
            if (i2 == 4) {
                return new bxvd(f132446b);
            }
            if (i2 == 5) {
                return f132446b;
            }
            bxxk bxxk = f132447d;
            if (bxxk == null) {
                synchronized (boae.class) {
                    bxxk = f132447d;
                    if (bxxk == null) {
                        bxxk = new bxve(f132446b);
                        f132447d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
