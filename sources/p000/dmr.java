package p000;

/* renamed from: dmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmr extends bxvk implements bxxd {

    /* renamed from: e */
    public static final dmr f13592e;

    /* renamed from: f */
    private static volatile bxxk f13593f;

    /* renamed from: a */
    public int f13594a;

    /* renamed from: b */
    public String f13595b = "";

    /* renamed from: c */
    public int f13596c;

    /* renamed from: d */
    public int f13597d = Integer.MAX_VALUE;

    static {
        dmr dmr = new dmr();
        f13592e = dmr;
        bxvk.m124024a(dmr.class, dmr);
    }

    private dmr() {
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
            return bxvk.m124022a(f13592e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new dmr();
        } else {
            if (i2 == 4) {
                return new bxvd(f13592e);
            }
            if (i2 == 5) {
                return f13592e;
            }
            bxxk bxxk = f13593f;
            if (bxxk == null) {
                synchronized (dmr.class) {
                    bxxk = f13593f;
                    if (bxxk == null) {
                        bxxk = new bxve(f13592e);
                        f13593f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
