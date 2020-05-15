package p000;

/* renamed from: btik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btik extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btik f148985c;

    /* renamed from: d */
    private static volatile bxxk f148986d;

    /* renamed from: a */
    public bxwc f148987a = bxxn.f165040b;

    /* renamed from: b */
    public bxww f148988b = bxww.f165013b;

    static {
        btik btik = new btik();
        f148985c = btik;
        GeneratedMessageLite.m124024a(btik.class, btik);
    }

    private btik() {
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
            return GeneratedMessageLite.m124022a(f148985c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0001\u0001\u0000\u0002\u001b\u00032", new Object[]{"a", bthy.class, "b", btij.f148984a});
        } else if (i2 == 3) {
            return new btik();
        } else {
            if (i2 == 4) {
                return new bxvd(f148985c);
            }
            if (i2 == 5) {
                return f148985c;
            }
            bxxk bxxk = f148986d;
            if (bxxk == null) {
                synchronized (btik.class) {
                    bxxk = f148986d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148985c);
                        f148986d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
