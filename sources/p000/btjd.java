package p000;

/* renamed from: btjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjd extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btjd f149100a;

    /* renamed from: b */
    private static volatile bxxk f149101b;

    static {
        btjd btjd = new btjd();
        f149100a = btjd;
        bxvk.m124024a(btjd.class, btjd);
    }

    private btjd() {
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
            return bxvk.m124022a(f149100a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btjd();
        }
        if (i2 == 4) {
            return new bxvd(f149100a);
        }
        if (i2 == 5) {
            return f149100a;
        }
        bxxk bxxk = f149101b;
        if (bxxk == null) {
            synchronized (btjd.class) {
                bxxk = f149101b;
                if (bxxk == null) {
                    bxxk = new bxve(f149100a);
                    f149101b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
