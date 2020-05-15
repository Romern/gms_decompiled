package p000;

/* renamed from: blpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpe extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blpe f127206c;

    /* renamed from: e */
    private static volatile bxxk f127207e;

    /* renamed from: a */
    public bxwc f127208a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f127209b = bxxn.f165040b;

    /* renamed from: d */
    private byte f127210d = 2;

    static {
        blpe blpe = new blpe();
        f127206c = blpe;
        bxvk.m124024a(blpe.class, blpe);
    }

    private blpe() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127210d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127210d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127206c, "\u0001\u0002\u0000\u0000\u0003\u0005\u0002\u0000\u0002\u0001\u0003Л\u0005\u001b", new Object[]{"a", blrj.class, "b", blox.class});
        } else if (i2 == 3) {
            return new blpe();
        } else {
            if (i2 == 4) {
                return new bxvd(f127206c);
            }
            if (i2 == 5) {
                return f127206c;
            }
            bxxk bxxk = f127207e;
            if (bxxk == null) {
                synchronized (blpe.class) {
                    bxxk = f127207e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127206c);
                        f127207e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
