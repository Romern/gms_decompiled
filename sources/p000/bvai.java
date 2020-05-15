package p000;

/* renamed from: bvai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvai extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvai f155480d;

    /* renamed from: f */
    private static volatile bxxk f155481f;

    /* renamed from: a */
    public int f155482a;

    /* renamed from: b */
    public bvaa f155483b;

    /* renamed from: c */
    public bxwc f155484c = bxxn.f165040b;

    /* renamed from: e */
    private byte f155485e = 2;

    static {
        bvai bvai = new bvai();
        f155480d = bvai;
        GeneratedMessageLite.m124024a(bvai.class, bvai);
    }

    private bvai() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f155485e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f155485e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f155480d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"a", "b", "c", bvae.class});
        } else if (i2 == 3) {
            return new bvai();
        } else {
            if (i2 == 4) {
                return new bvah();
            }
            if (i2 == 5) {
                return f155480d;
            }
            bxxk bxxk = f155481f;
            if (bxxk == null) {
                synchronized (bvai.class) {
                    bxxk = f155481f;
                    if (bxxk == null) {
                        bxxk = new bxve(f155480d);
                        f155481f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
