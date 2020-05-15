package p000;

/* renamed from: brdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brdy extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final brdy f142577c;

    /* renamed from: e */
    private static volatile bxxk f142578e;

    /* renamed from: a */
    public int f142579a;

    /* renamed from: b */
    public String f142580b = "";

    /* renamed from: d */
    private int f142581d;

    static {
        brdy brdy = new brdy();
        f142577c = brdy;
        GeneratedMessageLite.m124024a(brdy.class, brdy);
    }

    private brdy() {
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
            return GeneratedMessageLite.m124022a(f142577c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", brdz.f142582a, "b"});
        } else if (i2 == 3) {
            return new brdy();
        } else {
            if (i2 == 4) {
                return new bxvd(f142577c);
            }
            if (i2 == 5) {
                return f142577c;
            }
            bxxk bxxk = f142578e;
            if (bxxk == null) {
                synchronized (brdy.class) {
                    bxxk = f142578e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142577c);
                        f142578e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
