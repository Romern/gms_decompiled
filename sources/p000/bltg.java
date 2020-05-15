package p000;

/* renamed from: bltg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bltg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bltg f127693b;

    /* renamed from: d */
    private static volatile bxxk f127694d;

    /* renamed from: a */
    public blti f127695a;

    /* renamed from: c */
    private int f127696c;

    static {
        bltg bltg = new bltg();
        f127693b = bltg;
        bxvk.m124024a(bltg.class, bltg);
    }

    private bltg() {
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
            return bxvk.m124022a(f127693b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bltg();
        } else {
            if (i2 == 4) {
                return new bxvd(f127693b);
            }
            if (i2 == 5) {
                return f127693b;
            }
            bxxk bxxk = f127694d;
            if (bxxk == null) {
                synchronized (bltg.class) {
                    bxxk = f127694d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127693b);
                        f127694d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
