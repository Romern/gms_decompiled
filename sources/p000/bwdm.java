package p000;

/* renamed from: bwdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwdm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwdm f158904d;

    /* renamed from: e */
    private static volatile bxxk f158905e;

    /* renamed from: a */
    public int f158906a;

    /* renamed from: b */
    public int f158907b;

    /* renamed from: c */
    public String f158908c = "";

    static {
        bwdm bwdm = new bwdm();
        f158904d = bwdm;
        bxvk.m124024a(bwdm.class, bwdm);
    }

    private bwdm() {
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
            return bxvk.m124022a(f158904d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bwdk.f158903a, "c"});
        } else if (i2 == 3) {
            return new bwdm();
        } else {
            if (i2 == 4) {
                return new bxvd(f158904d);
            }
            if (i2 == 5) {
                return f158904d;
            }
            bxxk bxxk = f158905e;
            if (bxxk == null) {
                synchronized (bwdm.class) {
                    bxxk = f158905e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158904d);
                        f158905e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
