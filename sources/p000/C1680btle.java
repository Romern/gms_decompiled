package p000;

/* renamed from: btle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1680btle extends bxvk implements bxxd {

    /* renamed from: b */
    public static final C1680btle f149356b;

    /* renamed from: c */
    private static volatile bxxk f149357c;

    /* renamed from: a */
    public String f149358a = "";

    static {
        C1680btle btle = new C1680btle();
        f149356b = btle;
        bxvk.m124024a(C1680btle.class, btle);
    }

    private C1680btle() {
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
            return bxvk.m124022a(f149356b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new C1680btle();
        } else {
            if (i2 == 4) {
                return new bxvd(f149356b);
            }
            if (i2 == 5) {
                return f149356b;
            }
            bxxk bxxk = f149357c;
            if (bxxk == null) {
                synchronized (C1680btle.class) {
                    bxxk = f149357c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149356b);
                        f149357c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
