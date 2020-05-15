package p000;

/* renamed from: bokg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bokg extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bokg f133400g;

    /* renamed from: h */
    private static volatile bxxk f133401h;

    /* renamed from: a */
    public int f133402a;

    /* renamed from: b */
    public boolean f133403b;

    /* renamed from: c */
    public bxwc f133404c = bxxn.f165040b;

    /* renamed from: d */
    public int f133405d;

    /* renamed from: e */
    public boolean f133406e;

    /* renamed from: f */
    public int f133407f;

    static {
        bokg bokg = new bokg();
        f133400g = bokg;
        bxvk.m124024a(bokg.class, bokg);
    }

    private bokg() {
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
            return bxvk.m124022a(f133400g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဇ\u0002\u0005င\u0003", new Object[]{"a", "b", "c", boke.class, "d", bokf.f133399a, "e", "f"});
        } else if (i2 == 3) {
            return new bokg();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f133400g;
            }
            bxxk bxxk = f133401h;
            if (bxxk == null) {
                synchronized (bokg.class) {
                    bxxk = f133401h;
                    if (bxxk == null) {
                        bxxk = new bxve(f133400g);
                        f133401h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
