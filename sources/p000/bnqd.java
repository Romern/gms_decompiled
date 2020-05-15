package p000;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: bnqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnqd implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: f */
    final Object f131983f;

    /* renamed from: g */
    final Object f131984g;

    public bnqd(Object obj, Object obj2) {
        bmxy.m108581a(obj);
        this.f131983f = obj;
        this.f131984g = obj2 == null ? this : obj2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f131984g) {
            objectOutputStream.defaultWriteObject();
        }
    }

    public final String toString() {
        String obj;
        synchronized (this.f131984g) {
            obj = this.f131983f.toString();
        }
        return obj;
    }
}
