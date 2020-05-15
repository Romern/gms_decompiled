package p000;

/* renamed from: cbmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbmn f177650c;

    /* renamed from: d */
    private static volatile bxxk f177651d;

    /* renamed from: a */
    public ByteString f177652a = ByteString.f164797b;

    /* renamed from: b */
    public bxvt f177653b = bxvm.f164965b;

    static {
        cbmn cbmn = new cbmn();
        f177650c = cbmn;
        GeneratedMessageLite.m124024a(cbmn.class, cbmn);
    }

    private cbmn() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f177650c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\n\u0002'", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbmn();
        } else {
            if (i2 == 4) {
                return new bxvd(f177650c);
            }
            if (i2 == 5) {
                return f177650c;
            }
            bxxk bxxk = f177651d;
            if (bxxk == null) {
                synchronized (cbmn.class) {
                    bxxk = f177651d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177650c);
                        f177651d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
