package p000;

/* renamed from: boor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boor extends bxvk implements bxxd {

    /* renamed from: e */
    public static final boor f133984e;

    /* renamed from: f */
    private static volatile bxxk f133985f;

    /* renamed from: a */
    public String f133986a = "";

    /* renamed from: b */
    public long f133987b;

    /* renamed from: c */
    public long f133988c;

    /* renamed from: d */
    public int f133989d;

    static {
        boor boor = new boor();
        f133984e = boor;
        bxvk.m124024a(boor.class, boor);
    }

    private boor() {
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
            return bxvk.m124022a(f133984e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new boor();
        } else {
            if (i2 == 4) {
                return new bxvd(f133984e);
            }
            if (i2 == 5) {
                return f133984e;
            }
            bxxk bxxk = f133985f;
            if (bxxk == null) {
                synchronized (boor.class) {
                    bxxk = f133985f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133984e);
                        f133985f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
