package p000;

/* renamed from: boqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final boqu f134329c;

    /* renamed from: d */
    private static volatile bxxk f134330d;

    /* renamed from: a */
    public int f134331a;

    /* renamed from: b */
    public boqv f134332b;

    static {
        boqu boqu = new boqu();
        f134329c = boqu;
        bxvk.m124024a(boqu.class, boqu);
    }

    private boqu() {
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
            return bxvk.m124022a(f134329c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new boqu();
        } else {
            if (i2 == 4) {
                return new bxvd(f134329c);
            }
            if (i2 == 5) {
                return f134329c;
            }
            bxxk bxxk = f134330d;
            if (bxxk == null) {
                synchronized (boqu.class) {
                    bxxk = f134330d;
                    if (bxxk == null) {
                        bxxk = new bxve(f134329c);
                        f134330d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
