package p000;

/* renamed from: bwov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwov extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bwov f160499a;

    /* renamed from: b */
    public static final bxvj f160500b;

    /* renamed from: c */
    private static volatile bxxk f160501c;

    static {
        bwov bwov = new bwov();
        f160499a = bwov;
        bxvk.m124024a(bwov.class, bwov);
        bwou bwou = bwou.f160492e;
        bwov bwov2 = f160499a;
        f160500b = bxvk.m124006a(bwou, bwov2, bwov2, 231698332, bxzf.MESSAGE);
    }

    private bwov() {
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
            return bxvk.m124022a(f160499a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwov();
        }
        if (i2 == 4) {
            return new bxvd(f160499a);
        }
        if (i2 == 5) {
            return f160499a;
        }
        bxxk bxxk = f160501c;
        if (bxxk == null) {
            synchronized (bwov.class) {
                bxxk = f160501c;
                if (bxxk == null) {
                    bxxk = new bxve(f160499a);
                    f160501c = bxxk;
                }
            }
        }
        return bxxk;
    }
}
