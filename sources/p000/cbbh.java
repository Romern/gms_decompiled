package p000;

/* renamed from: cbbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbh extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cbbh f176561e;

    /* renamed from: f */
    private static volatile bxxk f176562f;

    /* renamed from: a */
    public String f176563a = "";

    /* renamed from: b */
    public long f176564b;

    /* renamed from: c */
    public String f176565c = "";

    /* renamed from: d */
    public String f176566d = "";

    static {
        cbbh cbbh = new cbbh();
        f176561e = cbbh;
        GeneratedMessageLite.m124024a(cbbh.class, cbbh);
    }

    private cbbh() {
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
            return GeneratedMessageLite.m124022a(f176561e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbbh();
        } else {
            if (i2 == 4) {
                return new bxvd(f176561e);
            }
            if (i2 == 5) {
                return f176561e;
            }
            bxxk bxxk = f176562f;
            if (bxxk == null) {
                synchronized (cbbh.class) {
                    bxxk = f176562f;
                    if (bxxk == null) {
                        bxxk = new bxve(f176561e);
                        f176562f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
