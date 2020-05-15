package p000;

/* renamed from: bsmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsmh extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsmh f145025e;

    /* renamed from: f */
    private static volatile bxxk f145026f;

    /* renamed from: a */
    public int f145027a;

    /* renamed from: b */
    public long f145028b;

    /* renamed from: c */
    public String f145029c = "";

    /* renamed from: d */
    public int f145030d;

    static {
        bsmh bsmh = new bsmh();
        f145025e = bsmh;
        GeneratedMessageLite.m124024a(bsmh.class, bsmh);
    }

    private bsmh() {
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
            return GeneratedMessageLite.m124022a(f145025e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsmh();
        } else {
            if (i2 == 4) {
                return new bxvd(f145025e);
            }
            if (i2 == 5) {
                return f145025e;
            }
            bxxk bxxk = f145026f;
            if (bxxk == null) {
                synchronized (bsmh.class) {
                    bxxk = f145026f;
                    if (bxxk == null) {
                        bxxk = new bxve(f145025e);
                        f145026f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
