package p000;

/* renamed from: blrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blrh extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final blrh f127450b;

    /* renamed from: d */
    private static volatile bxxk f127451d;

    /* renamed from: a */
    public bxwc f127452a = bxxn.f165040b;

    /* renamed from: c */
    private byte f127453c = 2;

    static {
        blrh blrh = new blrh();
        f127450b = blrh;
        GeneratedMessageLite.m124024a(blrh.class, blrh);
    }

    private blrh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127453c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127453c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127450b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", blrg.class});
        } else if (i2 == 3) {
            return new blrh();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f127450b;
            }
            bxxk bxxk = f127451d;
            if (bxxk == null) {
                synchronized (blrh.class) {
                    bxxk = f127451d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127450b);
                        f127451d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
