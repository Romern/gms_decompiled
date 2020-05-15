package p000;

/* renamed from: qhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qhk extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final qhk f41362e;

    /* renamed from: g */
    private static volatile bxxk f41363g;

    /* renamed from: a */
    public int f41364a;

    /* renamed from: b */
    public String f41365b = "";

    /* renamed from: c */
    public String f41366c = "";

    /* renamed from: d */
    public long f41367d;

    /* renamed from: f */
    private byte f41368f = 2;

    static {
        qhk qhk = new qhk();
        f41362e = qhk;
        GeneratedMessageLite.m124024a(qhk.class, qhk);
    }

    private qhk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f41368f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f41368f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f41362e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new qhk();
        } else {
            if (i2 == 4) {
                return new bxvd(f41362e);
            }
            if (i2 == 5) {
                return f41362e;
            }
            bxxk bxxk = f41363g;
            if (bxxk == null) {
                synchronized (qhk.class) {
                    bxxk = f41363g;
                    if (bxxk == null) {
                        bxxk = new bxve(f41362e);
                        f41363g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
