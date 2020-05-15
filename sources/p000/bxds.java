package p000;

/* renamed from: bxds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxds extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxvu f163056e = new bxdo();

    /* renamed from: g */
    public static final bxvu f163057g = new bxdp();

    /* renamed from: h */
    public static final bxds f163058h;

    /* renamed from: i */
    private static volatile bxxk f163059i;

    /* renamed from: a */
    public int f163060a;

    /* renamed from: b */
    public int f163061b;

    /* renamed from: c */
    public long f163062c;

    /* renamed from: d */
    public bxvt f163063d = bxvm.f164965b;

    /* renamed from: f */
    public bxvt f163064f = bxvm.f164965b;

    static {
        bxds bxds = new bxds();
        f163058h = bxds;
        bxvk.m124024a(bxds.class, bxds);
    }

    private bxds() {
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
            return bxvk.m124022a(f163058h, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003\u001e\u0004\u001e", new Object[]{"a", "b", bxdq.f163055a, "c", "d", bxly.m122853b(), "f", bxma.m122857b()});
        } else if (i2 == 3) {
            return new bxds();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f163058h;
            }
            bxxk bxxk = f163059i;
            if (bxxk == null) {
                synchronized (bxds.class) {
                    bxxk = f163059i;
                    if (bxxk == null) {
                        bxxk = new bxve(f163058h);
                        f163059i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
