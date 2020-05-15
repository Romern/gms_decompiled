package p000;

/* renamed from: aapl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapl extends bxvk implements bxxd {

    /* renamed from: l */
    public static final aapl f28790l;

    /* renamed from: m */
    private static volatile bxxk f28791m;

    /* renamed from: a */
    public int f28792a;

    /* renamed from: b */
    public aapm f28793b;

    /* renamed from: c */
    public boolean f28794c;

    /* renamed from: d */
    public boolean f28795d;

    /* renamed from: e */
    public boolean f28796e;

    /* renamed from: f */
    public aapa f28797f;

    /* renamed from: g */
    public aapp f28798g;

    /* renamed from: h */
    public aaos f28799h;

    /* renamed from: i */
    public aapj f28800i;

    /* renamed from: j */
    public long f28801j;

    /* renamed from: k */
    public long f28802k;

    static {
        aapl aapl = new aapl();
        f28790l = aapl;
        bxvk.m124024a(aapl.class, aapl);
    }

    private aapl() {
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
            return bxvk.m124022a(f28790l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\nဂ\t\u000bဂ\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new aapl();
        } else {
            if (i2 == 4) {
                return new bxvd(f28790l);
            }
            if (i2 == 5) {
                return f28790l;
            }
            bxxk bxxk = f28791m;
            if (bxxk == null) {
                synchronized (aapl.class) {
                    bxxk = f28791m;
                    if (bxxk == null) {
                        bxxk = new bxve(f28790l);
                        f28791m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
