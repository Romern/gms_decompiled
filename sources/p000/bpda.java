package p000;

/* renamed from: bpda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpda extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpda f135899d;

    /* renamed from: e */
    private static volatile bxxk f135900e;

    /* renamed from: a */
    public int f135901a;

    /* renamed from: b */
    public long f135902b;

    /* renamed from: c */
    public bpcz f135903c;

    static {
        bpda bpda = new bpda();
        f135899d = bpda;
        bxvk.m124024a(bpda.class, bpda);
    }

    private bpda() {
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
            return bxvk.m124022a(f135899d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpda();
        } else {
            if (i2 == 4) {
                return new bxvd(f135899d);
            }
            if (i2 == 5) {
                return f135899d;
            }
            bxxk bxxk = f135900e;
            if (bxxk == null) {
                synchronized (bpda.class) {
                    bxxk = f135900e;
                    if (bxxk == null) {
                        bxxk = new bxve(f135899d);
                        f135900e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
