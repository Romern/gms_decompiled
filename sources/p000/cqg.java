package p000;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: cqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cqg implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    private final WeakReference f11841a;

    public cqg(cqh cqh) {
        this.f11841a = new WeakReference(cqh);
    }

    public final boolean onPreDraw() {
        cqh cqh = (cqh) this.f11841a.get();
        if (cqh == null || cqh.f11844c.isEmpty()) {
            return true;
        }
        int c = cqh.mo8138c();
        int b = cqh.mo8137b();
        if (!cqh.m7352a(c, b)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(cqh.f11844c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cqe) arrayList.get(i)).mo8122a(c, b);
        }
        cqh.mo8136a();
        return true;
    }
}
