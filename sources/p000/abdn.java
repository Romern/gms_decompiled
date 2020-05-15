package p000;

/* renamed from: abdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final abdn f57103e;

    /* renamed from: f */
    private static volatile bxxk f57104f;

    /* renamed from: a */
    public int f57105a;

    /* renamed from: b */
    public String f57106b = "";

    /* renamed from: c */
    public bxyl f57107c;

    /* renamed from: d */
    public abec f57108d;

    static {
        abdn abdn = new abdn();
        f57103e = abdn;
        bxvk.m124024a(abdn.class, abdn);
    }

    private abdn() {
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
            return bxvk.m124022a(f57103e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new abdn();
        } else {
            if (i2 == 4) {
                return new bxvd(f57103e);
            }
            if (i2 == 5) {
                return f57103e;
            }
            bxxk bxxk = f57104f;
            if (bxxk == null) {
                synchronized (abdn.class) {
                    bxxk = f57104f;
                    if (bxxk == null) {
                        bxxk = new bxve(f57103e);
                        f57104f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
