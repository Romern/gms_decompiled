package p000;

/* renamed from: bzmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzmv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzmv f170662d;

    /* renamed from: e */
    private static volatile bxxk f170663e;

    /* renamed from: a */
    public int f170664a;

    /* renamed from: b */
    public bzmf f170665b;

    /* renamed from: c */
    public bzmg f170666c;

    static {
        bzmv bzmv = new bzmv();
        f170662d = bzmv;
        bxvk.m124024a(bzmv.class, bzmv);
    }

    private bzmv() {
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
            return bxvk.m124022a(f170662d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzmv();
        } else {
            if (i2 == 4) {
                return new bxvd(f170662d);
            }
            if (i2 == 5) {
                return f170662d;
            }
            bxxk bxxk = f170663e;
            if (bxxk == null) {
                synchronized (bzmv.class) {
                    bxxk = f170663e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170662d);
                        f170663e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
