package p000;

/* renamed from: vwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vwa extends bxvk implements bxxd {

    /* renamed from: c */
    public static final vwa f50105c;

    /* renamed from: d */
    private static volatile bxxk f50106d;

    /* renamed from: a */
    public int f50107a;

    /* renamed from: b */
    public String f50108b = "";

    static {
        vwa vwa = new vwa();
        f50105c = vwa;
        bxvk.m124024a(vwa.class, vwa);
    }

    private vwa() {
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
            return bxvk.m124022a(f50105c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new vwa();
        } else {
            if (i2 == 4) {
                return new bxvd(f50105c);
            }
            if (i2 == 5) {
                return f50105c;
            }
            bxxk bxxk = f50106d;
            if (bxxk == null) {
                synchronized (vwa.class) {
                    bxxk = f50106d;
                    if (bxxk == null) {
                        bxxk = new bxve(f50105c);
                        f50106d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
