package p000;

/* renamed from: byrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byrm extends bxvk implements bxxd {

    /* renamed from: f */
    public static final byrm f167498f;

    /* renamed from: h */
    private static volatile bxxk f167499h;

    /* renamed from: a */
    public int f167500a;

    /* renamed from: b */
    public int f167501b;

    /* renamed from: c */
    public byrj f167502c;

    /* renamed from: d */
    public bxtx f167503d = bxtx.f164797b;

    /* renamed from: e */
    public bxtx f167504e = bxtx.f164797b;

    /* renamed from: g */
    private byte f167505g = 2;

    static {
        byrm byrm = new byrm();
        f167498f = byrm;
        bxvk.m124024a(byrm.class, byrm);
    }

    private byrm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f167505g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f167505g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f167498f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new byrm();
        } else {
            if (i2 == 4) {
                return new bxvd(f167498f);
            }
            if (i2 == 5) {
                return f167498f;
            }
            bxxk bxxk = f167499h;
            if (bxxk == null) {
                synchronized (byrm.class) {
                    bxxk = f167499h;
                    if (bxxk == null) {
                        bxxk = new bxve(f167498f);
                        f167499h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
