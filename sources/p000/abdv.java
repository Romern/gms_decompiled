package p000;

/* renamed from: abdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final abdv f57143c;

    /* renamed from: d */
    private static volatile bxxk f57144d;

    /* renamed from: a */
    public int f57145a = 0;

    /* renamed from: b */
    public Object f57146b;

    static {
        abdv abdv = new abdv();
        f57143c = abdv;
        GeneratedMessageLite.m124024a(abdv.class, abdv);
    }

    private abdv() {
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
            return GeneratedMessageLite.m124022a(f57143c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", abds.class, abdi.class, abdl.class});
        } else if (i2 == 3) {
            return new abdv();
        } else {
            if (i2 == 4) {
                return new bxvd(f57143c);
            }
            if (i2 == 5) {
                return f57143c;
            }
            bxxk bxxk = f57144d;
            if (bxxk == null) {
                synchronized (abdv.class) {
                    bxxk = f57144d;
                    if (bxxk == null) {
                        bxxk = new bxve(f57143c);
                        f57144d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
