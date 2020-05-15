package p000;

/* renamed from: bugf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bugf extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bugf f153773g;

    /* renamed from: h */
    private static volatile bxxk f153774h;

    /* renamed from: a */
    public int f153775a;

    /* renamed from: b */
    public int f153776b;

    /* renamed from: c */
    public boolean f153777c;

    /* renamed from: d */
    public boolean f153778d;

    /* renamed from: e */
    public boolean f153779e;

    /* renamed from: f */
    public boolean f153780f;

    static {
        bugf bugf = new bugf();
        f153773g = bugf;
        GeneratedMessageLite.m124024a(bugf.class, bugf);
    }

    private bugf() {
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
            return GeneratedMessageLite.m124022a(f153773g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", buge.f153772a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bugf();
        } else {
            if (i2 == 4) {
                return new bxvd(f153773g);
            }
            if (i2 == 5) {
                return f153773g;
            }
            bxxk bxxk = f153774h;
            if (bxxk == null) {
                synchronized (bugf.class) {
                    bxxk = f153774h;
                    if (bxxk == null) {
                        bxxk = new bxve(f153773g);
                        f153774h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
