package p000;

/* renamed from: bwvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwvl extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bwvl f161141h;

    /* renamed from: i */
    public static final bxvj f161142i;

    /* renamed from: k */
    private static volatile bxxk f161143k;

    /* renamed from: a */
    public int f161144a = 0;

    /* renamed from: b */
    public Object f161145b;

    /* renamed from: c */
    public String f161146c = "";

    /* renamed from: d */
    public bxvw f161147d = bxwq.f165002b;

    /* renamed from: e */
    public String f161148e = "";

    /* renamed from: f */
    public String f161149f = "";

    /* renamed from: g */
    public bxwc f161150g = bxxn.f165040b;

    /* renamed from: j */
    private int f161151j;

    static {
        bwvl bwvl = new bwvl();
        f161141h = bwvl;
        bxvk.m124024a(bwvl.class, bwvl);
        bwny bwny = bwny.f160414k;
        bwvl bwvl2 = f161141h;
        f161142i = bxvk.m124006a(bwny, bwvl2, bwvl2, 67853280, bxzf.MESSAGE);
    }

    private bwvl() {
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
            return bxvk.m124022a(f161141h, "\u0001\u0007\u0001\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ျ\u0000\u0002ဈ\u0002\u0003ျ\u0000\u0005\u0014\u0006ဈ\u0003\u0007\u001b\tဈ\u0004", new Object[]{"b", "a", "j", "c", "d", "e", "g", bwuf.class, "f"});
        } else if (i2 == 3) {
            return new bwvl();
        } else {
            if (i2 == 4) {
                return new bxvd(f161141h);
            }
            if (i2 == 5) {
                return f161141h;
            }
            bxxk bxxk = f161143k;
            if (bxxk == null) {
                synchronized (bwvl.class) {
                    bxxk = f161143k;
                    if (bxxk == null) {
                        bxxk = new bxve(f161141h);
                        f161143k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
