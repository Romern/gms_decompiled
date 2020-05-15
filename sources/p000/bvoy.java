package p000;

/* renamed from: bvoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvoy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvoy f157239c;

    /* renamed from: e */
    private static volatile bxxk f157240e;

    /* renamed from: a */
    public bxwc f157241a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f157242b = bxxn.f165040b;

    /* renamed from: d */
    private byte f157243d = 2;

    static {
        bvoy bvoy = new bvoy();
        f157239c = bvoy;
        bxvk.m124024a(bvoy.class, bvoy);
    }

    private bvoy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f157243d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f157243d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f157239c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001b\u0002Л", new Object[]{"a", bvnp.class, "b", bvoa.class});
        } else if (i2 == 3) {
            return new bvoy();
        } else {
            if (i2 == 4) {
                return new bxvd(f157239c);
            }
            if (i2 == 5) {
                return f157239c;
            }
            bxxk bxxk = f157240e;
            if (bxxk == null) {
                synchronized (bvoy.class) {
                    bxxk = f157240e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157239c);
                        f157240e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
