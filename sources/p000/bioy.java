package p000;

/* renamed from: bioy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bioy extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bioy f121118e;

    /* renamed from: g */
    private static volatile bxxk f121119g;

    /* renamed from: a */
    public int f121120a;

    /* renamed from: b */
    public int f121121b;

    /* renamed from: c */
    public int f121122c;

    /* renamed from: d */
    public boolean f121123d;

    /* renamed from: f */
    private byte f121124f = 2;

    static {
        bioy bioy = new bioy();
        f121118e = bioy;
        GeneratedMessageLite.m124024a(bioy.class, bioy);
    }

    private bioy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121124f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121124f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121118e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔋ\u0000\u0002ဋ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bioy();
        } else {
            if (i2 == 4) {
                return new bxvd(f121118e);
            }
            if (i2 == 5) {
                return f121118e;
            }
            bxxk bxxk = f121119g;
            if (bxxk == null) {
                synchronized (bioy.class) {
                    bxxk = f121119g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121118e);
                        f121119g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
