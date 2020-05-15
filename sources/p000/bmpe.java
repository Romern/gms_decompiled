package p000;

/* renamed from: bmpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmpe extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bmpe f130279k;

    /* renamed from: l */
    private static volatile bxxk f130280l;

    /* renamed from: a */
    public int f130281a;

    /* renamed from: b */
    public int f130282b;

    /* renamed from: c */
    public blxc f130283c;

    /* renamed from: d */
    public blxc f130284d;

    /* renamed from: e */
    public blxc f130285e;

    /* renamed from: f */
    public boolean f130286f;

    /* renamed from: g */
    public long f130287g;

    /* renamed from: h */
    public int f130288h;

    /* renamed from: i */
    public String f130289i = "";

    /* renamed from: j */
    public String f130290j = "";

    static {
        bmpe bmpe = new bmpe();
        f130279k = bmpe;
        GeneratedMessageLite.m124024a(bmpe.class, bmpe);
    }

    private bmpe() {
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
            return GeneratedMessageLite.m124022a(f130279k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဇ\u0004\u0006ဈ\u0007\tဈ\b\nဂ\u0005\u000bဌ\u0006", new Object[]{"a", "b", bmpc.f130278a, "c", "d", "e", "f", "i", "j", "g", "h", bmpa.f130277a});
        } else if (i2 == 3) {
            return new bmpe();
        } else {
            if (i2 == 4) {
                return new bxvd(f130279k);
            }
            if (i2 == 5) {
                return f130279k;
            }
            bxxk bxxk = f130280l;
            if (bxxk == null) {
                synchronized (bmpe.class) {
                    bxxk = f130280l;
                    if (bxxk == null) {
                        bxxk = new bxve(f130279k);
                        f130280l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
