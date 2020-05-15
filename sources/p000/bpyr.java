package p000;

/* renamed from: bpyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpyr f139920d;

    /* renamed from: e */
    private static volatile bxxk f139921e;

    /* renamed from: a */
    public int f139922a;

    /* renamed from: b */
    public String f139923b = "";

    /* renamed from: c */
    public int f139924c;

    static {
        bpyr bpyr = new bpyr();
        f139920d = bpyr;
        bxvk.m124024a(bpyr.class, bpyr);
    }

    private bpyr() {
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
            return bxvk.m124022a(f139920d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bqbh.m112509b()});
        } else if (i2 == 3) {
            return new bpyr();
        } else {
            if (i2 == 4) {
                return new bxvd(f139920d);
            }
            if (i2 == 5) {
                return f139920d;
            }
            bxxk bxxk = f139921e;
            if (bxxk == null) {
                synchronized (bpyr.class) {
                    bxxk = f139921e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139920d);
                        f139921e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
