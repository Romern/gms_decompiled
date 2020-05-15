package p000;

/* renamed from: abui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abui extends bxvk implements bxxd {

    /* renamed from: a */
    public static final abui f58405a;

    /* renamed from: b */
    private static volatile bxxk f58406b;

    static {
        abui abui = new abui();
        f58405a = abui;
        bxvk.m124024a(abui.class, abui);
    }

    private abui() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f58405a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new abui();
        }
        if (i2 == 4) {
            return new bxvd(f58405a);
        }
        if (i2 == 5) {
            return f58405a;
        }
        bxxk bxxk = f58406b;
        if (bxxk == null) {
            synchronized (abui.class) {
                bxxk = f58406b;
                if (bxxk == null) {
                    bxxk = new bxve(f58405a);
                    f58406b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
