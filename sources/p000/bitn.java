package p000;

/* renamed from: bitn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bitn extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bitn f121680d;

    /* renamed from: g */
    private static volatile bxxk f121681g;

    /* renamed from: a */
    public birj f121682a;

    /* renamed from: b */
    public String f121683b = "";

    /* renamed from: c */
    public String f121684c = "";

    /* renamed from: e */
    private int f121685e;

    /* renamed from: f */
    private byte f121686f = 2;

    static {
        bitn bitn = new bitn();
        f121680d = bitn;
        GeneratedMessageLite.m124024a(bitn.class, bitn);
    }

    private bitn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121686f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121686f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121680d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bitn();
        } else {
            if (i2 == 4) {
                return new bxvd(f121680d);
            }
            if (i2 == 5) {
                return f121680d;
            }
            bxxk bxxk = f121681g;
            if (bxxk == null) {
                synchronized (bitn.class) {
                    bxxk = f121681g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121680d);
                        f121681g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
