package p000;

/* renamed from: bkyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkyt extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bkyt f125495l;

    /* renamed from: m */
    private static volatile bxxk f125496m;

    /* renamed from: a */
    public int f125497a;

    /* renamed from: b */
    public int f125498b;

    /* renamed from: c */
    public boolean f125499c;

    /* renamed from: d */
    public boolean f125500d;

    /* renamed from: e */
    public boolean f125501e;

    /* renamed from: f */
    public bxvt f125502f = bxvm.f164965b;

    /* renamed from: g */
    public int f125503g;

    /* renamed from: h */
    public int f125504h;

    /* renamed from: i */
    public int f125505i;

    /* renamed from: j */
    public int f125506j;

    /* renamed from: k */
    public int f125507k;

    static {
        bkyt bkyt = new bkyt();
        f125495l = bkyt;
        bxvk.m124024a(bkyt.class, bkyt);
    }

    private bkyt() {
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
            return bxvk.m124022a(f125495l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005\u001e\u0006ဋ\u0004\u0007ဋ\u0005\bဋ\u0006\tဋ\u0007\nဋ\b", new Object[]{"a", "b", bkyk.f125463a, "c", "d", "e", "f", blbd.m106971b(), "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new bkyt();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f125495l;
            }
            bxxk bxxk = f125496m;
            if (bxxk == null) {
                synchronized (bkyt.class) {
                    bxxk = f125496m;
                    if (bxxk == null) {
                        bxxk = new bxve(f125495l);
                        f125496m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
