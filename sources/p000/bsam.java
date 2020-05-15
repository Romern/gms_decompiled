package p000;

/* renamed from: bsam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsam extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsam f143872d;

    /* renamed from: f */
    private static volatile bxxk f143873f;

    /* renamed from: a */
    public int f143874a;

    /* renamed from: b */
    public bxwc f143875b = bxxn.f165040b;

    /* renamed from: c */
    public bxtx f143876c = bxtx.f164797b;

    /* renamed from: e */
    private byte f143877e = 2;

    static {
        bsam bsam = new bsam();
        f143872d = bsam;
        bxvk.m124024a(bsam.class, bsam);
    }

    private bsam() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f143877e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f143877e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f143872d, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0001\u0001\u0001Л\u0005ည\u0000", new Object[]{"a", "b", bsan.class, "c"});
        } else if (i2 == 3) {
            return new bsam();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f143872d;
            }
            bxxk bxxk = f143873f;
            if (bxxk == null) {
                synchronized (bsam.class) {
                    bxxk = f143873f;
                    if (bxxk == null) {
                        bxxk = new bxve(f143872d);
                        f143873f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
