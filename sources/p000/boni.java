package p000;

/* renamed from: boni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boni extends bxvk implements bxxd {

    /* renamed from: g */
    public static final boni f133807g;

    /* renamed from: h */
    private static volatile bxxk f133808h;

    /* renamed from: a */
    public int f133809a;

    /* renamed from: b */
    public String f133810b = "";

    /* renamed from: c */
    public String f133811c = "";

    /* renamed from: d */
    public long f133812d;

    /* renamed from: e */
    public int f133813e;

    /* renamed from: f */
    public bonn f133814f;

    static {
        boni boni = new boni();
        f133807g = boni;
        bxvk.m124024a(boni.class, boni);
    }

    private boni() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f133807g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004င\u0003\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new boni();
        } else {
            if (i2 == 4) {
                return new bxvd(f133807g);
            }
            if (i2 == 5) {
                return f133807g;
            }
            bxxk bxxk = f133808h;
            if (bxxk == null) {
                synchronized (boni.class) {
                    bxxk = f133808h;
                    if (bxxk == null) {
                        bxxk = new bxve(f133807g);
                        f133808h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
