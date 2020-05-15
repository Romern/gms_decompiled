package p000;

/* renamed from: boco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boco extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final boco f132581g;

    /* renamed from: h */
    private static volatile bxxk f132582h;

    /* renamed from: a */
    public int f132583a;

    /* renamed from: b */
    public String f132584b = "";

    /* renamed from: c */
    public int f132585c;

    /* renamed from: d */
    public long f132586d;

    /* renamed from: e */
    public int f132587e;

    /* renamed from: f */
    public String f132588f = "";

    static {
        boco boco = new boco();
        f132581g = boco;
        GeneratedMessageLite.m124024a(boco.class, boco);
    }

    private boco() {
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
            return GeneratedMessageLite.m124022a(f132581g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new boco();
        } else {
            if (i2 == 4) {
                return new bxvd(f132581g);
            }
            if (i2 == 5) {
                return f132581g;
            }
            bxxk bxxk = f132582h;
            if (bxxk == null) {
                synchronized (boco.class) {
                    bxxk = f132582h;
                    if (bxxk == null) {
                        bxxk = new bxve(f132581g);
                        f132582h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
