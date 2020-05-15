package p000;

import android.content.DialogInterface;
import com.google.android.gms.locationsharing.updateshares.people.LocationSharingSelectionChimeraActivity;

/* renamed from: aexf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexf implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ LocationSharingSelectionChimeraActivity f63975a;

    public aexf(LocationSharingSelectionChimeraActivity locationSharingSelectionChimeraActivity) {
        this.f63975a = locationSharingSelectionChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f63975a.getSupportLoaderManager().destroyLoader(0);
        LocationSharingSelectionChimeraActivity locationSharingSelectionChimeraActivity = this.f63975a;
        fxc fxc = locationSharingSelectionChimeraActivity.f79779d;
        if (fxc != null) {
            fxc.mo11452a(locationSharingSelectionChimeraActivity.f79783h);
            this.f63975a.f79783h = null;
        }
    }
}
