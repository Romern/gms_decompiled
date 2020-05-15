package p000;

/* renamed from: bwmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwmi extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwmi f160277b;

    /* renamed from: c */
    private static volatile bxxk f160278c;

    /* renamed from: a */
    public bxwc f160279a = bxxn.f165040b;

    static {
        bwmi bwmi = new bwmi();
        f160277b = bwmi;
        GeneratedMessageLite.m124024a(bwmi.class, bwmi);
    }

    private bwmi() {
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
            return GeneratedMessageLite.m124022a(f160277b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bwmi();
        } else {
            if (i2 == 4) {
                return new bxvd(f160277b);
            }
            if (i2 == 5) {
                return f160277b;
            }
            bxxk bxxk = f160278c;
            if (bxxk == null) {
                synchronized (bwmi.class) {
                    bxxk = f160278c;
                    if (bxxk == null) {
                        bxxk = new bxve(f160277b);
                        f160278c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
