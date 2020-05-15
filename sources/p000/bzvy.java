package p000;

/* renamed from: bzvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzvy extends GeneratedMessageLite implements bxxd {

    /* renamed from: n */
    public static final bzvy f171573n;

    /* renamed from: o */
    private static volatile bxxk f171574o;

    /* renamed from: a */
    public int f171575a;

    /* renamed from: b */
    public String f171576b = "";

    /* renamed from: c */
    public String f171577c = "";

    /* renamed from: d */
    public String f171578d = "";

    /* renamed from: e */
    public int f171579e = 1;

    /* renamed from: f */
    public String f171580f = "";

    /* renamed from: g */
    public int f171581g;

    /* renamed from: h */
    public String f171582h = "";

    /* renamed from: i */
    public long f171583i;

    /* renamed from: j */
    public long f171584j;

    /* renamed from: k */
    public String f171585k = "";

    /* renamed from: l */
    public String f171586l;

    /* renamed from: m */
    public boolean f171587m;

    static {
        bzvy bzvy = new bzvy();
        f171573n = bzvy;
        GeneratedMessageLite.m124024a(bzvy.class, bzvy);
    }

    private bzvy() {
        bxxn bxxn = bxxn.f165040b;
        this.f171586l = "";
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
            return GeneratedMessageLite.m124022a(f171573n, "\u0001\f\u0000\u0001\u0005\u0014\f\u0000\u0000\u0000\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\nဈ\n\u000bင\u000b\fဈ\f\u000eဂ\u000e\u000fဂ\u000f\u0010ဈ\u0010\u0012ဈ\u0011\u0013ဇ\u0012\u0014ဌ\b", new Object[]{"a", "b", "c", "d", "f", "g", "h", "i", "j", "k", "l", "m", "e", bzvv.f171561a});
        } else if (i2 == 3) {
            return new bzvy();
        } else {
            if (i2 == 4) {
                return new bxvd(f171573n);
            }
            if (i2 == 5) {
                return f171573n;
            }
            bxxk bxxk = f171574o;
            if (bxxk == null) {
                synchronized (bzvy.class) {
                    bxxk = f171574o;
                    if (bxxk == null) {
                        bxxk = new bxve(f171573n);
                        f171574o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
