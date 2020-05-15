package p000;

/* renamed from: biwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biwm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final biwm f122109d;

    /* renamed from: e */
    private static volatile bxxk f122110e;

    /* renamed from: a */
    public int f122111a;

    /* renamed from: b */
    public int f122112b = 1;

    /* renamed from: c */
    public int f122113c;

    static {
        biwm biwm = new biwm();
        f122109d = biwm;
        bxvk.m124024a(biwm.class, biwm);
    }

    private biwm() {
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
            return bxvk.m124022a(f122109d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", biwh.f122102a, "c", biwk.f122108a});
        } else if (i2 == 3) {
            return new biwm();
        } else {
            if (i2 == 4) {
                return new bxvd(f122109d);
            }
            if (i2 == 5) {
                return f122109d;
            }
            bxxk bxxk = f122110e;
            if (bxxk == null) {
                synchronized (biwm.class) {
                    bxxk = f122110e;
                    if (bxxk == null) {
                        bxxk = new bxve(f122109d);
                        f122110e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
