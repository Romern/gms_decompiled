package p000;

/* renamed from: bvfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvfc f155841c;

    /* renamed from: d */
    private static volatile bxxk f155842d;

    /* renamed from: a */
    public int f155843a;

    /* renamed from: b */
    public long f155844b;

    static {
        bvfc bvfc = new bvfc();
        f155841c = bvfc;
        GeneratedMessageLite.m124024a(bvfc.class, bvfc);
    }

    private bvfc() {
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
            return GeneratedMessageLite.m124022a(f155841c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvfc();
        } else {
            if (i2 == 4) {
                return new bxvd(f155841c);
            }
            if (i2 == 5) {
                return f155841c;
            }
            bxxk bxxk = f155842d;
            if (bxxk == null) {
                synchronized (bvfc.class) {
                    bxxk = f155842d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155841c);
                        f155842d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
