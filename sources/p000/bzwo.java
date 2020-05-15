package p000;

/* renamed from: bzwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzwo f171658c;

    /* renamed from: d */
    private static volatile bxxk f171659d;

    /* renamed from: a */
    public int f171660a;

    /* renamed from: b */
    public ByteString f171661b = ByteString.f164797b;

    static {
        bzwo bzwo = new bzwo();
        f171658c = bzwo;
        GeneratedMessageLite.m124024a(bzwo.class, bzwo);
    }

    private bzwo() {
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
            return GeneratedMessageLite.m124022a(f171658c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzwo();
        } else {
            if (i2 == 4) {
                return new bxvd(f171658c);
            }
            if (i2 == 5) {
                return f171658c;
            }
            bxxk bxxk = f171659d;
            if (bxxk == null) {
                synchronized (bzwo.class) {
                    bxxk = f171659d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171658c);
                        f171659d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
