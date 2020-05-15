package p000;

/* renamed from: bywp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywp extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bywp f168633h;

    /* renamed from: i */
    private static volatile bxxk f168634i;

    /* renamed from: a */
    public int f168635a;

    /* renamed from: b */
    public int f168636b;

    /* renamed from: c */
    public int f168637c;

    /* renamed from: d */
    public long f168638d;

    /* renamed from: e */
    public byxf f168639e;

    /* renamed from: f */
    public byxh f168640f;

    /* renamed from: g */
    public bxvw f168641g = bxwq.f165002b;

    static {
        bywp bywp = new bywp();
        f168633h = bywp;
        bxvk.m124024a(bywp.class, bywp);
    }

    private bywp() {
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
            return bxvk.m124022a(f168633h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006\u0014", new Object[]{"a", "b", bywo.f168632a, "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bywp();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f168633h;
            }
            bxxk bxxk = f168634i;
            if (bxxk == null) {
                synchronized (bywp.class) {
                    bxxk = f168634i;
                    if (bxxk == null) {
                        bxxk = new bxve(f168633h);
                        f168634i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
