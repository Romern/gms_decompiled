package p000;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: aik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aik implements C1270pi {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f594a;

    public aik(CoordinatorLayout coordinatorLayout) {
        this.f594a = coordinatorLayout;
    }

    /* renamed from: a */
    public final C1296qh mo761a(View view, C1296qh qhVar) {
        boolean z;
        CoordinatorLayout coordinatorLayout = this.f594a;
        if (!C1239oe.m19757a(coordinatorLayout.f1487g, qhVar)) {
            coordinatorLayout.f1487g = qhVar;
            int b = qhVar.mo15733b();
            boolean z2 = true;
            if (b <= 0) {
                z = false;
            } else {
                z = true;
            }
            coordinatorLayout.f1488h = z;
            if (b > 0 || coordinatorLayout.getBackground() != null) {
                z2 = false;
            }
            coordinatorLayout.setWillNotDraw(z2);
            if (!qhVar.mo15739f()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (C1280ps.m19938t(childAt) && ((aip) childAt.getLayoutParams()).f596a != null && qhVar.mo15739f()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return qhVar;
    }
}
