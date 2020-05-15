package p000;

/* renamed from: cbkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbkq f177436c;

    /* renamed from: d */
    private static volatile bxxk f177437d;

    /* renamed from: a */
    public cbmo f177438a;

    /* renamed from: b */
    public String f177439b = "";

    static {
        cbkq cbkq = new cbkq();
        f177436c = cbkq;
        bxvk.m124024a(cbkq.class, cbkq);
    }

    private cbkq() {
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
            return bxvk.m124022a(f177436c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbkq();
        } else {
            if (i2 == 4) {
                return new bxvd(f177436c);
            }
            if (i2 == 5) {
                return f177436c;
            }
            bxxk bxxk = f177437d;
            if (bxxk == null) {
                synchronized (cbkq.class) {
                    bxxk = f177437d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177436c);
                        f177437d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
