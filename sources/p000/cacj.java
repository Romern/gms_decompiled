package p000;

/* renamed from: cacj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cacj f172559d;

    /* renamed from: f */
    private static volatile bxxk f172560f;

    /* renamed from: a */
    public int f172561a;

    /* renamed from: b */
    public String f172562b = "";

    /* renamed from: c */
    public bxwc f172563c;

    /* renamed from: e */
    private byte f172564e = 2;

    static {
        cacj cacj = new cacj();
        f172559d = cacj;
        GeneratedMessageLite.m124024a(cacj.class, cacj);
    }

    private cacj() {
        bxxn bxxn = bxxn.f165040b;
        this.f172563c = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f172564e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f172564e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f172559d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0001\u0001ᔈ\u0000\u0004\u001a", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cacj();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f172559d;
            }
            bxxk bxxk = f172560f;
            if (bxxk == null) {
                synchronized (cacj.class) {
                    bxxk = f172560f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172559d);
                        f172560f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
