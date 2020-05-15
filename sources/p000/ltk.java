package p000;

/* renamed from: ltk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ltk extends bxvk implements bxxd {

    /* renamed from: j */
    public static final ltk f32947j;

    /* renamed from: l */
    private static volatile bxxk f32948l;

    /* renamed from: a */
    public int f32949a;

    /* renamed from: b */
    public String f32950b = "";

    /* renamed from: c */
    public long f32951c;

    /* renamed from: d */
    public bxwc f32952d = bxxn.f165040b;

    /* renamed from: e */
    public String f32953e = "";

    /* renamed from: f */
    public int f32954f;

    /* renamed from: g */
    public bxwc f32955g = bxxn.f165040b;

    /* renamed from: h */
    public lss f32956h;

    /* renamed from: i */
    public int f32957i;

    /* renamed from: k */
    private byte f32958k = 2;

    static {
        ltk ltk = new ltk();
        f32947j = ltk;
        bxvk.m124024a(ltk.class, ltk);
    }

    private ltk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f32958k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f32958k = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f32947j, "\u0001\b\u0000\u0001\u0003 \b\u0000\u0002\u0003\u0003ᔈ\u0000\u0004Л\u0005ᔌ\u0004\u0006\u001a\fဃ\u0001\u0012ဈ\u0002\u001eဉ\u0005 ဌ\u0006", new Object[]{"a", "b", "d", ltr.class, "f", lto.f32970a, "g", "c", "e", "h", "i", lsq.f32850a});
        } else if (i2 == 3) {
            return new ltk();
        } else {
            if (i2 == 4) {
                return new bxvd(f32947j);
            }
            if (i2 == 5) {
                return f32947j;
            }
            bxxk bxxk = f32948l;
            if (bxxk == null) {
                synchronized (ltk.class) {
                    bxxk = f32948l;
                    if (bxxk == null) {
                        bxxk = new bxve(f32947j);
                        f32948l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
