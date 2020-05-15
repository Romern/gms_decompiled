package p000;

/* renamed from: amsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amsb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final amsb f75832c;

    /* renamed from: d */
    private static volatile bxxk f75833d;

    /* renamed from: a */
    public int f75834a;

    /* renamed from: b */
    public int f75835b;

    static {
        amsb amsb = new amsb();
        f75832c = amsb;
        GeneratedMessageLite.m124024a(amsb.class, amsb);
    }

    private amsb() {
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
            return GeneratedMessageLite.m124022a(f75832c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", allz.m61246b()});
        } else if (i2 == 3) {
            return new amsb();
        } else {
            if (i2 == 4) {
                return new bxvd(f75832c);
            }
            if (i2 == 5) {
                return f75832c;
            }
            bxxk bxxk = f75833d;
            if (bxxk == null) {
                synchronized (amsb.class) {
                    bxxk = f75833d;
                    if (bxxk == null) {
                        bxxk = new bxve(f75832c);
                        f75833d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
