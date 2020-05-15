package p000;

/* renamed from: bzia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzia extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzia f170139d;

    /* renamed from: f */
    private static volatile bxxk f170140f;

    /* renamed from: a */
    public String f170141a = "";

    /* renamed from: b */
    public bxwc f170142b = bxxn.f165040b;

    /* renamed from: c */
    public String f170143c = "";

    /* renamed from: e */
    private int f170144e;

    static {
        bzia bzia = new bzia();
        f170139d = bzia;
        bxvk.m124024a(bzia.class, bzia);
    }

    private bzia() {
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
            return bxvk.m124022a(f170139d, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002ဈ\u0001\u0003\u001b\u0005ဈ\u0003", new Object[]{"e", "a", "b", bzib.class, "c"});
        } else if (i2 == 3) {
            return new bzia();
        } else {
            if (i2 == 4) {
                return new bxvd(f170139d);
            }
            if (i2 == 5) {
                return f170139d;
            }
            bxxk bxxk = f170140f;
            if (bxxk == null) {
                synchronized (bzia.class) {
                    bxxk = f170140f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170139d);
                        f170140f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
