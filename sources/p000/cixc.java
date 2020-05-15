package p000;

/* renamed from: cixc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cixc extends bxvk implements bxxd {

    /* renamed from: g */
    public static final cixc f191660g;

    /* renamed from: h */
    private static volatile bxxk f191661h;

    /* renamed from: a */
    public int f191662a;

    /* renamed from: b */
    public int f191663b;

    /* renamed from: c */
    public bxtx f191664c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f191665d = bxtx.f164797b;

    /* renamed from: e */
    public bxtx f191666e = bxtx.f164797b;

    /* renamed from: f */
    public long f191667f;

    static {
        cixc cixc = new cixc();
        f191660g = cixc;
        bxvk.m124024a(cixc.class, cixc);
    }

    private cixc() {
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
            return bxvk.m124022a(f191660g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005စ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new cixc();
        } else {
            if (i2 == 4) {
                return new bxvd(f191660g);
            }
            if (i2 == 5) {
                return f191660g;
            }
            bxxk bxxk = f191661h;
            if (bxxk == null) {
                synchronized (cixc.class) {
                    bxxk = f191661h;
                    if (bxxk == null) {
                        bxxk = new bxve(f191660g);
                        f191661h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
