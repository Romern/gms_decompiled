package p000;

/* renamed from: btkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkq extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btkq f149290b;

    /* renamed from: c */
    private static volatile bxxk f149291c;

    /* renamed from: a */
    public ByteString f149292a = ByteString.f164797b;

    static {
        btkq btkq = new btkq();
        f149290b = btkq;
        GeneratedMessageLite.m124024a(btkq.class, btkq);
    }

    private btkq() {
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
            return GeneratedMessageLite.m124022a(f149290b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btkq();
        } else {
            if (i2 == 4) {
                return new bxvd(f149290b);
            }
            if (i2 == 5) {
                return f149290b;
            }
            bxxk bxxk = f149291c;
            if (bxxk == null) {
                synchronized (btkq.class) {
                    bxxk = f149291c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149290b);
                        f149291c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
