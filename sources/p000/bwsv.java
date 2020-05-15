package p000;

/* renamed from: bwsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwsv f160916d;

    /* renamed from: e */
    public static final bxvj f160917e;

    /* renamed from: g */
    private static volatile bxxk f160918g;

    /* renamed from: a */
    public int f160919a;

    /* renamed from: b */
    public bxwc f160920b = bxxn.f165040b;

    /* renamed from: c */
    public int f160921c;

    /* renamed from: f */
    private byte f160922f = 2;

    static {
        bwsv bwsv = new bwsv();
        f160916d = bwsv;
        bxvk.m124024a(bwsv.class, bwsv);
        bwxl bwxl = bwxl.f161383i;
        bwsv bwsv2 = f160916d;
        f160917e = bxvk.m124006a(bwxl, bwsv2, bwsv2, 214299793, bxzf.MESSAGE);
    }

    private bwsv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160922f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160922f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160916d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဌ\u0000", new Object[]{"a", "b", bwxl.class, "c", bwst.f160915a});
        } else if (i2 == 3) {
            return new bwsv();
        } else {
            if (i2 == 4) {
                return new bwss();
            }
            if (i2 == 5) {
                return f160916d;
            }
            bxxk bxxk = f160918g;
            if (bxxk == null) {
                synchronized (bwsv.class) {
                    bxxk = f160918g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160916d);
                        f160918g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo73532a() {
        if (!this.f160920b.mo73666a()) {
            this.f160920b = bxvk.m124021a(this.f160920b);
        }
    }
}
