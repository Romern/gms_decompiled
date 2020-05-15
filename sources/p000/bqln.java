package p000;

/* renamed from: bqln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqln extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bqln f141121d;

    /* renamed from: e */
    private static volatile bxxk f141122e;

    /* renamed from: a */
    public String f141123a = "";

    /* renamed from: b */
    public boolean f141124b;

    /* renamed from: c */
    public bxtx f141125c = bxtx.f164797b;

    static {
        bqln bqln = new bqln();
        f141121d = bqln;
        bxvk.m124024a(bqln.class, bqln);
    }

    private bqln() {
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
            return bxvk.m124022a(f141121d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqln();
        } else {
            if (i2 == 4) {
                return new bxvd(f141121d);
            }
            if (i2 == 5) {
                return f141121d;
            }
            bxxk bxxk = f141122e;
            if (bxxk == null) {
                synchronized (bqln.class) {
                    bxxk = f141122e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141121d);
                        f141122e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
