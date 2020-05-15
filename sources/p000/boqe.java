package p000;

/* renamed from: boqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqe extends bxvk implements bxxd {

    /* renamed from: c */
    public static final boqe f134259c;

    /* renamed from: d */
    private static volatile bxxk f134260d;

    /* renamed from: a */
    public int f134261a;

    /* renamed from: b */
    public int f134262b;

    static {
        boqe boqe = new boqe();
        f134259c = boqe;
        bxvk.m124024a(boqe.class, boqe);
    }

    private boqe() {
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
            return bxvk.m124022a(f134259c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bopx.f134218a});
        } else if (i2 == 3) {
            return new boqe();
        } else {
            if (i2 == 4) {
                return new bxvd(f134259c);
            }
            if (i2 == 5) {
                return f134259c;
            }
            bxxk bxxk = f134260d;
            if (bxxk == null) {
                synchronized (boqe.class) {
                    bxxk = f134260d;
                    if (bxxk == null) {
                        bxxk = new bxve(f134259c);
                        f134260d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
