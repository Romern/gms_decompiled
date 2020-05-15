package p000;

/* renamed from: cblo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cblo f177541c;

    /* renamed from: d */
    private static volatile bxxk f177542d;

    /* renamed from: a */
    public ByteString f177543a = ByteString.f164797b;

    /* renamed from: b */
    public cblx f177544b;

    static {
        cblo cblo = new cblo();
        f177541c = cblo;
        GeneratedMessageLite.m124024a(cblo.class, cblo);
    }

    private cblo() {
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
            return GeneratedMessageLite.m124022a(f177541c, "\u0000\u0002\u0000\u0000\u0002\u0004\u0002\u0000\u0000\u0000\u0002\n\u0004\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cblo();
        } else {
            if (i2 == 4) {
                return new bxvd(f177541c);
            }
            if (i2 == 5) {
                return f177541c;
            }
            bxxk bxxk = f177542d;
            if (bxxk == null) {
                synchronized (cblo.class) {
                    bxxk = f177542d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177541c);
                        f177542d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
