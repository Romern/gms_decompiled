package p000;

/* renamed from: aapz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapz extends bxvk implements bxxd {

    /* renamed from: f */
    public static final aapz f28865f;

    /* renamed from: g */
    private static volatile bxxk f28866g;

    /* renamed from: a */
    public int f28867a;

    /* renamed from: b */
    public int f28868b;

    /* renamed from: c */
    public bxun f28869c;

    /* renamed from: d */
    public long f28870d;

    /* renamed from: e */
    public int f28871e;

    static {
        aapz aapz = new aapz();
        f28865f = aapz;
        bxvk.m124024a(aapz.class, aapz);
    }

    private aapz() {
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
            return bxvk.m124022a(f28865f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", aapx.m21802b(), "c", "d", "e", aapy.f28864a});
        } else if (i2 == 3) {
            return new aapz();
        } else {
            if (i2 == 4) {
                return new bxvd(f28865f);
            }
            if (i2 == 5) {
                return f28865f;
            }
            bxxk bxxk = f28866g;
            if (bxxk == null) {
                synchronized (aapz.class) {
                    bxxk = f28866g;
                    if (bxxk == null) {
                        bxxk = new bxve(f28865f);
                        f28866g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
