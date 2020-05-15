package p000;

/* renamed from: blpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpo extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final blpo f127258h;

    /* renamed from: j */
    private static volatile bxxk f127259j;

    /* renamed from: a */
    public int f127260a;

    /* renamed from: b */
    public blrk f127261b;

    /* renamed from: c */
    public blrn f127262c;

    /* renamed from: d */
    public blox f127263d;

    /* renamed from: e */
    public blrj f127264e;

    /* renamed from: f */
    public boolean f127265f;

    /* renamed from: g */
    public blnl f127266g;

    /* renamed from: i */
    private byte f127267i = 2;

    static {
        blpo blpo = new blpo();
        f127258h = blpo;
        GeneratedMessageLite.m124024a(blpo.class, blpo);
    }

    private blpo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127267i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127267i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127258h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0007ဇ\u0004\tဉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new blpo();
        } else {
            if (i2 == 4) {
                return new bxvd(f127258h);
            }
            if (i2 == 5) {
                return f127258h;
            }
            bxxk bxxk = f127259j;
            if (bxxk == null) {
                synchronized (blpo.class) {
                    bxxk = f127259j;
                    if (bxxk == null) {
                        bxxk = new bxve(f127258h);
                        f127259j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
