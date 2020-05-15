package p000;

/* renamed from: bofn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bofn extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bofn f132923f;

    /* renamed from: g */
    private static volatile bxxk f132924g;

    /* renamed from: a */
    public int f132925a;

    /* renamed from: b */
    public int f132926b;

    /* renamed from: c */
    public boolean f132927c;

    /* renamed from: d */
    public int f132928d;

    /* renamed from: e */
    public int f132929e;

    static {
        bofn bofn = new bofn();
        f132923f = bofn;
        GeneratedMessageLite.m124024a(bofn.class, bofn);
    }

    private bofn() {
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
            return GeneratedMessageLite.m124022a(f132923f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", bofl.f132921a, "c", "d", bofm.f132922a, "e", bode.f132674a});
        } else if (i2 == 3) {
            return new bofn();
        } else {
            if (i2 == 4) {
                return new bxvd(f132923f);
            }
            if (i2 == 5) {
                return f132923f;
            }
            bxxk bxxk = f132924g;
            if (bxxk == null) {
                synchronized (bofn.class) {
                    bxxk = f132924g;
                    if (bxxk == null) {
                        bxxk = new bxve(f132923f);
                        f132924g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
