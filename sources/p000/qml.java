package p000;

/* renamed from: qml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qml extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final qml f41710b;

    /* renamed from: c */
    private static volatile bxxk f41711c;

    /* renamed from: a */
    public bxwc f41712a = bxxn.f165040b;

    static {
        qml qml = new qml();
        f41710b = qml;
        GeneratedMessageLite.m124024a(qml.class, qml);
    }

    private qml() {
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
            return GeneratedMessageLite.m124022a(f41710b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", qmk.class});
        } else if (i2 == 3) {
            return new qml();
        } else {
            if (i2 == 4) {
                return new bxvd(f41710b);
            }
            if (i2 == 5) {
                return f41710b;
            }
            bxxk bxxk = f41711c;
            if (bxxk == null) {
                synchronized (qml.class) {
                    bxxk = f41711c;
                    if (bxxk == null) {
                        bxxk = new bxve(f41710b);
                        f41711c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
