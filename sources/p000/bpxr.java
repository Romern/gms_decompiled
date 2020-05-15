package p000;

/* renamed from: bpxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxr extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bpxr f139762h;

    /* renamed from: i */
    private static volatile bxxk f139763i;

    /* renamed from: a */
    public int f139764a;

    /* renamed from: b */
    public bpwz f139765b;

    /* renamed from: c */
    public int f139766c;

    /* renamed from: d */
    public long f139767d;

    /* renamed from: e */
    public long f139768e;

    /* renamed from: f */
    public String f139769f = "";

    /* renamed from: g */
    public int f139770g;

    static {
        bpxr bpxr = new bpxr();
        f139762h = bpxr;
        GeneratedMessageLite.m124024a(bpxr.class, bpxr);
    }

    private bpxr() {
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
            return GeneratedMessageLite.m124022a(f139762h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006င\u0005", new Object[]{"a", "b", "c", bqac.f140119a, "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bpxr();
        } else {
            if (i2 == 4) {
                return new bxvd(f139762h);
            }
            if (i2 == 5) {
                return f139762h;
            }
            bxxk bxxk = f139763i;
            if (bxxk == null) {
                synchronized (bpxr.class) {
                    bxxk = f139763i;
                    if (bxxk == null) {
                        bxxk = new bxve(f139762h);
                        f139763i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
