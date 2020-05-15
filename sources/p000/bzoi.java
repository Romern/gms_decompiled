package p000;

/* renamed from: bzoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzoi extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzoi f170814d;

    /* renamed from: e */
    private static volatile bxxk f170815e;

    /* renamed from: a */
    public bzoa f170816a;

    /* renamed from: b */
    public String f170817b = "";

    /* renamed from: c */
    public String f170818c = "";

    static {
        bzoi bzoi = new bzoi();
        f170814d = bzoi;
        bxvk.m124024a(bzoi.class, bzoi);
    }

    private bzoi() {
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
            return bxvk.m124022a(f170814d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzoi();
        } else {
            if (i2 == 4) {
                return new bxvd(f170814d);
            }
            if (i2 == 5) {
                return f170814d;
            }
            bxxk bxxk = f170815e;
            if (bxxk == null) {
                synchronized (bzoi.class) {
                    bxxk = f170815e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170814d);
                        f170815e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
