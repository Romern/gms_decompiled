package p000;

/* renamed from: bwef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwef extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bwef f158969g;

    /* renamed from: h */
    private static volatile bxxk f158970h;

    /* renamed from: a */
    public int f158971a;

    /* renamed from: b */
    public bxwc f158972b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f158973c = bxxn.f165040b;

    /* renamed from: d */
    public String f158974d = "";

    /* renamed from: e */
    public bwee f158975e;

    /* renamed from: f */
    public String f158976f = "";

    static {
        bwef bwef = new bwef();
        f158969g = bwef;
        bxvk.m124024a(bwef.class, bwef);
    }

    private bwef() {
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
            return bxvk.m124022a(f158969g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဈ\u0000\u0004ဉ\u0001\u0005ဈ\u0002", new Object[]{"a", "b", bweb.class, "c", bwds.class, "d", "e", "f"});
        } else if (i2 == 3) {
            return new bwef();
        } else {
            if (i2 == 4) {
                return new bwdy();
            }
            if (i2 == 5) {
                return f158969g;
            }
            bxxk bxxk = f158970h;
            if (bxxk == null) {
                synchronized (bwef.class) {
                    bxxk = f158970h;
                    if (bxxk == null) {
                        bxxk = new bxve(f158969g);
                        f158970h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
