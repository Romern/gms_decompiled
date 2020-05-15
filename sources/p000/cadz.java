package p000;

/* renamed from: cadz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cadz extends bxvk implements bxxd {

    /* renamed from: j */
    public static final cadz f172773j;

    /* renamed from: k */
    private static volatile bxxk f172774k;

    /* renamed from: a */
    public int f172775a;

    /* renamed from: b */
    public String f172776b = "";

    /* renamed from: c */
    public String f172777c = "";

    /* renamed from: d */
    public String f172778d = "";

    /* renamed from: e */
    public long f172779e;

    /* renamed from: f */
    public long f172780f;

    /* renamed from: g */
    public bzzz f172781g;

    /* renamed from: h */
    public int f172782h;

    /* renamed from: i */
    public long f172783i;

    static {
        cadz cadz = new cadz();
        f172773j = cadz;
        bxvk.m124024a(cadz.class, cadz);
    }

    private cadz() {
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
            return bxvk.m124022a(f172773j, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\tဉ\u0006\nင\u0007\u000bဂ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new cadz();
        } else {
            if (i2 == 4) {
                return new bxvd(f172773j);
            }
            if (i2 == 5) {
                return f172773j;
            }
            bxxk bxxk = f172774k;
            if (bxxk == null) {
                synchronized (cadz.class) {
                    bxxk = f172774k;
                    if (bxxk == null) {
                        bxxk = new bxve(f172773j);
                        f172774k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
