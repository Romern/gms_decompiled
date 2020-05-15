package p000;

/* renamed from: cajz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cajz extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final cajz f174899k;

    /* renamed from: l */
    private static volatile bxxk f174900l;

    /* renamed from: a */
    public int f174901a;

    /* renamed from: b */
    public int f174902b;

    /* renamed from: c */
    public int f174903c;

    /* renamed from: d */
    public int f174904d;

    /* renamed from: e */
    public int f174905e;

    /* renamed from: f */
    public int f174906f;

    /* renamed from: g */
    public int f174907g;

    /* renamed from: h */
    public int f174908h;

    /* renamed from: i */
    public int f174909i;

    /* renamed from: j */
    public int f174910j;

    static {
        cajz cajz = new cajz();
        f174899k = cajz;
        GeneratedMessageLite.m124024a(cajz.class, cajz);
    }

    private cajz() {
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
            return GeneratedMessageLite.m124022a(f174899k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new cajz();
        } else {
            if (i2 == 4) {
                return new bxvd(f174899k);
            }
            if (i2 == 5) {
                return f174899k;
            }
            bxxk bxxk = f174900l;
            if (bxxk == null) {
                synchronized (cajz.class) {
                    bxxk = f174900l;
                    if (bxxk == null) {
                        bxxk = new bxve(f174899k);
                        f174900l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
