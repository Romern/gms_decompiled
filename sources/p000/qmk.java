package p000;

/* renamed from: qmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qmk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final qmk f41705d;

    /* renamed from: e */
    private static volatile bxxk f41706e;

    /* renamed from: a */
    public bxwc f41707a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f41708b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f41709c = bxxn.f165040b;

    static {
        qmk qmk = new qmk();
        f41705d = qmk;
        bxvk.m124024a(qmk.class, qmk);
    }

    private qmk() {
    }

    /* renamed from: b */
    public final void mo24111b() {
        if (!this.f41708b.mo73666a()) {
            this.f41708b = bxvk.m124021a(this.f41708b);
        }
    }

    /* renamed from: c */
    public final void mo24112c() {
        if (!this.f41709c.mo73666a()) {
            this.f41709c = bxvk.m124021a(this.f41709c);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m32445a(qmk qmk, bojy bojy) {
        bojy.getClass();
        qmk.mo24110a();
        qmk.f41707a.set(0, bojy);
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
            return bxvk.m124022a(f41705d, "\u0001\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0005\u001b", new Object[]{"a", bojy.class, "b", qmt.class, "c", djc.class});
        } else if (i2 == 3) {
            return new qmk();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f41705d;
            }
            bxxk bxxk = f41706e;
            if (bxxk == null) {
                synchronized (qmk.class) {
                    bxxk = f41706e;
                    if (bxxk == null) {
                        bxxk = new bxve(f41705d);
                        f41706e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo24110a() {
        if (!this.f41707a.mo73666a()) {
            this.f41707a = bxvk.m124021a(this.f41707a);
        }
    }
}
