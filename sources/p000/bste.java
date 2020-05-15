package p000;

/* renamed from: bste */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bste extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bste f146996b;

    /* renamed from: c */
    private static volatile bxxk f146997c;

    /* renamed from: a */
    public bxwc f146998a = bxxn.f165040b;

    static {
        bste bste = new bste();
        f146996b = bste;
        GeneratedMessageLite.m124024a(bste.class, bste);
    }

    private bste() {
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
            return GeneratedMessageLite.m124022a(f146996b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bstc.class});
        } else if (i2 == 3) {
            return new bste();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f146996b;
            }
            bxxk bxxk = f146997c;
            if (bxxk == null) {
                synchronized (bste.class) {
                    bxxk = f146997c;
                    if (bxxk == null) {
                        bxxk = new bxve(f146996b);
                        f146997c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
