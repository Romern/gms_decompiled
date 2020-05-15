package p000;

/* renamed from: bsan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsan extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsan f143878b;

    /* renamed from: d */
    private static volatile bxxk f143879d;

    /* renamed from: a */
    public bxwc f143880a = bxxn.f165040b;

    /* renamed from: c */
    private byte f143881c = 2;

    static {
        bsan bsan = new bsan();
        f143878b = bsan;
        GeneratedMessageLite.m124024a(bsan.class, bsan);
    }

    private bsan() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f143881c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f143881c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f143878b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", bsal.class});
        } else if (i2 == 3) {
            return new bsan();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f143878b;
            }
            bxxk bxxk = f143879d;
            if (bxxk == null) {
                synchronized (bsan.class) {
                    bxxk = f143879d;
                    if (bxxk == null) {
                        bxxk = new bxve(f143878b);
                        f143879d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
