package p000;

/* renamed from: bwtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwtj extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwtj f160961f;

    /* renamed from: g */
    private static volatile bxxk f160962g;

    /* renamed from: a */
    public int f160963a;

    /* renamed from: b */
    public int f160964b = 0;

    /* renamed from: c */
    public Object f160965c;

    /* renamed from: d */
    public String f160966d = "";

    /* renamed from: e */
    public int f160967e;

    static {
        bwtj bwtj = new bwtj();
        f160961f = bwtj;
        GeneratedMessageLite.m124024a(bwtj.class, bwtj);
    }

    private bwtj() {
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
            return GeneratedMessageLite.m124022a(f160961f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"c", "b", "a", "d", "e", bwth.f160960a, bwtn.class, bwtm.class});
        } else if (i2 == 3) {
            return new bwtj();
        } else {
            if (i2 == 4) {
                return new bxvd(f160961f);
            }
            if (i2 == 5) {
                return f160961f;
            }
            bxxk bxxk = f160962g;
            if (bxxk == null) {
                synchronized (bwtj.class) {
                    bxxk = f160962g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160961f);
                        f160962g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
