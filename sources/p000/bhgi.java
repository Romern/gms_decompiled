package p000;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

/* renamed from: bhgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhgi implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    public ViewGroup.OnHierarchyChangeListener f118595a;

    /* renamed from: b */
    final /* synthetic */ ChipGroup f118596b;

    public bhgi(ChipGroup chipGroup) {
        this.f118596b = chipGroup;
    }

    public final void onChildViewAdded(View view, View view2) {
        if (view == this.f118596b && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                int i = Build.VERSION.SDK_INT;
                view2.setId(View.generateViewId());
            }
            ((Chip) view2).f151142d = this.f118596b.f151158c;
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f118595a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        if (view == this.f118596b && (view2 instanceof Chip)) {
            ((Chip) view2).f151142d = null;
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f118595a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
