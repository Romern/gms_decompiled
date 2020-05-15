package p000;

/* renamed from: bvui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvui extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvui f157693d;

    /* renamed from: e */
    private static volatile bxxk f157694e;

    /* renamed from: a */
    public int f157695a;

    /* renamed from: b */
    public bxvw f157696b = bxwq.f165002b;

    /* renamed from: c */
    public bvny f157697c;

    static {
        bvui bvui = new bvui();
        f157693d = bvui;
        bxvk.m124024a(bvui.class, bvui);
    }

    private bvui() {
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
            return bxvk.m124022a(f157693d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0017\u0002ဉ\u0000", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvui();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f157693d;
            }
            bxxk bxxk = f157694e;
            if (bxxk == null) {
                synchronized (bvui.class) {
                    bxxk = f157694e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157693d);
                        f157694e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
