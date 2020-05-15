package p000;

/* renamed from: bwja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwja extends bxvk implements bxxd {

    /* renamed from: m */
    public static final bwja f159714m;

    /* renamed from: o */
    private static volatile bxxk f159715o;

    /* renamed from: a */
    public int f159716a;

    /* renamed from: b */
    public String f159717b = "";

    /* renamed from: c */
    public bxwc f159718c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f159719d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f159720e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f159721f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f159722g = bxxn.f165040b;

    /* renamed from: h */
    public bwhu f159723h;

    /* renamed from: i */
    public bwhn f159724i;

    /* renamed from: j */
    public bmlz f159725j;

    /* renamed from: k */
    public bxwc f159726k = bxxn.f165040b;

    /* renamed from: l */
    public bmkw f159727l;

    /* renamed from: n */
    private byte f159728n = 2;

    static {
        bwja bwja = new bwja();
        f159714m = bwja;
        bxvk.m124024a(bwja.class, bwja);
    }

    private bwja() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159728n);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159728n = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f159714m, "\u0001\u000b\u0000\u0001\u0002\u0014\u000b\u0000\u0006\u0003\u0002\u001b\u0003\u001b\u0004\u001b\u0005Л\u0006ဉ\u0002\u0007ဉ\u0003\u000bЛ\rဉ\u0004\u0011ဈ\u0001\u0013\u001b\u0014ᐉ\u0005", new Object[]{"a", "c", bmlv.class, "e", bmep.class, "f", bmem.class, "g", bmfq.class, "h", "i", "d", bmeb.class, "j", "b", "k", bwhc.class, "l"});
        } else if (i2 == 3) {
            return new bwja();
        } else {
            if (i2 == 4) {
                return new bxvd(f159714m);
            }
            if (i2 == 5) {
                return f159714m;
            }
            bxxk bxxk = f159715o;
            if (bxxk == null) {
                synchronized (bwja.class) {
                    bxxk = f159715o;
                    if (bxxk == null) {
                        bxxk = new bxve(f159714m);
                        f159715o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
