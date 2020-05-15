package p000;

/* renamed from: byur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byur extends bxvk implements bxxd {

    /* renamed from: i */
    public static final byur f168351i;

    /* renamed from: k */
    private static volatile bxxk f168352k;

    /* renamed from: a */
    public int f168353a;

    /* renamed from: b */
    public int f168354b;

    /* renamed from: c */
    public byuy f168355c;

    /* renamed from: d */
    public byvb f168356d;

    /* renamed from: e */
    public byvg f168357e;

    /* renamed from: f */
    public byve f168358f;

    /* renamed from: g */
    public byvj f168359g;

    /* renamed from: h */
    public byvl f168360h;

    /* renamed from: j */
    private byte f168361j = 2;

    static {
        byur byur = new byur();
        f168351i = byur;
        bxvk.m124024a(byur.class, byur);
    }

    private byur() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168361j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168361j = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f168351i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ᐉ\u0006", new Object[]{"a", "b", byuq.m125365b(), "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new byur();
        } else {
            if (i2 == 4) {
                return new bxvd(f168351i);
            }
            if (i2 == 5) {
                return f168351i;
            }
            bxxk bxxk = f168352k;
            if (bxxk == null) {
                synchronized (byur.class) {
                    bxxk = f168352k;
                    if (bxxk == null) {
                        bxxk = new bxve(f168351i);
                        f168352k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
