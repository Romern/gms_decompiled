package p000;

/* renamed from: bkyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkyx extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bkyx f125525e;

    /* renamed from: f */
    private static volatile bxxk f125526f;

    /* renamed from: a */
    public int f125527a;

    /* renamed from: b */
    public boolean f125528b;

    /* renamed from: c */
    public boolean f125529c;

    /* renamed from: d */
    public int f125530d;

    static {
        bkyx bkyx = new bkyx();
        f125525e = bkyx;
        bxvk.m124024a(bkyx.class, bkyx);
    }

    private bkyx() {
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
            return bxvk.m124022a(f125525e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", bkyj.f125462a});
        } else if (i2 == 3) {
            return new bkyx();
        } else {
            if (i2 == 4) {
                return new bxvd(f125525e);
            }
            if (i2 == 5) {
                return f125525e;
            }
            bxxk bxxk = f125526f;
            if (bxxk == null) {
                synchronized (bkyx.class) {
                    bxxk = f125526f;
                    if (bxxk == null) {
                        bxxk = new bxve(f125525e);
                        f125526f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
