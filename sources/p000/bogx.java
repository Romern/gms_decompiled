package p000;

/* renamed from: bogx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bogx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bogx f133038d;

    /* renamed from: e */
    private static volatile bxxk f133039e;

    /* renamed from: a */
    public int f133040a;

    /* renamed from: b */
    public boolean f133041b;

    /* renamed from: c */
    public bxwc f133042c = bxxn.f165040b;

    static {
        bogx bogx = new bogx();
        f133038d = bogx;
        GeneratedMessageLite.m124024a(bogx.class, bogx);
    }

    private bogx() {
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
            return GeneratedMessageLite.m124022a(f133038d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bogw.class});
        } else if (i2 == 3) {
            return new bogx();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f133038d;
            }
            bxxk bxxk = f133039e;
            if (bxxk == null) {
                synchronized (bogx.class) {
                    bxxk = f133039e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133038d);
                        f133039e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
