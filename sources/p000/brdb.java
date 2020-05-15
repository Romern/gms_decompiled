package p000;

/* renamed from: brdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brdb extends bxvk implements bxxd {

    /* renamed from: f */
    public static final brdb f142468f;

    /* renamed from: g */
    private static volatile bxxk f142469g;

    /* renamed from: a */
    public int f142470a;

    /* renamed from: b */
    public brak f142471b;

    /* renamed from: c */
    public boolean f142472c;

    /* renamed from: d */
    public boolean f142473d;

    /* renamed from: e */
    public boolean f142474e;

    static {
        brdb brdb = new brdb();
        f142468f = brdb;
        bxvk.m124024a(brdb.class, brdb);
    }

    private brdb() {
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
            return bxvk.m124022a(f142468f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new brdb();
        } else {
            if (i2 == 4) {
                return new bxvd(f142468f);
            }
            if (i2 == 5) {
                return f142468f;
            }
            bxxk bxxk = f142469g;
            if (bxxk == null) {
                synchronized (brdb.class) {
                    bxxk = f142469g;
                    if (bxxk == null) {
                        bxxk = new bxve(f142468f);
                        f142469g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
