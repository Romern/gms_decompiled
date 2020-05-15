package p000;

/* renamed from: bzjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjs extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bzjs f170334i;

    /* renamed from: k */
    private static volatile bxxk f170335k;

    /* renamed from: a */
    public String f170336a = "";

    /* renamed from: b */
    public String f170337b = "";

    /* renamed from: c */
    public String f170338c = "";

    /* renamed from: d */
    public long f170339d;

    /* renamed from: e */
    public bzru f170340e;

    /* renamed from: f */
    public long f170341f;

    /* renamed from: g */
    public bzru f170342g;

    /* renamed from: h */
    public boolean f170343h;

    /* renamed from: j */
    private int f170344j;

    static {
        bzjs bzjs = new bzjs();
        f170334i = bzjs;
        bxvk.m124024a(bzjs.class, bzjs);
    }

    private bzjs() {
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
            return bxvk.m124022a(f170334i, "\u0001\b\u0000\u0001\u0002\f\b\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\bဂ\u0007\tဂ\t\nဇ\u000b\u000bဉ\b\fဉ\n", new Object[]{"j", "a", "b", "c", "d", "f", "h", "e", "g"});
        } else if (i2 == 3) {
            return new bzjs();
        } else {
            if (i2 == 4) {
                return new bxvd(f170334i);
            }
            if (i2 == 5) {
                return f170334i;
            }
            bxxk bxxk = f170335k;
            if (bxxk == null) {
                synchronized (bzjs.class) {
                    bxxk = f170335k;
                    if (bxxk == null) {
                        bxxk = new bxve(f170334i);
                        f170335k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
