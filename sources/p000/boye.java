package p000;

/* renamed from: boye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boye extends bxvk implements bxxd {

    /* renamed from: m */
    public static final boye f135302m;

    /* renamed from: n */
    private static volatile bxxk f135303n;

    /* renamed from: a */
    public int f135304a;

    /* renamed from: b */
    public int f135305b;

    /* renamed from: c */
    public int f135306c;

    /* renamed from: d */
    public int f135307d;

    /* renamed from: e */
    public int f135308e;

    /* renamed from: f */
    public String f135309f = "";

    /* renamed from: g */
    public int f135310g;

    /* renamed from: h */
    public int f135311h;

    /* renamed from: i */
    public int f135312i;

    /* renamed from: j */
    public int f135313j;

    /* renamed from: k */
    public int f135314k;

    /* renamed from: l */
    public int f135315l;

    static {
        boye boye = new boye();
        f135302m = boye;
        bxvk.m124024a(boye.class, boye);
    }

    private boye() {
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
            return bxvk.m124022a(f135302m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007\tဌ\b\nဌ\t\u000bဌ\n", new Object[]{"a", "b", boyc.f135300a, "c", boya.f135298a, "d", boxw.f135294a, "e", boxv.f135293a, "f", "g", boxx.f135295a, "h", boxy.f135296a, "i", boxz.f135297a, "j", boyb.f135299a, "k", boxu.f135292a, "l", boyd.f135301a});
        } else if (i2 == 3) {
            return new boye();
        } else {
            if (i2 == 4) {
                return new bxvd(f135302m);
            }
            if (i2 == 5) {
                return f135302m;
            }
            bxxk bxxk = f135303n;
            if (bxxk == null) {
                synchronized (boye.class) {
                    bxxk = f135303n;
                    if (bxxk == null) {
                        bxxk = new bxve(f135302m);
                        f135303n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
