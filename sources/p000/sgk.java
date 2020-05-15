package p000;

/* renamed from: sgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sgk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final sgk f44409d;

    /* renamed from: e */
    private static volatile bxxk f44410e;

    /* renamed from: a */
    public bxwc f44411a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f44412b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f44413c = bxxn.f165040b;

    static {
        sgk sgk = new sgk();
        f44409d = sgk;
        GeneratedMessageLite.m124024a(sgk.class, sgk);
    }

    private sgk() {
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
            return GeneratedMessageLite.m124022a(f44409d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001Ț\u0002Ț\u0003\u001b", new Object[]{"a", "b", "c", sgg.class});
        } else if (i2 == 3) {
            return new sgk();
        } else {
            if (i2 == 4) {
                return new bxvd(f44409d);
            }
            if (i2 == 5) {
                return f44409d;
            }
            bxxk bxxk = f44410e;
            if (bxxk == null) {
                synchronized (sgk.class) {
                    bxxk = f44410e;
                    if (bxxk == null) {
                        bxxk = new bxve(f44409d);
                        f44410e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
