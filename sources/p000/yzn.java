package p000;

import java.lang.ref.WeakReference;

/* renamed from: yzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yzn {

    /* renamed from: a */
    private WeakReference f54851a = null;

    /* renamed from: b */
    private final bmzi f54852b;

    public yzn(bmzi bmzi) {
        this.f54852b = bmzi;
    }

    /* renamed from: a */
    public final synchronized Object mo30867a() {
        Object obj;
        WeakReference weakReference = this.f54851a;
        if (weakReference != null) {
            obj = weakReference.get();
        } else {
            obj = null;
        }
        if (obj == null) {
            obj = this.f54852b.mo6606a();
            this.f54851a = new WeakReference(obj);
        }
        return obj;
    }
}
