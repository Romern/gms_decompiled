package p000;

/* renamed from: bott */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bott extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bott f134871d;

    /* renamed from: e */
    private static volatile bxxk f134872e;

    /* renamed from: a */
    public int f134873a;

    /* renamed from: b */
    public String f134874b = "";

    /* renamed from: c */
    public String f134875c = "";

    static {
        bott bott = new bott();
        f134871d = bott;
        GeneratedMessageLite.m124024a(bott.class, bott);
    }

    private bott() {
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
            return GeneratedMessageLite.m124022a(f134871d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bott();
        } else {
            if (i2 == 4) {
                return new bxvd(f134871d);
            }
            if (i2 == 5) {
                return f134871d;
            }
            bxxk bxxk = f134872e;
            if (bxxk == null) {
                synchronized (bott.class) {
                    bxxk = f134872e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134871d);
                        f134872e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
