package p000;

/* renamed from: buuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buuk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final buuk f154951c;

    /* renamed from: d */
    private static volatile bxxk f154952d;

    /* renamed from: a */
    public int f154953a;

    /* renamed from: b */
    public ByteString f154954b = ByteString.f164797b;

    static {
        buuk buuk = new buuk();
        f154951c = buuk;
        GeneratedMessageLite.m124024a(buuk.class, buuk);
    }

    private buuk() {
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
            return GeneratedMessageLite.m124022a(f154951c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new buuk();
        } else {
            if (i2 == 4) {
                return new bxvd(f154951c);
            }
            if (i2 == 5) {
                return f154951c;
            }
            bxxk bxxk = f154952d;
            if (bxxk == null) {
                synchronized (buuk.class) {
                    bxxk = f154952d;
                    if (bxxk == null) {
                        bxxk = new bxve(f154951c);
                        f154952d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
