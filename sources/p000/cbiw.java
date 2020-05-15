package p000;

/* renamed from: cbiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbiw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbiw f177306c;

    /* renamed from: d */
    private static volatile bxxk f177307d;

    /* renamed from: a */
    public String f177308a = "";

    /* renamed from: b */
    public String f177309b = "";

    static {
        cbiw cbiw = new cbiw();
        f177306c = cbiw;
        bxvk.m124024a(cbiw.class, cbiw);
    }

    private cbiw() {
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
            return bxvk.m124022a(f177306c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbiw();
        } else {
            if (i2 == 4) {
                return new bxvd(f177306c);
            }
            if (i2 == 5) {
                return f177306c;
            }
            bxxk bxxk = f177307d;
            if (bxxk == null) {
                synchronized (cbiw.class) {
                    bxxk = f177307d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177306c);
                        f177307d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
