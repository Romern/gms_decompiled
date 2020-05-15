package p000;

/* renamed from: ayub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayub extends bxvk implements bxxd {

    /* renamed from: c */
    public static final ayub f98493c;

    /* renamed from: e */
    private static volatile bxxk f98494e;

    /* renamed from: a */
    public int f98495a = 0;

    /* renamed from: b */
    public Object f98496b;

    /* renamed from: d */
    private byte f98497d = 2;

    static {
        ayub ayub = new ayub();
        f98493c = ayub;
        bxvk.m124024a(ayub.class, ayub);
    }

    private ayub() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f98497d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f98497d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f98493c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000", new Object[]{"b", "a", dco.class, ayuf.class});
        } else if (i2 == 3) {
            return new ayub();
        } else {
            if (i2 == 4) {
                return new bxvd(f98493c);
            }
            if (i2 == 5) {
                return f98493c;
            }
            bxxk bxxk = f98494e;
            if (bxxk == null) {
                synchronized (ayub.class) {
                    bxxk = f98494e;
                    if (bxxk == null) {
                        bxxk = new bxve(f98493c);
                        f98494e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
