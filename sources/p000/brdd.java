package p000;

/* renamed from: brdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brdd extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final brdd f142487e;

    /* renamed from: f */
    private static volatile bxxk f142488f;

    /* renamed from: a */
    public int f142489a;

    /* renamed from: b */
    public brak f142490b;

    /* renamed from: c */
    public int f142491c;

    /* renamed from: d */
    public String f142492d = "";

    static {
        brdd brdd = new brdd();
        f142487e = brdd;
        GeneratedMessageLite.m124024a(brdd.class, brdd);
    }

    private brdd() {
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
            return GeneratedMessageLite.m124022a(f142487e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", brcj.f142386a, "d"});
        } else if (i2 == 3) {
            return new brdd();
        } else {
            if (i2 == 4) {
                return new bxvd(f142487e);
            }
            if (i2 == 5) {
                return f142487e;
            }
            bxxk bxxk = f142488f;
            if (bxxk == null) {
                synchronized (brdd.class) {
                    bxxk = f142488f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142487e);
                        f142488f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
