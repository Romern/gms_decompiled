package p000;

/* renamed from: btsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsv extends bxvk implements bxxd {

    /* renamed from: k */
    public static final btsv f150281k;

    /* renamed from: m */
    private static volatile bxxk f150282m;

    /* renamed from: a */
    public int f150283a;

    /* renamed from: b */
    public String f150284b = "";

    /* renamed from: c */
    public btrw f150285c;

    /* renamed from: d */
    public btsf f150286d;

    /* renamed from: e */
    public btsi f150287e;

    /* renamed from: f */
    public btsb f150288f;

    /* renamed from: g */
    public String f150289g = "";

    /* renamed from: h */
    public bxvt f150290h = bxvm.f164965b;

    /* renamed from: i */
    public btsg f150291i;

    /* renamed from: j */
    public btrt f150292j;

    /* renamed from: l */
    private byte f150293l = 2;

    static {
        btsv btsv = new btsv();
        f150281k = btsv;
        bxvk.m124024a(btsv.class, btsv);
    }

    private btsv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f150293l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f150293l = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f150281k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007\u001e\bဉ\u0006\u000bဉ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", btrr.m117076b(), "i", "j"});
        } else if (i2 == 3) {
            return new btsv();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f150281k;
            }
            bxxk bxxk = f150282m;
            if (bxxk == null) {
                synchronized (btsv.class) {
                    bxxk = f150282m;
                    if (bxxk == null) {
                        bxxk = new bxve(f150281k);
                        f150282m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
