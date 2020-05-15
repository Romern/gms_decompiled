package p000;

/* renamed from: cbol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbol extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbol f177831d;

    /* renamed from: e */
    private static volatile bxxk f177832e;

    /* renamed from: a */
    public int f177833a;

    /* renamed from: b */
    public long f177834b;

    /* renamed from: c */
    public long f177835c;

    static {
        cbol cbol = new cbol();
        f177831d = cbol;
        GeneratedMessageLite.m124024a(cbol.class, cbol);
    }

    private cbol() {
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
            return GeneratedMessageLite.m124022a(f177831d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbol();
        } else {
            if (i2 == 4) {
                return new bxvd(f177831d);
            }
            if (i2 == 5) {
                return f177831d;
            }
            bxxk bxxk = f177832e;
            if (bxxk == null) {
                synchronized (cbol.class) {
                    bxxk = f177832e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177831d);
                        f177832e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
