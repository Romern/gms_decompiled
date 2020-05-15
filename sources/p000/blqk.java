package p000;

/* renamed from: blqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqk extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blqk f127353e;

    /* renamed from: g */
    private static volatile bxxk f127354g;

    /* renamed from: a */
    public int f127355a;

    /* renamed from: b */
    public bxwc f127356b = bxxn.f165040b;

    /* renamed from: c */
    public blpl f127357c;

    /* renamed from: d */
    public long f127358d;

    /* renamed from: f */
    private byte f127359f = 2;

    static {
        blqk blqk = new blqk();
        f127353e = blqk;
        bxvk.m124024a(blqk.class, blqk);
    }

    private blqk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127359f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127359f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127353e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001Л\u0003ဃ\u0002\u0004ဉ\u0001", new Object[]{"a", "b", blrj.class, "d", "c"});
        } else if (i2 == 3) {
            return new blqk();
        } else {
            if (i2 == 4) {
                return new bxvd(f127353e);
            }
            if (i2 == 5) {
                return f127353e;
            }
            bxxk bxxk = f127354g;
            if (bxxk == null) {
                synchronized (blqk.class) {
                    bxxk = f127354g;
                    if (bxxk == null) {
                        bxxk = new bxve(f127353e);
                        f127354g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
