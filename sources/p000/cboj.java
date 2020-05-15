package p000;

/* renamed from: cboj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cboj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cboj f177822c;

    /* renamed from: d */
    private static volatile bxxk f177823d;

    /* renamed from: a */
    public String f177824a = "";

    /* renamed from: b */
    public int f177825b;

    static {
        cboj cboj = new cboj();
        f177822c = cboj;
        bxvk.m124024a(cboj.class, cboj);
    }

    private cboj() {
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
            return bxvk.m124022a(f177822c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cboj();
        } else {
            if (i2 == 4) {
                return new bxvd(f177822c);
            }
            if (i2 == 5) {
                return f177822c;
            }
            bxxk bxxk = f177823d;
            if (bxxk == null) {
                synchronized (cboj.class) {
                    bxxk = f177823d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177822c);
                        f177823d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
