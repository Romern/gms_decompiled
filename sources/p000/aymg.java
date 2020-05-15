package p000;

/* renamed from: aymg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aymg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final aymg f97968e;

    /* renamed from: f */
    private static volatile bxxk f97969f;

    /* renamed from: a */
    public int f97970a;

    /* renamed from: b */
    public int f97971b;

    /* renamed from: c */
    public int f97972c;

    /* renamed from: d */
    public int f97973d;

    static {
        aymg aymg = new aymg();
        f97968e = aymg;
        bxvk.m124024a(aymg.class, aymg);
    }

    private aymg() {
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
            return bxvk.m124022a(f97968e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", aymd.m84247b(), "c", ayma.f97948a, "d", ayme.f97967a});
        } else if (i2 == 3) {
            return new aymg();
        } else {
            if (i2 == 4) {
                return new bxvd(f97968e);
            }
            if (i2 == 5) {
                return f97968e;
            }
            bxxk bxxk = f97969f;
            if (bxxk == null) {
                synchronized (aymg.class) {
                    bxxk = f97969f;
                    if (bxxk == null) {
                        bxxk = new bxve(f97968e);
                        f97969f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
