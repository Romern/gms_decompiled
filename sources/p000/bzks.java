package p000;

/* renamed from: bzks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzks extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzks f170469e;

    /* renamed from: f */
    private static volatile bxxk f170470f;

    /* renamed from: a */
    public int f170471a;

    /* renamed from: b */
    public bzkq f170472b;

    /* renamed from: c */
    public bzkp f170473c;

    /* renamed from: d */
    public String f170474d = "";

    static {
        bzks bzks = new bzks();
        f170469e = bzks;
        bxvk.m124024a(bzks.class, bzks);
    }

    private bzks() {
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
            return bxvk.m124022a(f170469e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzks();
        } else {
            if (i2 == 4) {
                return new bxvd(f170469e);
            }
            if (i2 == 5) {
                return f170469e;
            }
            bxxk bxxk = f170470f;
            if (bxxk == null) {
                synchronized (bzks.class) {
                    bxxk = f170470f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170469e);
                        f170470f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
