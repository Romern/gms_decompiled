package p000;

/* renamed from: byar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byar extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final byar f165307l;

    /* renamed from: m */
    private static volatile bxxk f165308m;

    /* renamed from: a */
    public int f165309a;

    /* renamed from: b */
    public String f165310b = "";

    /* renamed from: c */
    public String f165311c = "";

    /* renamed from: d */
    public int f165312d;

    /* renamed from: e */
    public int f165313e;

    /* renamed from: f */
    public int f165314f;

    /* renamed from: g */
    public long f165315g;

    /* renamed from: h */
    public long f165316h;

    /* renamed from: i */
    public int f165317i;

    /* renamed from: j */
    public int f165318j;

    /* renamed from: k */
    public String f165319k = "";

    static {
        byar byar = new byar();
        f165307l = byar;
        GeneratedMessageLite.m124024a(byar.class, byar);
    }

    private byar() {
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
            return GeneratedMessageLite.m124022a(f165307l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bင\u0007\tင\b\nဈ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new byar();
        } else {
            if (i2 == 4) {
                return new bxvd(f165307l);
            }
            if (i2 == 5) {
                return f165307l;
            }
            bxxk bxxk = f165308m;
            if (bxxk == null) {
                synchronized (byar.class) {
                    bxxk = f165308m;
                    if (bxxk == null) {
                        bxxk = new bxve(f165307l);
                        f165308m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
