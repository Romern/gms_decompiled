package p000;

/* renamed from: bpwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwm extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpwm f139527d;

    /* renamed from: f */
    private static volatile bxxk f139528f;

    /* renamed from: a */
    public int f139529a;

    /* renamed from: b */
    public bpwl f139530b;

    /* renamed from: c */
    public bxwc f139531c = bxxn.f165040b;

    /* renamed from: e */
    private byte f139532e = 2;

    static {
        bpwm bpwm = new bpwm();
        f139527d = bpwm;
        GeneratedMessageLite.m124024a(bpwm.class, bpwm);
    }

    private bpwm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f139532e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f139532e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f139527d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᔉ\u0000\u0002Л", new Object[]{"a", "b", "c", bpwl.class});
        } else if (i2 == 3) {
            return new bpwm();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f139527d;
            }
            bxxk bxxk = f139528f;
            if (bxxk == null) {
                synchronized (bpwm.class) {
                    bxxk = f139528f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139527d);
                        f139528f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
