package p000;

/* renamed from: cbba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbba extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbba f176520d;

    /* renamed from: e */
    private static volatile bxxk f176521e;

    /* renamed from: a */
    public ByteString f176522a = ByteString.f164797b;

    /* renamed from: b */
    public ByteString f176523b = ByteString.f164797b;

    /* renamed from: c */
    public int f176524c;

    static {
        cbba cbba = new cbba();
        f176520d = cbba;
        GeneratedMessageLite.m124024a(cbba.class, cbba);
    }

    private cbba() {
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
            return GeneratedMessageLite.m124022a(f176520d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbba();
        } else {
            if (i2 == 4) {
                return new bxvd(f176520d);
            }
            if (i2 == 5) {
                return f176520d;
            }
            bxxk bxxk = f176521e;
            if (bxxk == null) {
                synchronized (cbba.class) {
                    bxxk = f176521e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176520d);
                        f176521e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
