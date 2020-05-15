package p000;

/* renamed from: bvli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvli extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bvli f156540f;

    /* renamed from: g */
    private static volatile bxxk f156541g;

    /* renamed from: a */
    public int f156542a;

    /* renamed from: b */
    public bvov f156543b;

    /* renamed from: c */
    public bxwc f156544c = bxxn.f165040b;

    /* renamed from: d */
    public bvme f156545d;

    /* renamed from: e */
    public int f156546e;

    static {
        bvli bvli = new bvli();
        f156540f = bvli;
        GeneratedMessageLite.m124024a(bvli.class, bvli);
    }

    private bvli() {
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
            return GeneratedMessageLite.m124022a(f156540f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001a\u0003ဉ\u0001\u0004င\u0002", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bvli();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f156540f;
            }
            bxxk bxxk = f156541g;
            if (bxxk == null) {
                synchronized (bvli.class) {
                    bxxk = f156541g;
                    if (bxxk == null) {
                        bxxk = new bxve(f156540f);
                        f156541g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
