package p000;

/* renamed from: buoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buoo extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final buoo f154559e;

    /* renamed from: f */
    private static volatile bxxk f154560f;

    /* renamed from: a */
    public long f154561a;

    /* renamed from: b */
    public ByteString f154562b = ByteString.f164797b;

    /* renamed from: c */
    public buow f154563c;

    /* renamed from: d */
    public int f154564d;

    static {
        buoo buoo = new buoo();
        f154559e = buoo;
        GeneratedMessageLite.m124024a(buoo.class, buoo);
    }

    private buoo() {
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
            return GeneratedMessageLite.m124022a(f154559e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\n\u0003\t\u0004\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new buoo();
        } else {
            if (i2 == 4) {
                return new bxvd(f154559e);
            }
            if (i2 == 5) {
                return f154559e;
            }
            bxxk bxxk = f154560f;
            if (bxxk == null) {
                synchronized (buoo.class) {
                    bxxk = f154560f;
                    if (bxxk == null) {
                        bxxk = new bxve(f154559e);
                        f154560f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
