package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: aio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aio implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f595a;

    public aio(CoordinatorLayout coordinatorLayout) {
        this.f595a = coordinatorLayout;
    }

    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f595a.f1489i;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        this.f595a.mo1870a(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f595a.f1489i;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
