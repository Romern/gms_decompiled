package p000;

/* renamed from: bmjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmjt extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bxvu f129731j = new bmjm();

    /* renamed from: k */
    public static final bmjt f129732k;

    /* renamed from: l */
    private static volatile bxxk f129733l;

    /* renamed from: a */
    public int f129734a;

    /* renamed from: b */
    public long f129735b;

    /* renamed from: c */
    public int f129736c;

    /* renamed from: d */
    public bmnr f129737d;

    /* renamed from: e */
    public String f129738e = "";

    /* renamed from: f */
    public bmnr f129739f;

    /* renamed from: g */
    public bmno f129740g;

    /* renamed from: h */
    public int f129741h;

    /* renamed from: i */
    public bxvt f129742i = bxvm.f164965b;

    static {
        bmjt bmjt = new bmjt();
        f129732k = bmjt;
        GeneratedMessageLite.m124024a(bmjt.class, bmjt);
    }

    private bmjt() {
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
            return GeneratedMessageLite.m124022a(f129732k, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဈ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဌ\u0006\u0007\u001e\bဉ\u0002", new Object[]{"a", "b", "c", bmjp.f129729a, "e", "f", "g", "h", bmjr.f129730a, "i", bmjo.m108094b(), "d"});
        } else if (i2 == 3) {
            return new bmjt();
        } else {
            if (i2 == 4) {
                return new bxvd(f129732k);
            }
            if (i2 == 5) {
                return f129732k;
            }
            bxxk bxxk = f129733l;
            if (bxxk == null) {
                synchronized (bmjt.class) {
                    bxxk = f129733l;
                    if (bxxk == null) {
                        bxxk = new bxve(f129732k);
                        f129733l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
