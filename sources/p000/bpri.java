package p000;

/* renamed from: bpri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpri extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bpri f138855b;

    /* renamed from: c */
    private static volatile bxxk f138856c;

    /* renamed from: a */
    public bxwc f138857a = bxxn.f165040b;

    static {
        bpri bpri = new bpri();
        f138855b = bpri;
        GeneratedMessageLite.m124024a(bpri.class, bpri);
    }

    private bpri() {
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
            return GeneratedMessageLite.m124022a(f138855b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bpri();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f138855b;
            }
            bxxk bxxk = f138856c;
            if (bxxk == null) {
                synchronized (bpri.class) {
                    bxxk = f138856c;
                    if (bxxk == null) {
                        bxxk = new bxve(f138855b);
                        f138856c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
