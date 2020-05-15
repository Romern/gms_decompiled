package p000;

/* renamed from: bojq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bojq extends bxvk implements bxxd {

    /* renamed from: m */
    public static final bojq f133321m;

    /* renamed from: n */
    private static volatile bxxk f133322n;

    /* renamed from: a */
    public int f133323a;

    /* renamed from: b */
    public bosx f133324b;

    /* renamed from: c */
    public long f133325c;

    /* renamed from: d */
    public int f133326d;

    /* renamed from: e */
    public bojp f133327e;

    /* renamed from: f */
    public String f133328f = "";

    /* renamed from: g */
    public int f133329g;

    /* renamed from: h */
    public int f133330h;

    /* renamed from: i */
    public int f133331i;

    /* renamed from: j */
    public bojp f133332j;

    /* renamed from: k */
    public int f133333k;

    /* renamed from: l */
    public String f133334l = "";

    static {
        bojq bojq = new bojq();
        f133321m = bojq;
        bxvk.m124024a(bojq.class, bojq);
    }

    private bojq() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f133321m, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0000\u0000\u0001ဂ\u0002\u0004င\u0005\u0005ဉ\u0006\u0006ဈ\u0007\u0007င\b\bင\t\tင\n\nဉ\u000b\u000bဉ\u0000\rင\r\u000eဈ\u000e", new Object[]{"a", "c", "d", "e", "f", "g", "h", "i", "j", "b", "k", "l"});
        } else if (i2 == 3) {
            return new bojq();
        } else {
            if (i2 == 4) {
                return new bxvd(f133321m);
            }
            if (i2 == 5) {
                return f133321m;
            }
            bxxk bxxk = f133322n;
            if (bxxk == null) {
                synchronized (bojq.class) {
                    bxxk = f133322n;
                    if (bxxk == null) {
                        bxxk = new bxve(f133321m);
                        f133322n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
