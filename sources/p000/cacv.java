package p000;

/* renamed from: cacv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacv extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cacv f172628f;

    /* renamed from: g */
    private static volatile bxxk f172629g;

    /* renamed from: a */
    public int f172630a;

    /* renamed from: b */
    public String f172631b = "";

    /* renamed from: c */
    public String f172632c = "";

    /* renamed from: d */
    public bxwc f172633d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f172634e = bxxn.f165040b;

    static {
        cacv cacv = new cacv();
        f172628f = cacv;
        GeneratedMessageLite.m124024a(cacv.class, cacv);
    }

    private cacv() {
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
            return GeneratedMessageLite.m124022a(f172628f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004\u001b", new Object[]{"a", "b", "c", "d", "e", caah.class});
        } else if (i2 == 3) {
            return new cacv();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f172628f;
            }
            bxxk bxxk = f172629g;
            if (bxxk == null) {
                synchronized (cacv.class) {
                    bxxk = f172629g;
                    if (bxxk == null) {
                        bxxk = new bxve(f172628f);
                        f172629g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
