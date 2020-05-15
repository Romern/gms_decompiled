package p000;

/* renamed from: cbmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbmj f177631d;

    /* renamed from: e */
    private static volatile bxxk f177632e;

    /* renamed from: a */
    public int f177633a;

    /* renamed from: b */
    public bxtx f177634b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f177635c = bxtx.f164797b;

    static {
        cbmj cbmj = new cbmj();
        f177631d = cbmj;
        bxvk.m124024a(cbmj.class, cbmj);
    }

    private cbmj() {
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
            return bxvk.m124022a(f177631d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\n\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbmj();
        } else {
            if (i2 == 4) {
                return new bxvd(f177631d);
            }
            if (i2 == 5) {
                return f177631d;
            }
            bxxk bxxk = f177632e;
            if (bxxk == null) {
                synchronized (cbmj.class) {
                    bxxk = f177632e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177631d);
                        f177632e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
