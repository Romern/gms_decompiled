package p000;

/* renamed from: bpsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpsw f139028c;

    /* renamed from: d */
    private static volatile bxxk f139029d;

    /* renamed from: a */
    public int f139030a;

    /* renamed from: b */
    public String f139031b = "";

    static {
        bpsw bpsw = new bpsw();
        f139028c = bpsw;
        bxvk.m124024a(bpsw.class, bpsw);
    }

    private bpsw() {
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
            return bxvk.m124022a(f139028c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpsw();
        } else {
            if (i2 == 4) {
                return new bxvd(f139028c);
            }
            if (i2 == 5) {
                return f139028c;
            }
            bxxk bxxk = f139029d;
            if (bxxk == null) {
                synchronized (bpsw.class) {
                    bxxk = f139029d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139028c);
                        f139029d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
