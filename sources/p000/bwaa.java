package p000;

/* renamed from: bwaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwaa extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bwaa f158601a;

    /* renamed from: d */
    private static volatile bxxk f158602d;

    /* renamed from: b */
    private bpwm f158603b;

    /* renamed from: c */
    private byte f158604c = 2;

    static {
        bwaa bwaa = new bwaa();
        f158601a = bwaa;
        bxvk.m124024a(bwaa.class, bwaa);
    }

    private bwaa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f158604c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f158604c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f158601a, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0001\u0006Љ", new Object[]{"b"});
        } else if (i2 == 3) {
            return new bwaa();
        } else {
            if (i2 == 4) {
                return new bxvd(f158601a);
            }
            if (i2 == 5) {
                return f158601a;
            }
            bxxk bxxk = f158602d;
            if (bxxk == null) {
                synchronized (bwaa.class) {
                    bxxk = f158602d;
                    if (bxxk == null) {
                        bxxk = new bxve(f158601a);
                        f158602d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
