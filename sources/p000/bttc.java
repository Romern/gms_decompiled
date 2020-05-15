package p000;

/* renamed from: bttc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bttc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bttc f150319d;

    /* renamed from: e */
    private static volatile bxxk f150320e;

    /* renamed from: a */
    public int f150321a;

    /* renamed from: b */
    public String f150322b = "";

    /* renamed from: c */
    public int f150323c;

    static {
        bttc bttc = new bttc();
        f150319d = bttc;
        GeneratedMessageLite.m124024a(bttc.class, bttc);
    }

    private bttc() {
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
            return GeneratedMessageLite.m124022a(f150319d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", btta.f150318a});
        } else if (i2 == 3) {
            return new bttc();
        } else {
            if (i2 == 4) {
                return new bxvd(f150319d);
            }
            if (i2 == 5) {
                return f150319d;
            }
            bxxk bxxk = f150320e;
            if (bxxk == null) {
                synchronized (bttc.class) {
                    bxxk = f150320e;
                    if (bxxk == null) {
                        bxxk = new bxve(f150319d);
                        f150320e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
