package p000;

/* renamed from: abuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abuu extends bxvk implements bxxd {

    /* renamed from: m */
    public static final abuu f58469m;

    /* renamed from: n */
    private static volatile bxxk f58470n;

    /* renamed from: a */
    public int f58471a;

    /* renamed from: b */
    public String f58472b = "";

    /* renamed from: c */
    public long f58473c;

    /* renamed from: d */
    public String f58474d = "";

    /* renamed from: e */
    public String f58475e = "";

    /* renamed from: f */
    public String f58476f = "";

    /* renamed from: g */
    public long f58477g;

    /* renamed from: h */
    public int f58478h;

    /* renamed from: i */
    public abqe f58479i;

    /* renamed from: j */
    public int f58480j = -1;

    /* renamed from: k */
    public boolean f58481k;

    /* renamed from: l */
    public int f58482l;

    static {
        abuu abuu = new abuu();
        f58469m = abuu;
        bxvk.m124024a(abuu.class, abuu);
    }

    private abuu() {
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
            return bxvk.m124022a(f58469m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဃ\u0005\u0007ဌ\u0006\bဉ\u0007\tင\b\nဇ\t\u000bဌ\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", abuy.m48300b(), "i", "j", "k", "l", abtc.m48242b()});
        } else if (i2 == 3) {
            return new abuu();
        } else {
            if (i2 == 4) {
                return new bxvd(f58469m);
            }
            if (i2 == 5) {
                return f58469m;
            }
            bxxk bxxk = f58470n;
            if (bxxk == null) {
                synchronized (abuu.class) {
                    bxxk = f58470n;
                    if (bxxk == null) {
                        bxxk = new bxve(f58469m);
                        f58470n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
