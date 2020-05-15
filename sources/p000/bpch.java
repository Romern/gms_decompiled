package p000;

/* renamed from: bpch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpch extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpch f135725c;

    /* renamed from: d */
    private static volatile bxxk f135726d;

    /* renamed from: a */
    public int f135727a;

    /* renamed from: b */
    public bpcg f135728b;

    static {
        bpch bpch = new bpch();
        f135725c = bpch;
        GeneratedMessageLite.m124024a(bpch.class, bpch);
    }

    private bpch() {
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
            return GeneratedMessageLite.m124022a(f135725c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpch();
        } else {
            if (i2 == 4) {
                return new bxvd(f135725c);
            }
            if (i2 == 5) {
                return f135725c;
            }
            bxxk bxxk = f135726d;
            if (bxxk == null) {
                synchronized (bpch.class) {
                    bxxk = f135726d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135725c);
                        f135726d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
