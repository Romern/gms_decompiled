package p000;

/* renamed from: btrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btrm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btrm f150114c;

    /* renamed from: d */
    private static volatile bxxk f150115d;

    /* renamed from: a */
    public String f150116a = "";

    /* renamed from: b */
    public String f150117b = "";

    static {
        btrm btrm = new btrm();
        f150114c = btrm;
        bxvk.m124024a(btrm.class, btrm);
    }

    private btrm() {
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
            return bxvk.m124022a(f150114c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btrm();
        } else {
            if (i2 == 4) {
                return new bxvd(f150114c);
            }
            if (i2 == 5) {
                return f150114c;
            }
            bxxk bxxk = f150115d;
            if (bxxk == null) {
                synchronized (btrm.class) {
                    bxxk = f150115d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150114c);
                        f150115d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
