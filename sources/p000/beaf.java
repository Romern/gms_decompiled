package p000;

/* renamed from: beaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beaf extends bxvk implements bxxd {

    /* renamed from: g */
    public static final beaf f106724g;

    /* renamed from: h */
    private static volatile bxxk f106725h;

    /* renamed from: a */
    public int f106726a;

    /* renamed from: b */
    public String f106727b = "";

    /* renamed from: c */
    public bxtx f106728c = bxtx.f164797b;

    /* renamed from: d */
    public String f106729d = "";

    /* renamed from: e */
    public long f106730e;

    /* renamed from: f */
    public bxwc f106731f = bxxn.f165040b;

    static {
        beaf beaf = new beaf();
        f106724g = beaf;
        bxvk.m124024a(beaf.class, beaf);
    }

    private beaf() {
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
            return bxvk.m124022a(f106724g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", "f", beag.class});
        } else if (i2 == 3) {
            return new beaf();
        } else {
            if (i2 == 4) {
                return new beae();
            }
            if (i2 == 5) {
                return f106724g;
            }
            bxxk bxxk = f106725h;
            if (bxxk == null) {
                synchronized (beaf.class) {
                    bxxk = f106725h;
                    if (bxxk == null) {
                        bxxk = new bxve(f106724g);
                        f106725h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
