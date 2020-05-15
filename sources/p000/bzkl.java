package p000;

/* renamed from: bzkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzkl extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bzkl f170439g;

    /* renamed from: h */
    private static volatile bxxk f170440h;

    /* renamed from: a */
    public int f170441a;

    /* renamed from: b */
    public int f170442b;

    /* renamed from: c */
    public int f170443c;

    /* renamed from: d */
    public double f170444d;

    /* renamed from: e */
    public int f170445e;

    /* renamed from: f */
    public int f170446f;

    static {
        bzkl bzkl = new bzkl();
        f170439g = bzkl;
        GeneratedMessageLite.m124024a(bzkl.class, bzkl);
    }

    private bzkl() {
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
            return GeneratedMessageLite.m124022a(f170439g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003က\u0002\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", bzkk.f170438a, "c", bzkj.f170437a, "d", "e", bzki.f170436a, "f", bzki.f170436a});
        } else if (i2 == 3) {
            return new bzkl();
        } else {
            if (i2 == 4) {
                return new bxvd(f170439g);
            }
            if (i2 == 5) {
                return f170439g;
            }
            bxxk bxxk = f170440h;
            if (bxxk == null) {
                synchronized (bzkl.class) {
                    bxxk = f170440h;
                    if (bxxk == null) {
                        bxxk = new bxve(f170439g);
                        f170440h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
