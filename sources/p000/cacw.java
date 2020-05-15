package p000;

/* renamed from: cacw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cacw f172635c;

    /* renamed from: d */
    private static volatile bxxk f172636d;

    /* renamed from: a */
    public int f172637a;

    /* renamed from: b */
    public int f172638b;

    static {
        cacw cacw = new cacw();
        f172635c = cacw;
        bxvk.m124024a(cacw.class, cacw);
    }

    private cacw() {
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
            return bxvk.m124022a(f172635c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cacw();
        } else {
            if (i2 == 4) {
                return new bxvd(f172635c);
            }
            if (i2 == 5) {
                return f172635c;
            }
            bxxk bxxk = f172636d;
            if (bxxk == null) {
                synchronized (cacw.class) {
                    bxxk = f172636d;
                    if (bxxk == null) {
                        bxxk = new bxve(f172635c);
                        f172636d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
