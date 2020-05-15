package p000;

/* renamed from: ciny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciny extends bxvk implements bxxd {

    /* renamed from: f */
    public static final ciny f191008f;

    /* renamed from: g */
    private static volatile bxxk f191009g;

    /* renamed from: a */
    public int f191010a;

    /* renamed from: b */
    public String f191011b = "";

    /* renamed from: c */
    public long f191012c;

    /* renamed from: d */
    public long f191013d;

    /* renamed from: e */
    public long f191014e;

    static {
        ciny ciny = new ciny();
        f191008f = ciny;
        bxvk.m124024a(ciny.class, ciny);
    }

    private ciny() {
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
            return bxvk.m124022a(f191008f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new ciny();
        } else {
            if (i2 == 4) {
                return new bxvd(f191008f);
            }
            if (i2 == 5) {
                return f191008f;
            }
            bxxk bxxk = f191009g;
            if (bxxk == null) {
                synchronized (ciny.class) {
                    bxxk = f191009g;
                    if (bxxk == null) {
                        bxxk = new bxve(f191008f);
                        f191009g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
