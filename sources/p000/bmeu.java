package p000;

/* renamed from: bmeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmeu extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmeu f129030f;

    /* renamed from: g */
    private static volatile bxxk f129031g;

    /* renamed from: a */
    public int f129032a;

    /* renamed from: b */
    public bxtx f129033b = bxtx.f164797b;

    /* renamed from: c */
    public String f129034c = "";

    /* renamed from: d */
    public long f129035d;

    /* renamed from: e */
    public bxtx f129036e = bxtx.f164797b;

    static {
        bmeu bmeu = new bmeu();
        f129030f = bmeu;
        bxvk.m124024a(bmeu.class, bmeu);
    }

    private bmeu() {
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
            return bxvk.m124022a(f129030f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ည\u0000\u0003ဈ\u0001\u0004ဂ\u0002\u0005ည\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bmeu();
        } else {
            if (i2 == 4) {
                return new bxvd(f129030f);
            }
            if (i2 == 5) {
                return f129030f;
            }
            bxxk bxxk = f129031g;
            if (bxxk == null) {
                synchronized (bmeu.class) {
                    bxxk = f129031g;
                    if (bxxk == null) {
                        bxxk = new bxve(f129030f);
                        f129031g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
