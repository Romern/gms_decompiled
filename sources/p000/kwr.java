package p000;

/* renamed from: kwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final kwr f25318d;

    /* renamed from: e */
    private static volatile bxxk f25319e;

    /* renamed from: a */
    public bxwc f25320a = bxxn.f165040b;

    /* renamed from: b */
    public String f25321b = "";

    /* renamed from: c */
    public int f25322c;

    static {
        kwr kwr = new kwr();
        f25318d = kwr;
        bxvk.m124024a(kwr.class, kwr);
    }

    private kwr() {
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
            return bxvk.m124022a(f25318d, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0001\u0000\u0001\u001b\u0004Ȉ\u0005\u0004", new Object[]{"a", kwj.class, "b", "c"});
        } else if (i2 == 3) {
            return new kwr();
        } else {
            if (i2 == 4) {
                return new bxvd(f25318d);
            }
            if (i2 == 5) {
                return f25318d;
            }
            bxxk bxxk = f25319e;
            if (bxxk == null) {
                synchronized (kwr.class) {
                    bxxk = f25319e;
                    if (bxxk == null) {
                        bxxk = new bxve(f25318d);
                        f25319e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
