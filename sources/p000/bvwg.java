package p000;

/* renamed from: bvwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvwg extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bvwg f157917l;

    /* renamed from: m */
    private static volatile bxxk f157918m;

    /* renamed from: a */
    public int f157919a;

    /* renamed from: b */
    public boolean f157920b = true;

    /* renamed from: c */
    public boolean f157921c = true;

    /* renamed from: d */
    public boolean f157922d = true;

    /* renamed from: e */
    public boolean f157923e;

    /* renamed from: f */
    public boolean f157924f = true;

    /* renamed from: g */
    public int f157925g;

    /* renamed from: h */
    public boolean f157926h;

    /* renamed from: i */
    public boolean f157927i;

    /* renamed from: j */
    public boolean f157928j;

    /* renamed from: k */
    public int f157929k;

    static {
        bvwg bvwg = new bvwg();
        f157917l = bvwg;
        GeneratedMessageLite.m124024a(bvwg.class, bvwg);
    }

    private bvwg() {
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
            return GeneratedMessageLite.m124022a(f157917l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဌ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nင\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", bvwe.f157916a, "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new bvwg();
        } else {
            if (i2 == 4) {
                return new bxvd(f157917l);
            }
            if (i2 == 5) {
                return f157917l;
            }
            bxxk bxxk = f157918m;
            if (bxxk == null) {
                synchronized (bvwg.class) {
                    bxxk = f157918m;
                    if (bxxk == null) {
                        bxxk = new bxve(f157917l);
                        f157918m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
