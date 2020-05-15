package p000;

/* renamed from: kdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kdd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final kdd f23851d;

    /* renamed from: f */
    private static volatile bxxk f23852f;

    /* renamed from: a */
    public bxwc f23853a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f23854b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f23855c = bxxn.f165040b;

    /* renamed from: e */
    private byte f23856e = 2;

    static {
        kdd kdd = new kdd();
        f23851d = kdd;
        bxvk.m124024a(kdd.class, kdd);
    }

    private kdd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f23856e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f23856e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f23851d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0001\u0001\u001b\u0002\u001b\u0003Л", new Object[]{"a", kde.class, "b", kcy.class, "c", kcq.class});
        } else if (i2 == 3) {
            return new kdd();
        } else {
            if (i2 == 4) {
                return new bxvd(f23851d);
            }
            if (i2 == 5) {
                return f23851d;
            }
            bxxk bxxk = f23852f;
            if (bxxk == null) {
                synchronized (kdd.class) {
                    bxxk = f23852f;
                    if (bxxk == null) {
                        bxxk = new bxve(f23851d);
                        f23852f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
