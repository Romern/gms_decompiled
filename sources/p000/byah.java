package p000;

/* renamed from: byah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byah extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final byah f165256g;

    /* renamed from: h */
    private static volatile bxxk f165257h;

    /* renamed from: a */
    public int f165258a;

    /* renamed from: b */
    public long f165259b;

    /* renamed from: c */
    public bwki f165260c;

    /* renamed from: d */
    public byag f165261d;

    /* renamed from: e */
    public byaf f165262e;

    /* renamed from: f */
    public bxwc f165263f = bxxn.f165040b;

    static {
        byah byah = new byah();
        f165256g = byah;
        GeneratedMessageLite.m124024a(byah.class, byah);
    }

    private byah() {
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
            return GeneratedMessageLite.m124022a(f165256g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", bmcv.class});
        } else if (i2 == 3) {
            return new byah();
        } else {
            if (i2 == 4) {
                return new byae();
            }
            if (i2 == 5) {
                return f165256g;
            }
            bxxk bxxk = f165257h;
            if (bxxk == null) {
                synchronized (byah.class) {
                    bxxk = f165257h;
                    if (bxxk == null) {
                        bxxk = new bxve(f165256g);
                        f165257h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
