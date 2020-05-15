package p000;

/* renamed from: bptd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptd extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bptd f139090g;

    /* renamed from: h */
    private static volatile bxxk f139091h;

    /* renamed from: a */
    public int f139092a;

    /* renamed from: b */
    public boolean f139093b;

    /* renamed from: c */
    public int f139094c;

    /* renamed from: d */
    public int f139095d;

    /* renamed from: e */
    public bptj f139096e;

    /* renamed from: f */
    public int f139097f;

    static {
        bptd bptd = new bptd();
        f139090g = bptd;
        bxvk.m124024a(bptd.class, bptd);
    }

    private bptd() {
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
            return bxvk.m124022a(f139090g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", "c", bpes.m111844b(), "d", bpek.f137295a, "e", "f", bpet.f137354a});
        } else if (i2 == 3) {
            return new bptd();
        } else {
            if (i2 == 4) {
                return new bxvd(f139090g);
            }
            if (i2 == 5) {
                return f139090g;
            }
            bxxk bxxk = f139091h;
            if (bxxk == null) {
                synchronized (bptd.class) {
                    bxxk = f139091h;
                    if (bxxk == null) {
                        bxxk = new bxve(f139090g);
                        f139091h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
