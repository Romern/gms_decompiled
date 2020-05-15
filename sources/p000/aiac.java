package p000;

/* renamed from: aiac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiac extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final aiac f68544k;

    /* renamed from: l */
    private static volatile bxxk f68545l;

    /* renamed from: a */
    public int f68546a;

    /* renamed from: b */
    public String f68547b = "";

    /* renamed from: c */
    public int f68548c;

    /* renamed from: d */
    public String f68549d = "";

    /* renamed from: e */
    public int f68550e;

    /* renamed from: f */
    public int f68551f;

    /* renamed from: g */
    public String f68552g = "";

    /* renamed from: h */
    public int f68553h;

    /* renamed from: i */
    public long f68554i;

    /* renamed from: j */
    public long f68555j;

    static {
        aiac aiac = new aiac();
        f68544k = aiac;
        GeneratedMessageLite.m124024a(aiac.class, aiac);
    }

    private aiac() {
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
            return GeneratedMessageLite.m124022a(f68544k, "\u0001\t\u0000\u0001\u0001\u000f\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0004ဈ\u0002\nင\u0003\u000bင\u0004\fဈ\u0005\rင\u0006\u000eဂ\u0007\u000fဂ\b", new Object[]{"a", "b", "c", bzbk.m125616b(), "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new aiac();
        } else {
            if (i2 == 4) {
                return new bxvd(f68544k);
            }
            if (i2 == 5) {
                return f68544k;
            }
            bxxk bxxk = f68545l;
            if (bxxk == null) {
                synchronized (aiac.class) {
                    bxxk = f68545l;
                    if (bxxk == null) {
                        bxxk = new bxve(f68544k);
                        f68545l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
