package p000;

/* renamed from: brbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbh extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final brbh f142250j;

    /* renamed from: l */
    private static volatile bxxk f142251l;

    /* renamed from: a */
    public String f142252a = "";

    /* renamed from: b */
    public String f142253b = "";

    /* renamed from: c */
    public String f142254c = "";

    /* renamed from: d */
    public String f142255d = "";

    /* renamed from: e */
    public String f142256e = "";

    /* renamed from: f */
    public String f142257f = "";

    /* renamed from: g */
    public String f142258g = "";

    /* renamed from: h */
    public String f142259h = "";

    /* renamed from: i */
    public String f142260i = "";

    /* renamed from: k */
    private int f142261k;

    static {
        brbh brbh = new brbh();
        f142250j = brbh;
        GeneratedMessageLite.m124024a(brbh.class, brbh);
    }

    private brbh() {
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
            return GeneratedMessageLite.m124022a(f142250j, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b", new Object[]{"k", "a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new brbh();
        } else {
            if (i2 == 4) {
                return new bxvd(f142250j);
            }
            if (i2 == 5) {
                return f142250j;
            }
            bxxk bxxk = f142251l;
            if (bxxk == null) {
                synchronized (brbh.class) {
                    bxxk = f142251l;
                    if (bxxk == null) {
                        bxxk = new bxve(f142250j);
                        f142251l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
