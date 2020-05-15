package p000;

/* renamed from: cbkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkj extends bxvk implements bxxd {

    /* renamed from: k */
    public static final cbkj f177405k;

    /* renamed from: l */
    private static volatile bxxk f177406l;

    /* renamed from: a */
    public int f177407a = 0;

    /* renamed from: b */
    public Object f177408b;

    /* renamed from: c */
    public String f177409c = "";

    /* renamed from: d */
    public int f177410d;

    /* renamed from: e */
    public bxtx f177411e = bxtx.f164797b;

    /* renamed from: f */
    public long f177412f;

    /* renamed from: g */
    public cbma f177413g;

    /* renamed from: h */
    public cbma f177414h;

    /* renamed from: i */
    public cbma f177415i;

    /* renamed from: j */
    public int f177416j;

    static {
        cbkj cbkj = new cbkj();
        f177405k = cbkj;
        bxvk.m124024a(cbkj.class, cbkj);
    }

    private cbkj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f177405k, "\u0000\u0010\u0001\u0000\u0001l\u0010\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0002\u0005\f\b\t\t\t\n\t\f\nd<\u0000e<\u0000f<\u0000g<\u0000h<\u0000j<\u0000k<\u0000l<\u0000", new Object[]{"b", "a", "c", "d", "f", "j", "g", "h", "i", "e", cbjj.class, cbbn.class, cblr.class, cbjm.class, cbkg.class, cblu.class, cbmh.class, cbmp.class});
        } else if (i2 == 3) {
            return new cbkj();
        } else {
            if (i2 == 4) {
                return new bxvd(f177405k);
            }
            if (i2 == 5) {
                return f177405k;
            }
            bxxk bxxk = f177406l;
            if (bxxk == null) {
                synchronized (cbkj.class) {
                    bxxk = f177406l;
                    if (bxxk == null) {
                        bxxk = new bxve(f177405k);
                        f177406l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
