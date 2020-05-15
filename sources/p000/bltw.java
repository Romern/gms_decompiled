package p000;

/* renamed from: bltw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bltw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bltw f127753c;

    /* renamed from: d */
    private static volatile bxxk f127754d;

    /* renamed from: a */
    public bxwc f127755a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f127756b = bxxn.f165040b;

    static {
        bltw bltw = new bltw();
        f127753c = bltw;
        GeneratedMessageLite.m124024a(bltw.class, bltw);
    }

    private bltw() {
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
            return GeneratedMessageLite.m124022a(f127753c, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", blub.class, "b", blua.class});
        } else if (i2 == 3) {
            return new bltw();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f127753c;
            }
            bxxk bxxk = f127754d;
            if (bxxk == null) {
                synchronized (bltw.class) {
                    bxxk = f127754d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127753c);
                        f127754d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
