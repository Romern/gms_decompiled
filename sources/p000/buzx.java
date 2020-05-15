package p000;

/* renamed from: buzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buzx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final buzx f155443c;

    /* renamed from: d */
    private static volatile bxxk f155444d;

    /* renamed from: a */
    public int f155445a;

    /* renamed from: b */
    public String f155446b = "";

    static {
        buzx buzx = new buzx();
        f155443c = buzx;
        GeneratedMessageLite.m124024a(buzx.class, buzx);
    }

    private buzx() {
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
            return GeneratedMessageLite.m124022a(f155443c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new buzx();
        } else {
            if (i2 == 4) {
                return new bxvd(f155443c);
            }
            if (i2 == 5) {
                return f155443c;
            }
            bxxk bxxk = f155444d;
            if (bxxk == null) {
                synchronized (buzx.class) {
                    bxxk = f155444d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155443c);
                        f155444d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
