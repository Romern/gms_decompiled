package p000;

/* renamed from: bpgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpgd f137474c;

    /* renamed from: d */
    private static volatile bxxk f137475d;

    /* renamed from: a */
    public int f137476a;

    /* renamed from: b */
    public int f137477b;

    static {
        bpgd bpgd = new bpgd();
        f137474c = bpgd;
        bxvk.m124024a(bpgd.class, bpgd);
    }

    private bpgd() {
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
            return bxvk.m124022a(f137474c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzzv.m126374b()});
        } else if (i2 == 3) {
            return new bpgd();
        } else {
            if (i2 == 4) {
                return new bxvd(f137474c);
            }
            if (i2 == 5) {
                return f137474c;
            }
            bxxk bxxk = f137475d;
            if (bxxk == null) {
                synchronized (bpgd.class) {
                    bxxk = f137475d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137474c);
                        f137475d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
