package p000;

/* renamed from: bueh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bueh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bueh f153584c;

    /* renamed from: d */
    private static volatile bxxk f153585d;

    /* renamed from: a */
    public int f153586a;

    /* renamed from: b */
    public ByteString f153587b = ByteString.f164797b;

    static {
        bueh bueh = new bueh();
        f153584c = bueh;
        GeneratedMessageLite.m124024a(bueh.class, bueh);
    }

    private bueh() {
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
            return GeneratedMessageLite.m124022a(f153584c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bueh();
        } else {
            if (i2 == 4) {
                return new bxvd(f153584c);
            }
            if (i2 == 5) {
                return f153584c;
            }
            bxxk bxxk = f153585d;
            if (bxxk == null) {
                synchronized (bueh.class) {
                    bxxk = f153585d;
                    if (bxxk == null) {
                        bxxk = new bxve(f153584c);
                        f153585d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
