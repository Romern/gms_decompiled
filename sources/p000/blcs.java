package p000;

/* renamed from: blcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blcs extends bxvk implements bxxd {

    /* renamed from: l */
    public static final blcs f125974l;

    /* renamed from: m */
    private static volatile bxxk f125975m;

    /* renamed from: a */
    public int f125976a;

    /* renamed from: b */
    public blcw f125977b;

    /* renamed from: c */
    public blco f125978c;

    /* renamed from: d */
    public boolean f125979d;

    /* renamed from: e */
    public blda f125980e;

    /* renamed from: f */
    public bldb f125981f;

    /* renamed from: g */
    public blcy f125982g;

    /* renamed from: h */
    public long f125983h;

    /* renamed from: i */
    public blcm f125984i;

    /* renamed from: j */
    public long f125985j;

    /* renamed from: k */
    public bxte f125986k;

    static {
        blcs blcs = new blcs();
        f125974l = blcs;
        bxvk.m124024a(blcs.class, blcs);
    }

    private blcs() {
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
            return bxvk.m124022a(f125974l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဃ\u0006\bဉ\u0007\tဃ\b\nဉ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new blcs();
        } else {
            if (i2 == 4) {
                return new bxvd(f125974l);
            }
            if (i2 == 5) {
                return f125974l;
            }
            bxxk bxxk = f125975m;
            if (bxxk == null) {
                synchronized (blcs.class) {
                    bxxk = f125975m;
                    if (bxxk == null) {
                        bxxk = new bxve(f125974l);
                        f125975m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
