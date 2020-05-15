package p000;

/* renamed from: bydu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bydu f165857c;

    /* renamed from: d */
    private static volatile bxxk f165858d;

    /* renamed from: a */
    public String f165859a = "";

    /* renamed from: b */
    public String f165860b = "";

    static {
        bydu bydu = new bydu();
        f165857c = bydu;
        bxvk.m124024a(bydu.class, bydu);
    }

    private bydu() {
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
            return bxvk.m124022a(f165857c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bydu();
        } else {
            if (i2 == 4) {
                return new bxvd(f165857c);
            }
            if (i2 == 5) {
                return f165857c;
            }
            bxxk bxxk = f165858d;
            if (bxxk == null) {
                synchronized (bydu.class) {
                    bxxk = f165858d;
                    if (bxxk == null) {
                        bxxk = new bxve(f165857c);
                        f165858d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
