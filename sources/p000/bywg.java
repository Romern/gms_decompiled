package p000;

/* renamed from: bywg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bywg f168570c;

    /* renamed from: d */
    private static volatile bxxk f168571d;

    /* renamed from: a */
    public int f168572a;

    /* renamed from: b */
    public bywz f168573b;

    static {
        bywg bywg = new bywg();
        f168570c = bywg;
        bxvk.m124024a(bywg.class, bywg);
    }

    private bywg() {
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
            return bxvk.m124022a(f168570c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bywg();
        } else {
            if (i2 == 4) {
                return new bxvd(f168570c);
            }
            if (i2 == 5) {
                return f168570c;
            }
            bxxk bxxk = f168571d;
            if (bxxk == null) {
                synchronized (bywg.class) {
                    bxxk = f168571d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168570c);
                        f168571d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
