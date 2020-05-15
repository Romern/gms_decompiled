package p000;

/* renamed from: boxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boxg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final boxg f135244e;

    /* renamed from: f */
    private static volatile bxxk f135245f;

    /* renamed from: a */
    public int f135246a;

    /* renamed from: b */
    public String f135247b = "";

    /* renamed from: c */
    public String f135248c = "";

    /* renamed from: d */
    public int f135249d;

    static {
        boxg boxg = new boxg();
        f135244e = boxg;
        bxvk.m124024a(boxg.class, boxg);
    }

    private boxg() {
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
            return bxvk.m124022a(f135244e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", boxf.f135243a});
        } else if (i2 == 3) {
            return new boxg();
        } else {
            if (i2 == 4) {
                return new bxvd(f135244e);
            }
            if (i2 == 5) {
                return f135244e;
            }
            bxxk bxxk = f135245f;
            if (bxxk == null) {
                synchronized (boxg.class) {
                    bxxk = f135245f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135244e);
                        f135245f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
