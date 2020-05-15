package p000;

/* renamed from: bfyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfyf extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bfyf f115676l;

    /* renamed from: m */
    private static volatile bxxk f115677m;

    /* renamed from: a */
    public int f115678a;

    /* renamed from: b */
    public bfye f115679b;

    /* renamed from: c */
    public String f115680c = "";

    /* renamed from: d */
    public int f115681d;

    /* renamed from: e */
    public int f115682e;

    /* renamed from: f */
    public long f115683f;

    /* renamed from: g */
    public boolean f115684g;

    /* renamed from: h */
    public boolean f115685h;

    /* renamed from: i */
    public int f115686i = -1;

    /* renamed from: j */
    public String f115687j = "";

    /* renamed from: k */
    public String f115688k = "";

    static {
        bfyf bfyf = new bfyf();
        f115676l = bfyf;
        GeneratedMessageLite.m124024a(bfyf.class, bfyf);
    }

    private bfyf() {
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
            return GeneratedMessageLite.m124022a(f115676l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဈ\b\nဈ\t", new Object[]{"a", "b", "c", "d", bfyg.f115689a, "e", bfyg.f115689a, "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new bfyf();
        } else {
            if (i2 == 4) {
                return new bxvd(f115676l);
            }
            if (i2 == 5) {
                return f115676l;
            }
            bxxk bxxk = f115677m;
            if (bxxk == null) {
                synchronized (bfyf.class) {
                    bxxk = f115677m;
                    if (bxxk == null) {
                        bxxk = new bxve(f115676l);
                        f115677m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
