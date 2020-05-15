package p000;

/* renamed from: vvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vvv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final vvv f50074d;

    /* renamed from: e */
    private static volatile bxxk f50075e;

    /* renamed from: a */
    public int f50076a;

    /* renamed from: b */
    public String f50077b = "";

    /* renamed from: c */
    public String f50078c = "";

    static {
        vvv vvv = new vvv();
        f50074d = vvv;
        GeneratedMessageLite.m124024a(vvv.class, vvv);
    }

    private vvv() {
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
            return GeneratedMessageLite.m124022a(f50074d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new vvv();
        } else {
            if (i2 == 4) {
                return new bxvd(f50074d);
            }
            if (i2 == 5) {
                return f50074d;
            }
            bxxk bxxk = f50075e;
            if (bxxk == null) {
                synchronized (vvv.class) {
                    bxxk = f50075e;
                    if (bxxk == null) {
                        bxxk = new bxve(f50074d);
                        f50075e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
