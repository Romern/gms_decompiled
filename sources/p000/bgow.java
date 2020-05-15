package p000;

/* renamed from: bgow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgow extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final bgow f116967m;

    /* renamed from: n */
    private static volatile bxxk f116968n;

    /* renamed from: a */
    public double f116969a;

    /* renamed from: b */
    public double f116970b;

    /* renamed from: c */
    public double f116971c;

    /* renamed from: d */
    public float f116972d;

    /* renamed from: e */
    public float f116973e;

    /* renamed from: f */
    public float f116974f;

    /* renamed from: g */
    public float f116975g;

    /* renamed from: h */
    public float f116976h;

    /* renamed from: i */
    public float f116977i;

    /* renamed from: j */
    public long f116978j;

    /* renamed from: k */
    public long f116979k;

    /* renamed from: l */
    public double f116980l;

    static {
        bgow bgow = new bgow();
        f116967m = bgow;
        GeneratedMessageLite.m124024a(bgow.class, bgow);
    }

    private bgow() {
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
            return GeneratedMessageLite.m124022a(f116967m, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0002\u000b\u0002\f\u0000", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new bgow();
        } else {
            if (i2 == 4) {
                return new bxvd(f116967m);
            }
            if (i2 == 5) {
                return f116967m;
            }
            bxxk bxxk = f116968n;
            if (bxxk == null) {
                synchronized (bgow.class) {
                    bxxk = f116968n;
                    if (bxxk == null) {
                        bxxk = new bxve(f116967m);
                        f116968n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
