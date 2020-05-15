package p000;

/* renamed from: bqlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqlu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqlu f141170d;

    /* renamed from: e */
    private static volatile bxxk f141171e;

    /* renamed from: a */
    public ByteString f141172a = ByteString.f164797b;

    /* renamed from: b */
    public ByteString f141173b = ByteString.f164797b;

    /* renamed from: c */
    public bxwc f141174c = bxxn.f165040b;

    static {
        bqlu bqlu = new bqlu();
        f141170d = bqlu;
        GeneratedMessageLite.m124024a(bqlu.class, bqlu);
    }

    private bqlu() {
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
            return GeneratedMessageLite.m124022a(f141170d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\n\u0002\n\u0003\u001b", new Object[]{"a", "b", "c", bqlt.class});
        } else if (i2 == 3) {
            return new bqlu();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f141170d;
            }
            bxxk bxxk = f141171e;
            if (bxxk == null) {
                synchronized (bqlu.class) {
                    bxxk = f141171e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141170d);
                        f141171e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
