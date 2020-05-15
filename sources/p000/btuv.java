package p000;

/* renamed from: btuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btuv extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btuv f150638e;

    /* renamed from: f */
    public static final bxvj f150639f;

    /* renamed from: g */
    private static volatile bxxk f150640g;

    /* renamed from: a */
    public int f150641a;

    /* renamed from: b */
    public long f150642b;

    /* renamed from: c */
    public btuy f150643c;

    /* renamed from: d */
    public btuz f150644d;

    static {
        btuv btuv = new btuv();
        f150638e = btuv;
        bxvk.m124024a(btuv.class, btuv);
        bygn bygn = bygn.f166357a;
        btuv btuv2 = f150638e;
        f150639f = bxvk.m124006a(bygn, btuv2, btuv2, 215961826, bxzf.MESSAGE);
    }

    private btuv() {
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
            return bxvk.m124022a(f150638e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဉ\u0003\u0004ဉ\u0001", new Object[]{"a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new btuv();
        } else {
            if (i2 == 4) {
                return new bxvd(f150638e);
            }
            if (i2 == 5) {
                return f150638e;
            }
            bxxk bxxk = f150640g;
            if (bxxk == null) {
                synchronized (btuv.class) {
                    bxxk = f150640g;
                    if (bxxk == null) {
                        bxxk = new bxve(f150638e);
                        f150640g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
