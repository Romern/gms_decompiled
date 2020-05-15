package p000;

/* renamed from: bsls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsls extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsls f144946b;

    /* renamed from: d */
    private static volatile bxxk f144947d;

    /* renamed from: a */
    public String f144948a = "";

    /* renamed from: c */
    private int f144949c;

    static {
        bsls bsls = new bsls();
        f144946b = bsls;
        bxvk.m124024a(bsls.class, bsls);
    }

    private bsls() {
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
            return bxvk.m124022a(f144946b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bsls();
        } else {
            if (i2 == 4) {
                return new bxvd(f144946b);
            }
            if (i2 == 5) {
                return f144946b;
            }
            bxxk bxxk = f144947d;
            if (bxxk == null) {
                synchronized (bsls.class) {
                    bxxk = f144947d;
                    if (bxxk == null) {
                        bxxk = new bxve(f144946b);
                        f144947d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
