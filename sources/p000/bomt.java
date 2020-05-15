package p000;

/* renamed from: bomt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomt extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bomt f133714c;

    /* renamed from: d */
    private static volatile bxxk f133715d;

    /* renamed from: a */
    public int f133716a;

    /* renamed from: b */
    public boolean f133717b;

    static {
        bomt bomt = new bomt();
        f133714c = bomt;
        bxvk.m124024a(bomt.class, bomt);
    }

    private bomt() {
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
            return bxvk.m124022a(f133714c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bomt();
        } else {
            if (i2 == 4) {
                return new bxvd(f133714c);
            }
            if (i2 == 5) {
                return f133714c;
            }
            bxxk bxxk = f133715d;
            if (bxxk == null) {
                synchronized (bomt.class) {
                    bxxk = f133715d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133714c);
                        f133715d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
