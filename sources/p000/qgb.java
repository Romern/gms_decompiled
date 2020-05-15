package p000;

import java.lang.ref.Reference;

/* renamed from: qgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class qgb {

    /* renamed from: a */
    private Reference f41144a = null;

    /* renamed from: b */
    private final Object f41145b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo23991a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Reference mo24025a(Object obj);

    /* renamed from: b */
    public final Object mo24026b() {
        Object obj;
        Reference reference = this.f41144a;
        Object obj2 = null;
        if (reference != null) {
            obj = reference.get();
        } else {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        synchronized (this.f41145b) {
            Reference reference2 = this.f41144a;
            if (reference2 != null) {
                obj2 = reference2.get();
            }
            if (obj2 == null) {
                obj2 = mo23991a();
                this.f41144a = mo24025a(obj2);
            }
        }
        return obj2;
    }
}
