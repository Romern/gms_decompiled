package p000;

/* renamed from: byaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byaz extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final byaz f165370a;

    /* renamed from: c */
    private static volatile bxxk f165371c;

    /* renamed from: b */
    private bxww f165372b = bxww.f165013b;

    static {
        byaz byaz = new byaz();
        f165370a = byaz;
        GeneratedMessageLite.m124024a(byaz.class, byaz);
    }

    private byaz() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f165370a, "\u0001\u0001\u0000\u0000\n\n\u0001\u0001\u0000\u0000\n2", new Object[]{"b", byay.f165369a});
        } else if (i2 == 3) {
            return new byaz();
        } else {
            if (i2 == 4) {
                return new bxvd(f165370a);
            }
            if (i2 == 5) {
                return f165370a;
            }
            bxxk bxxk = f165371c;
            if (bxxk == null) {
                synchronized (byaz.class) {
                    bxxk = f165371c;
                    if (bxxk == null) {
                        bxxk = new bxve(f165370a);
                        f165371c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
