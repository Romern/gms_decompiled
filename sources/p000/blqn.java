package p000;

/* renamed from: blqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqn extends bxvk implements bxxd {

    /* renamed from: g */
    public static final blqn f127372g;

    /* renamed from: i */
    private static volatile bxxk f127373i;

    /* renamed from: a */
    public int f127374a;

    /* renamed from: b */
    public blrk f127375b;

    /* renamed from: c */
    public blox f127376c;

    /* renamed from: d */
    public blou f127377d;

    /* renamed from: e */
    public blot f127378e;

    /* renamed from: f */
    public blrj f127379f;

    /* renamed from: h */
    private byte f127380h = 2;

    static {
        blqn blqn = new blqn();
        f127372g = blqn;
        bxvk.m124024a(blqn.class, blqn);
    }

    private blqn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127380h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127380h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127372g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new blqn();
        } else {
            if (i2 == 4) {
                return new bxvd(f127372g);
            }
            if (i2 == 5) {
                return f127372g;
            }
            bxxk bxxk = f127373i;
            if (bxxk == null) {
                synchronized (blqn.class) {
                    bxxk = f127373i;
                    if (bxxk == null) {
                        bxxk = new bxve(f127372g);
                        f127373i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
