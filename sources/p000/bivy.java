package p000;

/* renamed from: bivy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bivy f122059c;

    /* renamed from: f */
    private static volatile bxxk f122060f;

    /* renamed from: a */
    public int f122061a = 1;

    /* renamed from: b */
    public int f122062b;

    /* renamed from: d */
    private int f122063d;

    /* renamed from: e */
    private byte f122064e = 2;

    static {
        bivy bivy = new bivy();
        f122059c = bivy;
        bxvk.m124024a(bivy.class, bivy);
    }

    private bivy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f122064e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f122064e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f122059c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᔄ\u0001", new Object[]{"d", "a", bisf.m102782b(), "b"});
        } else if (i2 == 3) {
            return new bivy();
        } else {
            if (i2 == 4) {
                return new bxvd(f122059c);
            }
            if (i2 == 5) {
                return f122059c;
            }
            bxxk bxxk = f122060f;
            if (bxxk == null) {
                synchronized (bivy.class) {
                    bxxk = f122060f;
                    if (bxxk == null) {
                        bxxk = new bxve(f122059c);
                        f122060f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
