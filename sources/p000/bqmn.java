package p000;

/* renamed from: bqmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqmn extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqmn f141238d;

    /* renamed from: e */
    private static volatile bxxk f141239e;

    /* renamed from: a */
    public ByteString f141240a = ByteString.f164797b;

    /* renamed from: b */
    public ByteString f141241b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f141242c = ByteString.f164797b;

    static {
        bqmn bqmn = new bqmn();
        f141238d = bqmn;
        GeneratedMessageLite.m124024a(bqmn.class, bqmn);
    }

    private bqmn() {
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
            return GeneratedMessageLite.m124022a(f141238d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqmn();
        } else {
            if (i2 == 4) {
                return new bxvd(f141238d);
            }
            if (i2 == 5) {
                return f141238d;
            }
            bxxk bxxk = f141239e;
            if (bxxk == null) {
                synchronized (bqmn.class) {
                    bxxk = f141239e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141238d);
                        f141239e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
