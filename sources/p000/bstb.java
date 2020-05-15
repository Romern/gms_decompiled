package p000;

/* renamed from: bstb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bstb f146964d;

    /* renamed from: e */
    private static volatile bxxk f146965e;

    /* renamed from: a */
    public String f146966a = "";

    /* renamed from: b */
    public String f146967b = "";

    /* renamed from: c */
    public int f146968c;

    static {
        bstb bstb = new bstb();
        f146964d = bstb;
        bxvk.m124024a(bstb.class, bstb);
    }

    private bstb() {
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
            return bxvk.m124022a(f146964d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bstb();
        } else {
            if (i2 == 4) {
                return new bxvd(f146964d);
            }
            if (i2 == 5) {
                return f146964d;
            }
            bxxk bxxk = f146965e;
            if (bxxk == null) {
                synchronized (bstb.class) {
                    bxxk = f146965e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146964d);
                        f146965e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
