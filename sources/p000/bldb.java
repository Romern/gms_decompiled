package p000;

/* renamed from: bldb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bldb f126036d;

    /* renamed from: e */
    private static volatile bxxk f126037e;

    /* renamed from: a */
    public int f126038a;

    /* renamed from: b */
    public bldc f126039b;

    /* renamed from: c */
    public blcq f126040c;

    static {
        bldb bldb = new bldb();
        f126036d = bldb;
        bxvk.m124024a(bldb.class, bldb);
    }

    private bldb() {
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
            return bxvk.m124022a(f126036d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bldb();
        } else {
            if (i2 == 4) {
                return new bxvd(f126036d);
            }
            if (i2 == 5) {
                return f126036d;
            }
            bxxk bxxk = f126037e;
            if (bxxk == null) {
                synchronized (bldb.class) {
                    bxxk = f126037e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126036d);
                        f126037e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
