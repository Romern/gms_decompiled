package p000;

/* renamed from: ates */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ates extends bxvk implements bxxd {

    /* renamed from: e */
    public static final ates f90196e;

    /* renamed from: f */
    private static volatile bxxk f90197f;

    /* renamed from: a */
    public String f90198a = "";

    /* renamed from: b */
    public String f90199b = "";

    /* renamed from: c */
    public String f90200c = "";

    /* renamed from: d */
    public bxwc f90201d = bxxn.f165040b;

    static {
        ates ates = new ates();
        f90196e = ates;
        bxvk.m124024a(ates.class, ates);
    }

    private ates() {
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
            return bxvk.m124022a(f90196e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b", new Object[]{"a", "b", "c", "d", ater.class});
        } else if (i2 == 3) {
            return new ates();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f90196e;
            }
            bxxk bxxk = f90197f;
            if (bxxk == null) {
                synchronized (ates.class) {
                    bxxk = f90197f;
                    if (bxxk == null) {
                        bxxk = new bxve(f90196e);
                        f90197f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
