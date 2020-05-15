package p000;

import java.lang.ref.WeakReference;

/* renamed from: yzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yzm {

    /* renamed from: a */
    private final C1245ok f54849a = new C1245ok();

    /* renamed from: b */
    private final yzl f54850b;

    public yzm(yzl yzl) {
        this.f54850b = yzl;
    }

    /* renamed from: a */
    public final synchronized Object mo30866a(String str) {
        Object obj;
        WeakReference weakReference = (WeakReference) this.f54849a.get(str);
        if (weakReference != null) {
            obj = weakReference.get();
        } else {
            obj = null;
        }
        if (obj == null) {
            obj = this.f54850b.mo30865a(str);
            this.f54849a.put(str, new WeakReference(obj));
        }
        return obj;
    }
}
