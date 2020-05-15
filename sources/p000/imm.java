package p000;

import java.lang.ref.Reference;

/* renamed from: imm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class imm {

    /* renamed from: a */
    private final Object f21363a = new Object();

    /* renamed from: b */
    private volatile Reference f21364b = null;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo11987a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Reference mo13144a(Object obj);

    /* renamed from: b */
    public final Object mo13145b() {
        Object obj;
        Object obj2 = null;
        if (this.f21364b != null) {
            obj = this.f21364b.get();
        } else {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        synchronized (this.f21363a) {
            if (this.f21364b != null) {
                obj2 = this.f21364b.get();
            }
            if (obj2 == null) {
                obj2 = mo11987a();
                this.f21364b = mo13144a(obj2);
            }
        }
        return obj2;
    }
}
