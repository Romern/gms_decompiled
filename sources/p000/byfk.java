package p000;

/* renamed from: byfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byfk extends bxvk implements bxxd {

    /* renamed from: j */
    public static final byfk f166027j;

    /* renamed from: k */
    private static volatile bxxk f166028k;

    /* renamed from: a */
    public int f166029a;

    /* renamed from: b */
    public int f166030b;

    /* renamed from: c */
    public int f166031c;

    /* renamed from: d */
    public int f166032d;

    /* renamed from: e */
    public int f166033e;

    /* renamed from: f */
    public int f166034f;

    /* renamed from: g */
    public int f166035g;

    /* renamed from: h */
    public int f166036h;

    /* renamed from: i */
    public int f166037i;

    static {
        byfk byfk = new byfk();
        f166027j = byfk;
        bxvk.m124024a(byfk.class, byfk);
    }

    private byfk() {
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
            return bxvk.m124022a(f166027j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"a", "b", byfj.f166026a, "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new byfk();
        } else {
            if (i2 == 4) {
                return new bxvd(f166027j);
            }
            if (i2 == 5) {
                return f166027j;
            }
            bxxk bxxk = f166028k;
            if (bxxk == null) {
                synchronized (byfk.class) {
                    bxxk = f166028k;
                    if (bxxk == null) {
                        bxxk = new bxve(f166027j);
                        f166028k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
