package p000;

/* renamed from: bpyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyh extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpyh f139845f;

    /* renamed from: g */
    private static volatile bxxk f139846g;

    /* renamed from: a */
    public int f139847a;

    /* renamed from: b */
    public long f139848b;

    /* renamed from: c */
    public long f139849c;

    /* renamed from: d */
    public long f139850d;

    /* renamed from: e */
    public long f139851e;

    static {
        bpyh bpyh = new bpyh();
        f139845f = bpyh;
        GeneratedMessageLite.m124024a(bpyh.class, bpyh);
    }

    private bpyh() {
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
            return GeneratedMessageLite.m124022a(f139845f, "\u0001\u0004\u0000\u0001\u0003\b\u0004\u0000\u0000\u0000\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004\bဃ\u0006", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpyh();
        } else {
            if (i2 == 4) {
                return new bxvd(f139845f);
            }
            if (i2 == 5) {
                return f139845f;
            }
            bxxk bxxk = f139846g;
            if (bxxk == null) {
                synchronized (bpyh.class) {
                    bxxk = f139846g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139845f);
                        f139846g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
