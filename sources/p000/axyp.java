package p000;

import java.util.HashMap;

/* renamed from: axyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axyp {

    /* renamed from: a */
    public final boolean f96788a;

    /* renamed from: b */
    final HashMap f96789b;

    public axyp() {
        this(null);
    }

    /* renamed from: a */
    public final axyo mo53771a(Object obj) {
        axyo axyo;
        synchronized (this) {
            axyo = (axyo) this.f96789b.get(obj);
            if (axyo == null) {
                axyo = new axyo(this, obj);
                this.f96789b.put(obj, axyo);
            }
            axyo.f96786c++;
        }
        axyo.f96785b.lock();
        return axyo;
    }

    public axyp(byte[] bArr) {
        this.f96789b = new HashMap();
        this.f96788a = true;
    }
}
