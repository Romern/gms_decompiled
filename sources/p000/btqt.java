package p000;

/* renamed from: btqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqt extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btqt f150038d;

    /* renamed from: e */
    private static volatile bxxk f150039e;

    /* renamed from: a */
    public int f150040a;

    /* renamed from: b */
    public int f150041b;

    /* renamed from: c */
    public String f150042c = "";

    static {
        btqt btqt = new btqt();
        f150038d = btqt;
        bxvk.m124024a(btqt.class, btqt);
    }

    private btqt() {
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
            return bxvk.m124022a(f150038d, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002\f\u0003\f\u0004Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btqt();
        } else {
            if (i2 == 4) {
                return new bxvd(f150038d);
            }
            if (i2 == 5) {
                return f150038d;
            }
            bxxk bxxk = f150039e;
            if (bxxk == null) {
                synchronized (btqt.class) {
                    bxxk = f150039e;
                    if (bxxk == null) {
                        bxxk = new bxve(f150038d);
                        f150039e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
