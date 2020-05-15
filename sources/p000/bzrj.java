package p000;

/* renamed from: bzrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzrj extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bzrj f171142j;

    /* renamed from: k */
    private static volatile bxxk f171143k;

    /* renamed from: a */
    public int f171144a;

    /* renamed from: b */
    public String f171145b = "";

    /* renamed from: c */
    public String f171146c = "";

    /* renamed from: d */
    public String f171147d = "";

    /* renamed from: e */
    public String f171148e = "";

    /* renamed from: f */
    public int f171149f;

    /* renamed from: g */
    public bzoy f171150g;

    /* renamed from: h */
    public bzri f171151h;

    /* renamed from: i */
    public bzrh f171152i;

    static {
        bzrj bzrj = new bzrj();
        f171142j = bzrj;
        GeneratedMessageLite.m124024a(bzrj.class, bzrj);
    }

    private bzrj() {
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
            return GeneratedMessageLite.m124022a(f171142j, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0000\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဌ\u0005\u0006ဉ\u0007\bဉ\t\tဉ\n\u000bဈ\u0001", new Object[]{"a", "c", "d", "e", "f", bzpt.f170960a, "g", "h", "i", "b"});
        } else if (i2 == 3) {
            return new bzrj();
        } else {
            if (i2 == 4) {
                return new bxvd(f171142j);
            }
            if (i2 == 5) {
                return f171142j;
            }
            bxxk bxxk = f171143k;
            if (bxxk == null) {
                synchronized (bzrj.class) {
                    bxxk = f171143k;
                    if (bxxk == null) {
                        bxxk = new bxve(f171142j);
                        f171143k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
