package p000;

/* renamed from: biti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biti extends bxvk implements bxxd {

    /* renamed from: c */
    public static final biti f121650c;

    /* renamed from: d */
    private static volatile bxxk f121651d;

    /* renamed from: a */
    public int f121652a;

    /* renamed from: b */
    public boolean f121653b;

    static {
        biti biti = new biti();
        f121650c = biti;
        bxvk.m124024a(biti.class, biti);
    }

    private biti() {
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
            return bxvk.m124022a(f121650c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new biti();
        } else {
            if (i2 == 4) {
                return new bxvd(f121650c);
            }
            if (i2 == 5) {
                return f121650c;
            }
            bxxk bxxk = f121651d;
            if (bxxk == null) {
                synchronized (biti.class) {
                    bxxk = f121651d;
                    if (bxxk == null) {
                        bxxk = new bxve(f121650c);
                        f121651d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
