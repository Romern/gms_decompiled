package p000;

/* renamed from: bsqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqu extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bsqu f146684j;

    /* renamed from: k */
    private static volatile bxxk f146685k;

    /* renamed from: a */
    public int f146686a;

    /* renamed from: b */
    public int f146687b;

    /* renamed from: c */
    public String f146688c = "";

    /* renamed from: d */
    public long f146689d;

    /* renamed from: e */
    public String f146690e = "";

    /* renamed from: f */
    public String f146691f = "";

    /* renamed from: g */
    public String f146692g = "";

    /* renamed from: h */
    public String f146693h = "";

    /* renamed from: i */
    public bsqq f146694i;

    static {
        bsqu bsqu = new bsqu();
        f146684j = bsqu;
        GeneratedMessageLite.m124024a(bsqu.class, bsqu);
    }

    private bsqu() {
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
            return GeneratedMessageLite.m124022a(f146684j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဉ\u0007\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bဈ\u0005", new Object[]{"a", "b", bsqt.f146683a, "c", "d", "i", "e", "f", "h", "g"});
        } else if (i2 == 3) {
            return new bsqu();
        } else {
            if (i2 == 4) {
                return new bxvd(f146684j);
            }
            if (i2 == 5) {
                return f146684j;
            }
            bxxk bxxk = f146685k;
            if (bxxk == null) {
                synchronized (bsqu.class) {
                    bxxk = f146685k;
                    if (bxxk == null) {
                        bxxk = new bxve(f146684j);
                        f146685k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
