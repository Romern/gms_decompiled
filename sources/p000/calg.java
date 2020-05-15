package p000;

/* renamed from: calg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class calg extends bxvk implements bxxd {

    /* renamed from: j */
    public static final calg f175118j;

    /* renamed from: k */
    private static volatile bxxk f175119k;

    /* renamed from: a */
    public int f175120a;

    /* renamed from: b */
    public int f175121b;

    /* renamed from: c */
    public cald f175122c;

    /* renamed from: d */
    public cakv f175123d;

    /* renamed from: e */
    public cakt f175124e;

    /* renamed from: f */
    public cakt f175125f;

    /* renamed from: g */
    public cakt f175126g;

    /* renamed from: h */
    public cakt f175127h;

    /* renamed from: i */
    public cala f175128i;

    static {
        calg calg = new calg();
        f175118j = calg;
        bxvk.m124024a(calg.class, calg);
    }

    private calg() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f175118j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\nဉ\t", new Object[]{"a", "b", cale.f175117a, "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new calg();
        } else {
            if (i2 == 4) {
                return new bxvd(f175118j);
            }
            if (i2 == 5) {
                return f175118j;
            }
            bxxk bxxk = f175119k;
            if (bxxk == null) {
                synchronized (calg.class) {
                    bxxk = f175119k;
                    if (bxxk == null) {
                        bxxk = new bxve(f175118j);
                        f175119k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
