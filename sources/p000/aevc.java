package p000;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.locationsharing.common.model.LocationShare;
import com.google.android.gms.locationsharing.settings.LocationSharingSettingsChimeraActivity;

/* renamed from: aevc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aevc implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ LocationSharingSettingsChimeraActivity f63880a;

    public aevc(LocationSharingSettingsChimeraActivity locationSharingSettingsChimeraActivity) {
        this.f63880a = locationSharingSettingsChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        LocationSharingSettingsChimeraActivity locationSharingSettingsChimeraActivity = this.f63880a;
        return new aevi(locationSharingSettingsChimeraActivity, locationSharingSettingsChimeraActivity.f79709c, (LocationShare) bundle.getParcelable("target_location_share"));
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Boolean bool = (Boolean) obj;
        if (!this.f63880a.f79712f.mo34534a()) {
            this.f63880a.mo43808b(false);
        }
        aevi aevi = (aevi) loader;
        LocationSharingSettingsChimeraActivity locationSharingSettingsChimeraActivity = this.f63880a;
        aevi.m52590a(aevi.getContext(), ((aesx) aevi).f63753a, locationSharingSettingsChimeraActivity.f79708b, aevi.f63889b, bool.booleanValue(), locationSharingSettingsChimeraActivity.findViewById(C0126R.C0129id.coordinator_layout));
        if (!bool.booleanValue()) {
            aexq.m52658a(this.f63880a);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
