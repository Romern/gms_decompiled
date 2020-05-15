package p000;

/* renamed from: brbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbk extends bxvk implements bxxd {

    /* renamed from: e */
    public static final brbk f142272e;

    /* renamed from: g */
    private static volatile bxxk f142273g;

    /* renamed from: a */
    public int f142274a;

    /* renamed from: b */
    public brak f142275b;

    /* renamed from: c */
    public bxwc f142276c = bxxn.f165040b;

    /* renamed from: d */
    public bxtx f142277d = bxtx.f164797b;

    /* renamed from: f */
    private byte f142278f = 2;

    static {
        brbk brbk = new brbk();
        f142272e = brbk;
        bxvk.m124024a(brbk.class, brbk);
    }

    private brbk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f142278f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f142278f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f142272e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001", new Object[]{"a", "b", "c", brdk.class, "d"});
        } else if (i2 == 3) {
            return new brbk();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f142272e;
            }
            bxxk bxxk = f142273g;
            if (bxxk == null) {
                synchronized (brbk.class) {
                    bxxk = f142273g;
                    if (bxxk == null) {
                        bxxk = new bxve(f142272e);
                        f142273g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
