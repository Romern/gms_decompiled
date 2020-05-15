package p000;

/* renamed from: bxpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpg extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bxpg f164258g;

    /* renamed from: i */
    private static volatile bxxk f164259i;

    /* renamed from: a */
    public int f164260a;

    /* renamed from: b */
    public bxpo f164261b;

    /* renamed from: c */
    public bxtx f164262c = bxtx.f164797b;

    /* renamed from: d */
    public bxwc f164263d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f164264e = bxxn.f165040b;

    /* renamed from: f */
    public int f164265f;

    /* renamed from: h */
    private byte f164266h = 2;

    static {
        bxpg bxpg = new bxpg();
        f164258g = bxpg;
        bxvk.m124024a(bxpg.class, bxpg);
    }

    private bxpg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f164266h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f164266h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f164258g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0001\u0001ᐉ\u0000\u0002ည\u0001\u0003\u001c\u0004\u001b\u0006ဌ\u0002", new Object[]{"a", "b", "c", "d", "e", bxpf.class, "f", bxqc.m122976b()});
        } else if (i2 == 3) {
            return new bxpg();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f164258g;
            }
            bxxk bxxk = f164259i;
            if (bxxk == null) {
                synchronized (bxpg.class) {
                    bxxk = f164259i;
                    if (bxxk == null) {
                        bxxk = new bxve(f164258g);
                        f164259i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
