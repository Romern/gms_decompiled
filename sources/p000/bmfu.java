package p000;

/* renamed from: bmfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfu extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bmfu f129167j;

    /* renamed from: l */
    private static volatile bxxk f129168l;

    /* renamed from: a */
    public int f129169a;

    /* renamed from: b */
    public bmhy f129170b;

    /* renamed from: c */
    public bmil f129171c;

    /* renamed from: d */
    public bmjb f129172d;

    /* renamed from: e */
    public bmeb f129173e;

    /* renamed from: f */
    public bmgp f129174f;

    /* renamed from: g */
    public bmhi f129175g;

    /* renamed from: h */
    public bmki f129176h;

    /* renamed from: i */
    public bmio f129177i;

    /* renamed from: k */
    private byte f129178k = 2;

    static {
        bmfu bmfu = new bmfu();
        f129167j = bmfu;
        bxvk.m124024a(bmfu.class, bmfu);
    }

    private bmfu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f129178k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f129178k = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f129167j, "\u0001\b\u0000\u0001\u0002\u0011\b\u0000\u0000\u0002\u0002ဉ\u0000\u0005ဉ\u0001\u0007ဉ\u0002\u000bᐉ\u0003\fဉ\u0004\u000eဉ\u0005\u000fᐉ\u0006\u0011ဉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bmfu();
        } else {
            if (i2 == 4) {
                return new bxvd(f129167j);
            }
            if (i2 == 5) {
                return f129167j;
            }
            bxxk bxxk = f129168l;
            if (bxxk == null) {
                synchronized (bmfu.class) {
                    bxxk = f129168l;
                    if (bxxk == null) {
                        bxxk = new bxve(f129167j);
                        f129168l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
