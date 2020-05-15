package p000;

/* renamed from: bbih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbih extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bbih f102715l;

    /* renamed from: m */
    private static volatile bxxk f102716m;

    /* renamed from: a */
    public int f102717a;

    /* renamed from: b */
    public int f102718b;

    /* renamed from: c */
    public long f102719c;

    /* renamed from: d */
    public long f102720d;

    /* renamed from: e */
    public long f102721e;

    /* renamed from: f */
    public int f102722f;

    /* renamed from: g */
    public int f102723g;

    /* renamed from: h */
    public boolean f102724h;

    /* renamed from: i */
    public bxwc f102725i = bxxn.f165040b;

    /* renamed from: j */
    public int f102726j;

    /* renamed from: k */
    public int f102727k;

    static {
        bbih bbih = new bbih();
        f102715l = bbih;
        GeneratedMessageLite.m124024a(bbih.class, bbih);
    }

    private bbih() {
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
            return GeneratedMessageLite.m124022a(f102715l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0000\u0001ဌ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006င\u0004\u0007င\u0005\bဇ\u0006\t\u001b\nဌ\u0007\u000bင\b", new Object[]{"a", "b", bbif.f102709a, "c", "d", "e", "f", "g", "h", "i", bbig.class, "j", bbji.f102769a, "k"});
        } else if (i2 == 3) {
            return new bbih();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f102715l;
            }
            bxxk bxxk = f102716m;
            if (bxxk == null) {
                synchronized (bbih.class) {
                    bxxk = f102716m;
                    if (bxxk == null) {
                        bxxk = new bxve(f102715l);
                        f102716m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
