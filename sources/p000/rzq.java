package p000;

import java.lang.ref.WeakReference;

/* renamed from: rzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rzq {

    /* renamed from: b */
    private static volatile WeakReference f43899b = new WeakReference(null);

    /* renamed from: a */
    public cijl f43900a;

    public rzq() {
    }

    /* renamed from: a */
    public static rzq m34710a() {
        rzq rzq = (rzq) f43899b.get();
        if (rzq == null) {
            synchronized (rzq.class) {
                rzq = (rzq) f43899b.get();
                if (rzq == null) {
                    rzq = new rzq(null);
                    f43899b = new WeakReference(rzq);
                }
            }
        }
        return rzq;
    }

    public rzq(byte[] bArr) {
        this.f43900a = cayx.m127579a(rzr.f43901a);
    }
}
