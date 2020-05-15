package p000;

/* renamed from: dip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dip extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final dip f13254e;

    /* renamed from: f */
    private static volatile bxxk f13255f;

    /* renamed from: a */
    public int f13256a;

    /* renamed from: b */
    public int f13257b;

    /* renamed from: c */
    public int f13258c;

    /* renamed from: d */
    public int f13259d;

    static {
        dip dip = new dip();
        f13254e = dip;
        GeneratedMessageLite.m124024a(dip.class, dip);
    }

    private dip() {
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
            return GeneratedMessageLite.m124022a(f13254e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new dip();
        } else {
            if (i2 == 4) {
                return new bxvd(f13254e);
            }
            if (i2 == 5) {
                return f13254e;
            }
            bxxk bxxk = f13255f;
            if (bxxk == null) {
                synchronized (dip.class) {
                    bxxk = f13255f;
                    if (bxxk == null) {
                        bxxk = new bxve(f13254e);
                        f13255f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
