package p000;

/* renamed from: bkzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzi extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bkzi f125587l;

    /* renamed from: m */
    private static volatile bxxk f125588m;

    /* renamed from: a */
    public int f125589a;

    /* renamed from: b */
    public int f125590b;

    /* renamed from: c */
    public long f125591c;

    /* renamed from: d */
    public int f125592d;

    /* renamed from: e */
    public int f125593e;

    /* renamed from: f */
    public int f125594f;

    /* renamed from: g */
    public long f125595g;

    /* renamed from: h */
    public int f125596h;

    /* renamed from: i */
    public int f125597i;

    /* renamed from: j */
    public int f125598j;

    /* renamed from: k */
    public int f125599k;

    static {
        bkzi bkzi = new bkzi();
        f125587l = bkzi;
        bxvk.m124024a(bkzi.class, bkzi);
    }

    private bkzi() {
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
            return bxvk.m124022a(f125587l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဌ\u0004\u0006ဃ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t", new Object[]{"a", "b", blav.f125799a, "c", "d", "e", "f", blau.f125798a, "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new bkzi();
        } else {
            if (i2 == 4) {
                return new bxvd(f125587l);
            }
            if (i2 == 5) {
                return f125587l;
            }
            bxxk bxxk = f125588m;
            if (bxxk == null) {
                synchronized (bkzi.class) {
                    bxxk = f125588m;
                    if (bxxk == null) {
                        bxxk = new bxve(f125587l);
                        f125588m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
