package p000;

/* renamed from: cakx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cakx extends bxvk implements bxxd {

    /* renamed from: f */
    public static final cakx f175077f;

    /* renamed from: g */
    private static volatile bxxk f175078g;

    /* renamed from: a */
    public int f175079a;

    /* renamed from: b */
    public int f175080b;

    /* renamed from: c */
    public long f175081c;

    /* renamed from: d */
    public long f175082d;

    /* renamed from: e */
    public int f175083e;

    static {
        cakx cakx = new cakx();
        f175077f = cakx;
        bxvk.m124024a(cakx.class, cakx);
    }

    private cakx() {
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
            return bxvk.m124022a(f175077f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", cale.f175117a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new cakx();
        } else {
            if (i2 == 4) {
                return new bxvd(f175077f);
            }
            if (i2 == 5) {
                return f175077f;
            }
            bxxk bxxk = f175078g;
            if (bxxk == null) {
                synchronized (cakx.class) {
                    bxxk = f175078g;
                    if (bxxk == null) {
                        bxxk = new bxve(f175077f);
                        f175078g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
