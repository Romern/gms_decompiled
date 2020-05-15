package p000;

/* renamed from: bium */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bium extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bium f121815e;

    /* renamed from: g */
    private static volatile bxxk f121816g;

    /* renamed from: a */
    public int f121817a;

    /* renamed from: b */
    public int f121818b;

    /* renamed from: c */
    public boolean f121819c;

    /* renamed from: d */
    public boolean f121820d;

    /* renamed from: f */
    private byte f121821f = 2;

    static {
        bium bium = new bium();
        f121815e = bium;
        GeneratedMessageLite.m124024a(bium.class, bium);
    }

    private bium() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121821f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121821f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121815e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔇ\u0001\u0003ᔇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bium();
        } else {
            if (i2 == 4) {
                return new bxvd(f121815e);
            }
            if (i2 == 5) {
                return f121815e;
            }
            bxxk bxxk = f121816g;
            if (bxxk == null) {
                synchronized (bium.class) {
                    bxxk = f121816g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121815e);
                        f121816g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
