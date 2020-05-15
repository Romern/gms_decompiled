package p000;

/* renamed from: blay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blay extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blay f125802e;

    /* renamed from: f */
    private static volatile bxxk f125803f;

    /* renamed from: a */
    public int f125804a;

    /* renamed from: b */
    public long f125805b;

    /* renamed from: c */
    public int f125806c;

    /* renamed from: d */
    public String f125807d = "";

    static {
        blay blay = new blay();
        f125802e = blay;
        bxvk.m124024a(blay.class, blay);
    }

    private blay() {
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
            return bxvk.m124022a(f125802e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", blaz.f125808a, "d"});
        } else if (i2 == 3) {
            return new blay();
        } else {
            if (i2 == 4) {
                return new bxvd(f125802e);
            }
            if (i2 == 5) {
                return f125802e;
            }
            bxxk bxxk = f125803f;
            if (bxxk == null) {
                synchronized (blay.class) {
                    bxxk = f125803f;
                    if (bxxk == null) {
                        bxxk = new bxve(f125802e);
                        f125803f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
