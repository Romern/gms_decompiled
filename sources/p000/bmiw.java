package p000;

/* renamed from: bmiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmiw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmiw f129642c;

    /* renamed from: e */
    private static volatile bxxk f129643e;

    /* renamed from: a */
    public String f129644a = "";

    /* renamed from: b */
    public blwj f129645b;

    /* renamed from: d */
    private int f129646d;

    static {
        bmiw bmiw = new bmiw();
        f129642c = bmiw;
        GeneratedMessageLite.m124024a(bmiw.class, bmiw);
    }

    private bmiw() {
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
            return GeneratedMessageLite.m124022a(f129642c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bmiw();
        } else {
            if (i2 == 4) {
                return new bxvd(f129642c);
            }
            if (i2 == 5) {
                return f129642c;
            }
            bxxk bxxk = f129643e;
            if (bxxk == null) {
                synchronized (bmiw.class) {
                    bxxk = f129643e;
                    if (bxxk == null) {
                        bxxk = new bxve(f129642c);
                        f129643e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
