package p000;

/* renamed from: cimh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cimh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cimh f190716c;

    /* renamed from: d */
    private static volatile bxxk f190717d;

    /* renamed from: a */
    public int f190718a;

    /* renamed from: b */
    public int f190719b;

    static {
        cimh cimh = new cimh();
        f190716c = cimh;
        bxvk.m124024a(cimh.class, cimh);
    }

    private cimh() {
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
            return bxvk.m124022a(f190716c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", cimd.f190701a});
        } else if (i2 == 3) {
            return new cimh();
        } else {
            if (i2 == 4) {
                return new bxvd(f190716c);
            }
            if (i2 == 5) {
                return f190716c;
            }
            bxxk bxxk = f190717d;
            if (bxxk == null) {
                synchronized (cimh.class) {
                    bxxk = f190717d;
                    if (bxxk == null) {
                        bxxk = new bxve(f190716c);
                        f190717d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
