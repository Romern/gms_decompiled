package p000;

/* renamed from: bwpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpe extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwpe f160526c;

    /* renamed from: d */
    public static final bxvj f160527d;

    /* renamed from: f */
    private static volatile bxxk f160528f;

    /* renamed from: a */
    public int f160529a;

    /* renamed from: b */
    public bwxl f160530b;

    /* renamed from: e */
    private byte f160531e = 2;

    static {
        bwpe bwpe = new bwpe();
        f160526c = bwpe;
        bxvk.m124024a(bwpe.class, bwpe);
        bwxl bwxl = bwxl.f161383i;
        bwpe bwpe2 = f160526c;
        f160527d = bxvk.m124006a(bwxl, bwpe2, bwpe2, 264434503, bxzf.MESSAGE);
    }

    private bwpe() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160531e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160531e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160526c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwpe();
        } else {
            if (i2 == 4) {
                return new bxvd(f160526c);
            }
            if (i2 == 5) {
                return f160526c;
            }
            bxxk bxxk = f160528f;
            if (bxxk == null) {
                synchronized (bwpe.class) {
                    bxxk = f160528f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160526c);
                        f160528f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
