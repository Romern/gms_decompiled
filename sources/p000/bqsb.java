package p000;

/* renamed from: bqsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqsb f141505c;

    /* renamed from: d */
    private static volatile bxxk f141506d;

    /* renamed from: a */
    public int f141507a;

    /* renamed from: b */
    public int f141508b;

    static {
        bqsb bqsb = new bqsb();
        f141505c = bqsb;
        GeneratedMessageLite.m124024a(bqsb.class, bqsb);
    }

    private bqsb() {
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
            return GeneratedMessageLite.m124022a(f141505c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqsb();
        } else {
            if (i2 == 4) {
                return new bxvd(f141505c);
            }
            if (i2 == 5) {
                return f141505c;
            }
            bxxk bxxk = f141506d;
            if (bxxk == null) {
                synchronized (bqsb.class) {
                    bxxk = f141506d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141505c);
                        f141506d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
