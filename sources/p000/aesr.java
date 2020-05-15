package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.locationsharing.common.model.LocationSharingSettings;

/* renamed from: aesr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aesr implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ aest f63742a;

    public aesr(aest aest) {
        this.f63742a = aest;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        aest aest = this.f63742a;
        return new aesp(aest.f63743a, aest.f63744b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        LocationSharingSettings locationSharingSettings = (LocationSharingSettings) obj;
        this.f63742a.f63746d = locationSharingSettings;
        if (locationSharingSettings.mo43767b()) {
            this.f63742a.f63745c.mo34514a(locationSharingSettings.mo43770e());
        } else {
            this.f63742a.mo34517a();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
