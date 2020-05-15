package p000;

/* renamed from: aaik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaik extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final aaik f28187d;

    /* renamed from: f */
    private static volatile bxxk f28188f;

    /* renamed from: a */
    public boolean f28189a;

    /* renamed from: b */
    public String f28190b = "";

    /* renamed from: c */
    public ByteString f28191c = ByteString.f164797b;

    /* renamed from: e */
    private int f28192e;

    static {
        aaik aaik = new aaik();
        f28187d = aaik;
        GeneratedMessageLite.m124024a(aaik.class, aaik);
    }

    private aaik() {
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
            return GeneratedMessageLite.m124022a(f28187d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new aaik();
        } else {
            if (i2 == 4) {
                return new bxvd(f28187d);
            }
            if (i2 == 5) {
                return f28187d;
            }
            bxxk bxxk = f28188f;
            if (bxxk == null) {
                synchronized (aaik.class) {
                    bxxk = f28188f;
                    if (bxxk == null) {
                        bxxk = new bxve(f28187d);
                        f28188f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
