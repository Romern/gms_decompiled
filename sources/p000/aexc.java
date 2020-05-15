package p000;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.gms.locationsharing.updateshares.people.LocationSharingSelectionChimeraActivity;

/* renamed from: aexc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexc implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ LocationSharingSelectionChimeraActivity f63972a;

    public aexc(LocationSharingSelectionChimeraActivity locationSharingSelectionChimeraActivity) {
        this.f63972a = locationSharingSelectionChimeraActivity;
    }

    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.f63972a.f79782g;
        if (viewGroup == null) {
            return;
        }
        if (viewGroup.getRootView().getHeight() - this.f63972a.f79782g.getHeight() > this.f63972a.getWindow().findViewById(16908290).getHeight()) {
            this.f63972a.f79778c.setVisibility(8);
        } else {
            this.f63972a.mo43830g();
        }
    }
}
