package p000;

/* renamed from: bvyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvyb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvyb f158129d;

    /* renamed from: e */
    private static volatile bxxk f158130e;

    /* renamed from: a */
    public int f158131a;

    /* renamed from: b */
    public int f158132b;

    /* renamed from: c */
    public bvwb f158133c;

    static {
        bvyb bvyb = new bvyb();
        f158129d = bvyb;
        GeneratedMessageLite.m124024a(bvyb.class, bvyb);
    }

    private bvyb() {
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
            return GeneratedMessageLite.m124022a(f158129d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvyb();
        } else {
            if (i2 == 4) {
                return new bxvd(f158129d);
            }
            if (i2 == 5) {
                return f158129d;
            }
            bxxk bxxk = f158130e;
            if (bxxk == null) {
                synchronized (bvyb.class) {
                    bxxk = f158130e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158129d);
                        f158130e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
