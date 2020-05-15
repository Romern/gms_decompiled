package p000;

/* renamed from: caca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caca extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final caca f172499e;

    /* renamed from: f */
    private static volatile bxxk f172500f;

    /* renamed from: a */
    public int f172501a;

    /* renamed from: b */
    public int f172502b = 0;

    /* renamed from: c */
    public Object f172503c;

    /* renamed from: d */
    public String f172504d = "";

    static {
        caca caca = new caca();
        f172499e = caca;
        GeneratedMessageLite.m124024a(caca.class, caca);
    }

    private caca() {
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
            return GeneratedMessageLite.m124022a(f172499e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ျ\u0000", new Object[]{"c", "b", "a", "d", cabz.class, cabz.class});
        } else if (i2 == 3) {
            return new caca();
        } else {
            if (i2 == 4) {
                return new bxvd(f172499e);
            }
            if (i2 == 5) {
                return f172499e;
            }
            bxxk bxxk = f172500f;
            if (bxxk == null) {
                synchronized (caca.class) {
                    bxxk = f172500f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172499e);
                        f172500f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
