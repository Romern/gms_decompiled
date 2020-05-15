package p000;

/* renamed from: bklf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bklf extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bklf f124736f;

    /* renamed from: g */
    private static volatile bxxk f124737g;

    /* renamed from: a */
    public int f124738a;

    /* renamed from: b */
    public String f124739b = "";

    /* renamed from: c */
    public String f124740c = "";

    /* renamed from: d */
    public boolean f124741d;

    /* renamed from: e */
    public String f124742e = "";

    static {
        bklf bklf = new bklf();
        f124736f = bklf;
        GeneratedMessageLite.m124024a(bklf.class, bklf);
    }

    private bklf() {
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
            return GeneratedMessageLite.m124022a(f124736f, "\u0001\u0004\u0000\u0001\u0001\u000b\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\nဇ\t\u000bဈ\n", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bklf();
        } else {
            if (i2 == 4) {
                return new bxvd(f124736f);
            }
            if (i2 == 5) {
                return f124736f;
            }
            bxxk bxxk = f124737g;
            if (bxxk == null) {
                synchronized (bklf.class) {
                    bxxk = f124737g;
                    if (bxxk == null) {
                        bxxk = new bxve(f124736f);
                        f124737g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
