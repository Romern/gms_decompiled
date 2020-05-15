package p000;

/* renamed from: bysx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bysx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bysx f167627c;

    /* renamed from: e */
    private static volatile bxxk f167628e;

    /* renamed from: a */
    public int f167629a;

    /* renamed from: b */
    public ByteString f167630b = ByteString.f164797b;

    /* renamed from: d */
    private byte f167631d = 2;

    static {
        bysx bysx = new bysx();
        f167627c = bysx;
        GeneratedMessageLite.m124024a(bysx.class, bysx);
    }

    private bysx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f167631d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f167631d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f167627c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔊ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bysx();
        } else {
            if (i2 == 4) {
                return new bxvd(f167627c);
            }
            if (i2 == 5) {
                return f167627c;
            }
            bxxk bxxk = f167628e;
            if (bxxk == null) {
                synchronized (bysx.class) {
                    bxxk = f167628e;
                    if (bxxk == null) {
                        bxxk = new bxve(f167627c);
                        f167628e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
