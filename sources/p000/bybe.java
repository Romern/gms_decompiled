package p000;

/* renamed from: bybe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybe extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bybe f165475j;

    /* renamed from: k */
    private static volatile bxxk f165476k;

    /* renamed from: a */
    public int f165477a;

    /* renamed from: b */
    public int f165478b;

    /* renamed from: c */
    public boolean f165479c;

    /* renamed from: d */
    public int f165480d;

    /* renamed from: e */
    public int f165481e;

    /* renamed from: f */
    public long f165482f;

    /* renamed from: g */
    public String f165483g = "";

    /* renamed from: h */
    public String f165484h = "";

    /* renamed from: i */
    public int f165485i;

    static {
        bybe bybe = new bybe();
        f165475j = bybe;
        GeneratedMessageLite.m124024a(bybe.class, bybe);
    }

    private bybe() {
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
            return GeneratedMessageLite.m124022a(f165475j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\tင\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bybe();
        } else {
            if (i2 == 4) {
                return new bxvd(f165475j);
            }
            if (i2 == 5) {
                return f165475j;
            }
            bxxk bxxk = f165476k;
            if (bxxk == null) {
                synchronized (bybe.class) {
                    bxxk = f165476k;
                    if (bxxk == null) {
                        bxxk = new bxve(f165475j);
                        f165476k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
