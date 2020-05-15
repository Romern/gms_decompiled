package p000;

/* renamed from: bssf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bssf f146855c;

    /* renamed from: d */
    private static volatile bxxk f146856d;

    /* renamed from: a */
    public int f146857a;

    /* renamed from: b */
    public ByteString f146858b = ByteString.f164797b;

    static {
        bssf bssf = new bssf();
        f146855c = bssf;
        GeneratedMessageLite.m124024a(bssf.class, bssf);
    }

    private bssf() {
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
            return GeneratedMessageLite.m124022a(f146855c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bssf();
        } else {
            if (i2 == 4) {
                return new bxvd(f146855c);
            }
            if (i2 == 5) {
                return f146855c;
            }
            bxxk bxxk = f146856d;
            if (bxxk == null) {
                synchronized (bssf.class) {
                    bxxk = f146856d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146855c);
                        f146856d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
