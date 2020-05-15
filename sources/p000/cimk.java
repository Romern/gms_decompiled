package p000;

/* renamed from: cimk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cimk extends bxvk implements bxxd {

    /* renamed from: k */
    public static final cimk f190730k;

    /* renamed from: m */
    private static volatile bxxk f190731m;

    /* renamed from: a */
    public int f190732a;

    /* renamed from: b */
    public int f190733b;

    /* renamed from: c */
    public long f190734c;

    /* renamed from: d */
    public String f190735d = "";

    /* renamed from: e */
    public String f190736e = "";

    /* renamed from: f */
    public cimz f190737f;

    /* renamed from: g */
    public int f190738g;

    /* renamed from: h */
    public long f190739h;

    /* renamed from: i */
    public cimv f190740i;

    /* renamed from: j */
    public long f190741j;

    /* renamed from: l */
    private byte f190742l = 2;

    static {
        cimk cimk = new cimk();
        f190730k = cimk;
        bxvk.m124024a(cimk.class, cimk);
    }

    private cimk() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f190742l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f190742l = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f190730k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဌ\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004", new Object[]{"a", "b", cimj.m150576b(), "g", cimj.m150576b(), "h", "i", "j", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new cimk();
        } else {
            if (i2 == 4) {
                return new bxvd(f190730k);
            }
            if (i2 == 5) {
                return f190730k;
            }
            bxxk bxxk = f190731m;
            if (bxxk == null) {
                synchronized (cimk.class) {
                    bxxk = f190731m;
                    if (bxxk == null) {
                        bxxk = new bxve(f190730k);
                        f190731m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
