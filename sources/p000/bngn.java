package p000;

import java.io.Serializable;

/* renamed from: bngn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bngn extends bndi implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Object f131599a;

    /* renamed from: b */
    final Object f131600b;

    public bngn(Object obj, Object obj2) {
        this.f131599a = obj;
        this.f131600b = obj2;
    }

    public final Object getKey() {
        return this.f131599a;
    }

    public final Object getValue() {
        return this.f131600b;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
