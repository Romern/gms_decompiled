package p000;

/* renamed from: bqrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqrb f141415c;

    /* renamed from: d */
    private static volatile bxxk f141416d;

    /* renamed from: a */
    public bqrc f141417a;

    /* renamed from: b */
    public int f141418b;

    static {
        bqrb bqrb = new bqrb();
        f141415c = bqrb;
        GeneratedMessageLite.m124024a(bqrb.class, bqrb);
    }

    private bqrb() {
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
            return GeneratedMessageLite.m124022a(f141415c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqrb();
        } else {
            if (i2 == 4) {
                return new bxvd(f141415c);
            }
            if (i2 == 5) {
                return f141415c;
            }
            bxxk bxxk = f141416d;
            if (bxxk == null) {
                synchronized (bqrb.class) {
                    bxxk = f141416d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141415c);
                        f141416d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
