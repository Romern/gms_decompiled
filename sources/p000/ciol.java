package p000;

/* renamed from: ciol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciol extends bxvk implements bxxd {

    /* renamed from: e */
    public static final ciol f191077e;

    /* renamed from: f */
    private static volatile bxxk f191078f;

    /* renamed from: a */
    public int f191079a;

    /* renamed from: b */
    public String f191080b = "";

    /* renamed from: c */
    public bxvw f191081c = bxwq.f165002b;

    /* renamed from: d */
    public long f191082d;

    static {
        ciol ciol = new ciol();
        f191077e = ciol;
        bxvk.m124024a(ciol.class, ciol);
    }

    private ciol() {
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
            return bxvk.m124022a(f191077e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003(", new Object[]{"a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new ciol();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f191077e;
            }
            bxxk bxxk = f191078f;
            if (bxxk == null) {
                synchronized (ciol.class) {
                    bxxk = f191078f;
                    if (bxxk == null) {
                        bxxk = new bxve(f191077e);
                        f191078f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
