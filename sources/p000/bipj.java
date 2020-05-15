package p000;

/* renamed from: bipj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bipj f121170c;

    /* renamed from: e */
    private static volatile bxxk f121171e;

    /* renamed from: a */
    public int f121172a;

    /* renamed from: b */
    public int f121173b = 1;

    /* renamed from: d */
    private byte f121174d = 2;

    static {
        bipj bipj = new bipj();
        f121170c = bipj;
        GeneratedMessageLite.m124024a(bipj.class, bipj);
    }

    private bipj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121174d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121174d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121170c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"a", "b", bipi.m102696b()});
        } else if (i2 == 3) {
            return new bipj();
        } else {
            if (i2 == 4) {
                return new bxvd(f121170c);
            }
            if (i2 == 5) {
                return f121170c;
            }
            bxxk bxxk = f121171e;
            if (bxxk == null) {
                synchronized (bipj.class) {
                    bxxk = f121171e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121170c);
                        f121171e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
