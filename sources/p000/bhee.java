package p000;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: bhee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhee implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bhef f118362a;

    /* renamed from: b */
    private final CoordinatorLayout f118363b;

    /* renamed from: c */
    private final View f118364c;

    public bhee(bhef bhef, CoordinatorLayout coordinatorLayout, View view) {
        this.f118362a = bhef;
        this.f118363b = coordinatorLayout;
        this.f118364c = view;
    }

    public final void run() {
        OverScroller overScroller;
        if (this.f118364c != null && (overScroller = this.f118362a.f118367c) != null) {
            if (overScroller.computeScrollOffset()) {
                bhef bhef = this.f118362a;
                bhef.mo63591b(this.f118363b, this.f118364c, bhef.f118367c.getCurrY());
                C1280ps.m19891a(this.f118364c, this);
                return;
            }
            this.f118362a.mo63590b(this.f118363b, this.f118364c);
        }
    }
}
