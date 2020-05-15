package p000;

/* renamed from: bvxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvxf extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bvxf f158050g;

    /* renamed from: h */
    private static volatile bxxk f158051h;

    /* renamed from: a */
    public int f158052a;

    /* renamed from: b */
    public int f158053b;

    /* renamed from: c */
    public int f158054c;

    /* renamed from: d */
    public boolean f158055d;

    /* renamed from: e */
    public bvvv f158056e;

    /* renamed from: f */
    public bxwc f158057f = bxxn.f165040b;

    static {
        bvxf bvxf = new bvxf();
        f158050g = bvxf;
        GeneratedMessageLite.m124024a(bvxf.class, bvxf);
    }

    private bvxf() {
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
            return GeneratedMessageLite.m124022a(f158050g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u001b\u0005ဉ\u0003", new Object[]{"a", "b", bvxd.f158049a, "c", "d", "f", bvyq.class, "e"});
        } else if (i2 == 3) {
            return new bvxf();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f158050g;
            }
            bxxk bxxk = f158051h;
            if (bxxk == null) {
                synchronized (bvxf.class) {
                    bxxk = f158051h;
                    if (bxxk == null) {
                        bxxk = new bxve(f158050g);
                        f158051h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo73396a() {
        if (!this.f158057f.mo73666a()) {
            this.f158057f = GeneratedMessageLite.m124021a(this.f158057f);
        }
    }
}
