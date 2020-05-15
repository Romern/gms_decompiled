package p000;

/* renamed from: ydh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ydh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final ydh f53653d;

    /* renamed from: e */
    private static volatile bxxk f53654e;

    /* renamed from: a */
    public int f53655a;

    /* renamed from: b */
    public String f53656b = "";

    /* renamed from: c */
    public bxwc f53657c = bxxn.f165040b;

    static {
        ydh ydh = new ydh();
        f53653d = ydh;
        bxvk.m124024a(ydh.class, ydh);
    }

    private ydh() {
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
            return bxvk.m124022a(f53653d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ydh();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (int[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f53653d;
            }
            bxxk bxxk = f53654e;
            if (bxxk == null) {
                synchronized (ydh.class) {
                    bxxk = f53654e;
                    if (bxxk == null) {
                        bxxk = new bxve(f53653d);
                        f53654e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
