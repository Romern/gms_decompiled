package p000;

/* renamed from: bqmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqmw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqmw f141272c;

    /* renamed from: d */
    private static volatile bxxk f141273d;

    /* renamed from: a */
    public ByteString f141274a = ByteString.f164797b;

    /* renamed from: b */
    public bxwc f141275b = bxxn.f165040b;

    static {
        bqmw bqmw = new bqmw();
        f141272c = bqmw;
        GeneratedMessageLite.m124024a(bqmw.class, bqmw);
    }

    private bqmw() {
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
            return GeneratedMessageLite.m124022a(f141272c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\n\u0002\u001b", new Object[]{"a", "b", bqmy.class});
        } else if (i2 == 3) {
            return new bqmw();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f141272c;
            }
            bxxk bxxk = f141273d;
            if (bxxk == null) {
                synchronized (bqmw.class) {
                    bxxk = f141273d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141272c);
                        f141273d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
