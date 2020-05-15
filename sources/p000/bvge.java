package p000;

/* renamed from: bvge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvge extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvge f155990c;

    /* renamed from: d */
    private static volatile bxxk f155991d;

    /* renamed from: a */
    public int f155992a;

    /* renamed from: b */
    public ByteString f155993b = ByteString.f164797b;

    static {
        bvge bvge = new bvge();
        f155990c = bvge;
        GeneratedMessageLite.m124024a(bvge.class, bvge);
    }

    private bvge() {
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
            return GeneratedMessageLite.m124022a(f155990c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvge();
        } else {
            if (i2 == 4) {
                return new bxvd(f155990c);
            }
            if (i2 == 5) {
                return f155990c;
            }
            bxxk bxxk = f155991d;
            if (bxxk == null) {
                synchronized (bvge.class) {
                    bxxk = f155991d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155990c);
                        f155991d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
