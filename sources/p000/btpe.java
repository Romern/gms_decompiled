package p000;

/* renamed from: btpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpe extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btpe f149837b;

    /* renamed from: c */
    private static volatile bxxk f149838c;

    /* renamed from: a */
    public int f149839a;

    static {
        btpe btpe = new btpe();
        f149837b = btpe;
        bxvk.m124024a(btpe.class, btpe);
    }

    private btpe() {
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
            return bxvk.m124022a(f149837b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btpe();
        } else {
            if (i2 == 4) {
                return new bxvd(f149837b);
            }
            if (i2 == 5) {
                return f149837b;
            }
            bxxk bxxk = f149838c;
            if (bxxk == null) {
                synchronized (btpe.class) {
                    bxxk = f149838c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149837b);
                        f149838c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
