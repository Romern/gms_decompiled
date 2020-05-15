package p000;

/* renamed from: bwsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsb extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bwsb f160826g;

    /* renamed from: h */
    private static volatile bxxk f160827h;

    /* renamed from: a */
    public int f160828a;

    /* renamed from: b */
    public String f160829b = "";

    /* renamed from: c */
    public String f160830c = "";

    /* renamed from: d */
    public bxwc f160831d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f160832e = bxxn.f165040b;

    /* renamed from: f */
    public bwsc f160833f;

    static {
        bwsb bwsb = new bwsb();
        f160826g = bwsb;
        GeneratedMessageLite.m124024a(bwsb.class, bwsb);
    }

    private bwsb() {
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
            return GeneratedMessageLite.m124022a(f160826g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004\u001b\u0005ဉ\u0002", new Object[]{"a", "b", "c", "d", "e", bwsh.class, "f"});
        } else if (i2 == 3) {
            return new bwsb();
        } else {
            if (i2 == 4) {
                return new bxvd(f160826g);
            }
            if (i2 == 5) {
                return f160826g;
            }
            bxxk bxxk = f160827h;
            if (bxxk == null) {
                synchronized (bwsb.class) {
                    bxxk = f160827h;
                    if (bxxk == null) {
                        bxxk = new bxve(f160826g);
                        f160827h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
