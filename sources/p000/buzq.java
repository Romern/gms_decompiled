package p000;

/* renamed from: buzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buzq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final buzq f155418c;

    /* renamed from: d */
    private static volatile bxxk f155419d;

    /* renamed from: a */
    public int f155420a;

    /* renamed from: b */
    public ByteString f155421b = ByteString.f164797b;

    static {
        buzq buzq = new buzq();
        f155418c = buzq;
        GeneratedMessageLite.m124024a(buzq.class, buzq);
    }

    private buzq() {
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
            return GeneratedMessageLite.m124022a(f155418c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new buzq();
        } else {
            if (i2 == 4) {
                return new bxvd(f155418c);
            }
            if (i2 == 5) {
                return f155418c;
            }
            bxxk bxxk = f155419d;
            if (bxxk == null) {
                synchronized (buzq.class) {
                    bxxk = f155419d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155418c);
                        f155419d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
