package p000;

/* renamed from: biuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biuy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxvu f121886d = new biuv();

    /* renamed from: f */
    public static final bxvu f121887f = new biuw();

    /* renamed from: g */
    public static final biuy f121888g;

    /* renamed from: j */
    private static volatile bxxk f121889j;

    /* renamed from: a */
    public bxwc f121890a = bxxn.f165040b;

    /* renamed from: b */
    public int f121891b;

    /* renamed from: c */
    public bxvt f121892c = bxvm.f164965b;

    /* renamed from: e */
    public bxvt f121893e = bxvm.f164965b;

    /* renamed from: h */
    private int f121894h;

    /* renamed from: i */
    private byte f121895i = 2;

    static {
        biuy biuy = new biuy();
        f121888g = biuy;
        bxvk.m124024a(biuy.class, biuy);
    }

    private biuy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121895i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121895i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121888g, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0001\u0001Л\u0002ဋ\u0000\u0003\u001e\u0004\u001e", new Object[]{"h", "a", biux.class, "b", "c", biqk.m102730b(), "e", biqf.m102721b()});
        } else if (i2 == 3) {
            return new biuy();
        } else {
            if (i2 == 4) {
                return new bxvd(f121888g);
            }
            if (i2 == 5) {
                return f121888g;
            }
            bxxk bxxk = f121889j;
            if (bxxk == null) {
                synchronized (biuy.class) {
                    bxxk = f121889j;
                    if (bxxk == null) {
                        bxxk = new bxve(f121888g);
                        f121889j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
