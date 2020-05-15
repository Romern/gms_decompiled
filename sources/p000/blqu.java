package p000;

/* renamed from: blqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blqu f127402d;

    /* renamed from: g */
    private static volatile bxxk f127403g;

    /* renamed from: a */
    public int f127404a;

    /* renamed from: b */
    public blox f127405b;

    /* renamed from: c */
    public blrj f127406c;

    /* renamed from: e */
    private int f127407e;

    /* renamed from: f */
    private byte f127408f = 2;

    static {
        blqu blqu = new blqu();
        f127402d = blqu;
        GeneratedMessageLite.m124024a(blqu.class, blqu);
    }

    private blqu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127408f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127408f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127402d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"e", "a", blqs.f127401a, "b", "c"});
        } else if (i2 == 3) {
            return new blqu();
        } else {
            if (i2 == 4) {
                return new bxvd(f127402d);
            }
            if (i2 == 5) {
                return f127402d;
            }
            bxxk bxxk = f127403g;
            if (bxxk == null) {
                synchronized (blqu.class) {
                    bxxk = f127403g;
                    if (bxxk == null) {
                        bxxk = new bxve(f127402d);
                        f127403g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
