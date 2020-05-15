package p000;

/* renamed from: bwte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwte extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwte f160944b;

    /* renamed from: c */
    public static final bxvj f160945c;

    /* renamed from: e */
    private static volatile bxxk f160946e;

    /* renamed from: a */
    public bwtd f160947a;

    /* renamed from: d */
    private int f160948d;

    static {
        bwte bwte = new bwte();
        f160944b = bwte;
        bxvk.m124024a(bwte.class, bwte);
        bwny bwny = bwny.f160414k;
        bwte bwte2 = f160944b;
        f160945c = bxvk.m124006a(bwny, bwte2, bwte2, 217440216, bxzf.MESSAGE);
    }

    private bwte() {
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
            return bxvk.m124022a(f160944b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
        } else if (i2 == 3) {
            return new bwte();
        } else {
            if (i2 == 4) {
                return new bxvd(f160944b);
            }
            if (i2 == 5) {
                return f160944b;
            }
            bxxk bxxk = f160946e;
            if (bxxk == null) {
                synchronized (bwte.class) {
                    bxxk = f160946e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160944b);
                        f160946e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
