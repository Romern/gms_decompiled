package p000;

/* renamed from: ammi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ammi extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final ammi f75284d;

    /* renamed from: e */
    private static volatile bxxk f75285e;

    /* renamed from: a */
    public int f75286a;

    /* renamed from: b */
    public int f75287b;

    /* renamed from: c */
    public int f75288c;

    static {
        ammi ammi = new ammi();
        f75284d = ammi;
        GeneratedMessageLite.m124024a(ammi.class, ammi);
    }

    private ammi() {
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
            return GeneratedMessageLite.m124022a(f75284d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", ammf.f75282a, "c", ammh.f75283a});
        } else if (i2 == 3) {
            return new ammi();
        } else {
            if (i2 == 4) {
                return new bxvd(f75284d);
            }
            if (i2 == 5) {
                return f75284d;
            }
            bxxk bxxk = f75285e;
            if (bxxk == null) {
                synchronized (ammi.class) {
                    bxxk = f75285e;
                    if (bxxk == null) {
                        bxxk = new bxve(f75284d);
                        f75285e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
