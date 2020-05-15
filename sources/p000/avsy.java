package p000;

import java.lang.ref.Reference;

/* renamed from: avsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avsy {

    /* renamed from: a */
    private Reference f93876a = null;

    /* renamed from: b */
    private final Object f93877b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo51375a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Reference mo51588a(Object obj);

    /* renamed from: b */
    public final Object mo51589b() {
        Object obj;
        Reference reference = this.f93876a;
        Object obj2 = null;
        if (reference != null) {
            obj = reference.get();
        } else {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        synchronized (this.f93877b) {
            Reference reference2 = this.f93876a;
            if (reference2 != null) {
                obj2 = reference2.get();
            }
            if (obj2 == null) {
                obj2 = mo51375a();
                this.f93876a = mo51588a(obj2);
            }
        }
        return obj2;
    }
}
