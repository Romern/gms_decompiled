package p000;

/* renamed from: bzci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzci extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzci f169330c;

    /* renamed from: f */
    private static volatile bxxk f169331f;

    /* renamed from: a */
    public bzcm f169332a;

    /* renamed from: b */
    public String f169333b = "";

    /* renamed from: d */
    private int f169334d;

    /* renamed from: e */
    private byte f169335e = 2;

    static {
        bzci bzci = new bzci();
        f169330c = bzci;
        bxvk.m124024a(bzci.class, bzci);
    }

    private bzci() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169335e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169335e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169330c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzci();
        } else {
            if (i2 == 4) {
                return new bxvd(f169330c);
            }
            if (i2 == 5) {
                return f169330c;
            }
            bxxk bxxk = f169331f;
            if (bxxk == null) {
                synchronized (bzci.class) {
                    bxxk = f169331f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169330c);
                        f169331f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
