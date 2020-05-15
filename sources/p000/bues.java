package p000;

/* renamed from: bues */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bues extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bues f153631l;

    /* renamed from: m */
    private static volatile bxxk f153632m;

    /* renamed from: a */
    public int f153633a;

    /* renamed from: b */
    public int f153634b;

    /* renamed from: c */
    public int f153635c;

    /* renamed from: d */
    public int f153636d;

    /* renamed from: e */
    public int f153637e;

    /* renamed from: f */
    public int f153638f;

    /* renamed from: g */
    public int f153639g;

    /* renamed from: h */
    public int f153640h;

    /* renamed from: i */
    public int f153641i;

    /* renamed from: j */
    public int f153642j;

    /* renamed from: k */
    public bufe f153643k;

    static {
        bues bues = new bues();
        f153631l = bues;
        GeneratedMessageLite.m124024a(bues.class, bues);
    }

    private bues() {
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
            return GeneratedMessageLite.m124022a(f153631l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဏ\u0000\u0002ဏ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tင\b\nဉ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new bues();
        } else {
            if (i2 == 4) {
                return new bxvd(f153631l);
            }
            if (i2 == 5) {
                return f153631l;
            }
            bxxk bxxk = f153632m;
            if (bxxk == null) {
                synchronized (bues.class) {
                    bxxk = f153632m;
                    if (bxxk == null) {
                        bxxk = new bxve(f153631l);
                        f153632m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
