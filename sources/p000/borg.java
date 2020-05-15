package p000;

/* renamed from: borg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class borg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final borg f134407d;

    /* renamed from: e */
    private static volatile bxxk f134408e;

    /* renamed from: a */
    public int f134409a;

    /* renamed from: b */
    public borf f134410b;

    /* renamed from: c */
    public bxwc f134411c = bxxn.f165040b;

    static {
        borg borg = new borg();
        f134407d = borg;
        GeneratedMessageLite.m124024a(borg.class, borg);
    }

    private borg() {
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
            return GeneratedMessageLite.m124022a(f134407d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bord.class});
        } else if (i2 == 3) {
            return new borg();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f134407d;
            }
            bxxk bxxk = f134408e;
            if (bxxk == null) {
                synchronized (borg.class) {
                    bxxk = f134408e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134407d);
                        f134408e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
