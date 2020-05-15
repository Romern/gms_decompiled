package p000;

import android.os.Build;
import android.view.ViewTreeObserver;

/* renamed from: anpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anpz implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ anqe f77427a;

    public anpz(anqe anqe) {
        this.f77427a = anqe;
    }

    public final void onGlobalLayout() {
        int i = Build.VERSION.SDK_INT;
        this.f77427a.f77435h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        anqe anqe = this.f77427a;
        anqe.f77445r = anqe.f77435h.getMeasuredHeight();
        anqe anqe2 = this.f77427a;
        anqe2.f77446s = anqe2.f77435h.getMeasuredWidth();
        anqe anqe3 = this.f77427a;
        if (anqe3.f77449v) {
            anqe3.mo42088b(anqe3.f77447t);
        }
    }
}
