package p000;

/* renamed from: blmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blmw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blmw f126907e;

    /* renamed from: f */
    private static volatile bxxk f126908f;

    /* renamed from: a */
    public int f126909a;

    /* renamed from: b */
    public int f126910b;

    /* renamed from: c */
    public long f126911c;

    /* renamed from: d */
    public int f126912d;

    static {
        blmw blmw = new blmw();
        f126907e = blmw;
        bxvk.m124024a(blmw.class, blmw);
    }

    private blmw() {
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
            return bxvk.m124022a(f126907e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002င\u0001\u0003ဂ\u0002\u0005င\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new blmw();
        } else {
            if (i2 == 4) {
                return new blmv();
            }
            if (i2 == 5) {
                return f126907e;
            }
            bxxk bxxk = f126908f;
            if (bxxk == null) {
                synchronized (blmw.class) {
                    bxxk = f126908f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126907e);
                        f126908f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
