package p000;

/* renamed from: bklk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bklk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bklk f124785c;

    /* renamed from: e */
    private static volatile bxxk f124786e;

    /* renamed from: a */
    public String f124787a = "";

    /* renamed from: b */
    public String f124788b = "";

    /* renamed from: d */
    private int f124789d;

    static {
        bklk bklk = new bklk();
        f124785c = bklk;
        GeneratedMessageLite.m124024a(bklk.class, bklk);
    }

    private bklk() {
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
            return GeneratedMessageLite.m124022a(f124785c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bklk();
        } else {
            if (i2 == 4) {
                return new bxvd(f124785c);
            }
            if (i2 == 5) {
                return f124785c;
            }
            bxxk bxxk = f124786e;
            if (bxxk == null) {
                synchronized (bklk.class) {
                    bxxk = f124786e;
                    if (bxxk == null) {
                        bxxk = new bxve(f124785c);
                        f124786e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
