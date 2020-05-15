package p000;

/* renamed from: cbmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmr extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbmr f177669c;

    /* renamed from: d */
    private static volatile bxxk f177670d;

    /* renamed from: a */
    public String f177671a = "";

    /* renamed from: b */
    public ByteString f177672b = ByteString.f164797b;

    static {
        cbmr cbmr = new cbmr();
        f177669c = cbmr;
        GeneratedMessageLite.m124024a(cbmr.class, cbmr);
    }

    private cbmr() {
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
            return GeneratedMessageLite.m124022a(f177669c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbmr();
        } else {
            if (i2 == 4) {
                return new bxvd(f177669c);
            }
            if (i2 == 5) {
                return f177669c;
            }
            bxxk bxxk = f177670d;
            if (bxxk == null) {
                synchronized (cbmr.class) {
                    bxxk = f177670d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177669c);
                        f177670d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
