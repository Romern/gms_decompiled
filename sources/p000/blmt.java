package p000;

/* renamed from: blmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blmt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blmt f126897e;

    /* renamed from: f */
    private static volatile bxxk f126898f;

    /* renamed from: a */
    public int f126899a;

    /* renamed from: b */
    public int f126900b;

    /* renamed from: c */
    public long f126901c;

    /* renamed from: d */
    public int f126902d;

    static {
        blmt blmt = new blmt();
        f126897e = blmt;
        bxvk.m124024a(blmt.class, blmt);
    }

    private blmt() {
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
            return bxvk.m124022a(f126897e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002င\u0001\u0003ဂ\u0002\u0005င\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new blmt();
        } else {
            if (i2 == 4) {
                return new blms();
            }
            if (i2 == 5) {
                return f126897e;
            }
            bxxk bxxk = f126898f;
            if (bxxk == null) {
                synchronized (blmt.class) {
                    bxxk = f126898f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126897e);
                        f126898f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
