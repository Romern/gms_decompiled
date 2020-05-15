package p000;

/* renamed from: bivr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivr extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bivr f122036e;

    /* renamed from: g */
    private static volatile bxxk f122037g;

    /* renamed from: a */
    public int f122038a;

    /* renamed from: b */
    public bxwc f122039b = bxxn.f165040b;

    /* renamed from: c */
    public int f122040c;

    /* renamed from: d */
    public int f122041d;

    /* renamed from: f */
    private byte f122042f = 2;

    static {
        bivr bivr = new bivr();
        f122036e = bivr;
        GeneratedMessageLite.m124024a(bivr.class, bivr);
    }

    private bivr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f122042f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f122042f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f122036e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဋ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", bivq.class, "c", "d", bitr.f121702a});
        } else if (i2 == 3) {
            return new bivr();
        } else {
            if (i2 == 4) {
                return new bxvd(f122036e);
            }
            if (i2 == 5) {
                return f122036e;
            }
            bxxk bxxk = f122037g;
            if (bxxk == null) {
                synchronized (bivr.class) {
                    bxxk = f122037g;
                    if (bxxk == null) {
                        bxxk = new bxve(f122036e);
                        f122037g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
