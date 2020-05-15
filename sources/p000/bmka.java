package p000;

/* renamed from: bmka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmka extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmka f129774e;

    /* renamed from: f */
    private static volatile bxxk f129775f;

    /* renamed from: a */
    public int f129776a;

    /* renamed from: b */
    public int f129777b = 0;

    /* renamed from: c */
    public Object f129778c;

    /* renamed from: d */
    public String f129779d = "";

    static {
        bmka bmka = new bmka();
        f129774e = bmka;
        GeneratedMessageLite.m124024a(bmka.class, bmka);
    }

    private bmka() {
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
            return GeneratedMessageLite.m124022a(f129774e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ျ\u0000", new Object[]{"c", "b", "a", "d"});
        } else if (i2 == 3) {
            return new bmka();
        } else {
            if (i2 == 4) {
                return new bxvd(f129774e);
            }
            if (i2 == 5) {
                return f129774e;
            }
            bxxk bxxk = f129775f;
            if (bxxk == null) {
                synchronized (bmka.class) {
                    bxxk = f129775f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129774e);
                        f129775f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
