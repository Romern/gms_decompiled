package p000;

/* renamed from: bvfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvfl f155881c;

    /* renamed from: d */
    private static volatile bxxk f155882d;

    /* renamed from: a */
    public int f155883a;

    /* renamed from: b */
    public bvfe f155884b;

    static {
        bvfl bvfl = new bvfl();
        f155881c = bvfl;
        GeneratedMessageLite.m124024a(bvfl.class, bvfl);
    }

    private bvfl() {
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
            return GeneratedMessageLite.m124022a(f155881c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvfl();
        } else {
            if (i2 == 4) {
                return new bxvd(f155881c);
            }
            if (i2 == 5) {
                return f155881c;
            }
            bxxk bxxk = f155882d;
            if (bxxk == null) {
                synchronized (bvfl.class) {
                    bxxk = f155882d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155881c);
                        f155882d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
