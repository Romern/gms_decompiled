package p000;

@Deprecated
/* renamed from: bqsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bqsg f141519e;

    /* renamed from: f */
    private static volatile bxxk f141520f;

    /* renamed from: a */
    public String f141521a = "";

    /* renamed from: b */
    public String f141522b = "";

    /* renamed from: c */
    public boolean f141523c;

    /* renamed from: d */
    public String f141524d = "";

    static {
        bqsg bqsg = new bqsg();
        f141519e = bqsg;
        bxvk.m124024a(bqsg.class, bqsg);
    }

    private bqsg() {
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
            return bxvk.m124022a(f141519e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004\u0007\u0005Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqsg();
        } else {
            if (i2 == 4) {
                return new bxvd(f141519e);
            }
            if (i2 == 5) {
                return f141519e;
            }
            bxxk bxxk = f141520f;
            if (bxxk == null) {
                synchronized (bqsg.class) {
                    bxxk = f141520f;
                    if (bxxk == null) {
                        bxxk = new bxve(f141519e);
                        f141520f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
