package p000;

/* renamed from: bwiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwiq extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bwiq f159670k;

    /* renamed from: l */
    private static volatile bxxk f159671l;

    /* renamed from: a */
    public int f159672a;

    /* renamed from: b */
    public String f159673b = "";

    /* renamed from: c */
    public int f159674c;

    /* renamed from: d */
    public String f159675d = "";

    /* renamed from: e */
    public String f159676e = "";

    /* renamed from: f */
    public boolean f159677f;

    /* renamed from: g */
    public int f159678g;

    /* renamed from: h */
    public String f159679h = "";

    /* renamed from: i */
    public bxwc f159680i = bxxn.f165040b;

    /* renamed from: j */
    public String f159681j = "";

    static {
        bwiq bwiq = new bwiq();
        f159670k = bwiq;
        bxvk.m124024a(bwiq.class, bwiq);
    }

    private bwiq() {
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
            return bxvk.m124022a(f159670k, "\u0001\t\u0000\u0001\u0005\r\t\u0000\u0001\u0000\u0005ဈ\u0000\u0006င\u0001\u0007ဈ\u0002\bဈ\u0003\tဇ\u0004\nင\u0005\u000bဈ\u0006\f\u001a\rဈ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bwiq();
        } else {
            if (i2 == 4) {
                return new bxvd(f159670k);
            }
            if (i2 == 5) {
                return f159670k;
            }
            bxxk bxxk = f159671l;
            if (bxxk == null) {
                synchronized (bwiq.class) {
                    bxxk = f159671l;
                    if (bxxk == null) {
                        bxxk = new bxve(f159670k);
                        f159671l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
