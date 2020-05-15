package p000;

/* renamed from: cbhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cbhq f177161e;

    /* renamed from: f */
    private static volatile bxxk f177162f;

    /* renamed from: a */
    public bxwc f177163a = bxxn.f165040b;

    /* renamed from: b */
    public cbhp f177164b;

    /* renamed from: c */
    public String f177165c = "";

    /* renamed from: d */
    public String f177166d = "";

    static {
        cbhq cbhq = new cbhq();
        f177161e = cbhq;
        bxvk.m124024a(cbhq.class, cbhq);
    }

    private cbhq() {
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
            return bxvk.m124022a(f177161e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003Ȉ\u0004Ȉ", new Object[]{"a", cbhm.class, "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbhq();
        } else {
            if (i2 == 4) {
                return new bxvd(f177161e);
            }
            if (i2 == 5) {
                return f177161e;
            }
            bxxk bxxk = f177162f;
            if (bxxk == null) {
                synchronized (cbhq.class) {
                    bxxk = f177162f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177161e);
                        f177162f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
