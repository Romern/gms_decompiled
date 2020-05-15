package p000;

/* renamed from: caid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caid extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final caid f174626g;

    /* renamed from: h */
    private static volatile bxxk f174627h;

    /* renamed from: a */
    public int f174628a;

    /* renamed from: b */
    public String f174629b = "";

    /* renamed from: c */
    public int f174630c;

    /* renamed from: d */
    public int f174631d;

    /* renamed from: e */
    public long f174632e;

    /* renamed from: f */
    public bxwc f174633f;

    static {
        caid caid = new caid();
        f174626g = caid;
        GeneratedMessageLite.m124024a(caid.class, caid);
    }

    private caid() {
        bxxn bxxn = bxxn.f165040b;
        this.f174633f = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f174626g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဂ\u0003\u0006\u001b", new Object[]{"a", "b", "c", caic.f174625a, "d", "e", "f", cahr.class});
        } else if (i2 == 3) {
            return new caid();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f174626g;
            }
            bxxk bxxk = f174627h;
            if (bxxk == null) {
                synchronized (caid.class) {
                    bxxk = f174627h;
                    if (bxxk == null) {
                        bxxk = new bxve(f174626g);
                        f174627h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
