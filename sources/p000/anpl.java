package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;

/* renamed from: anpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anpl implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ anpm f77397a;

    public anpl(anpm anpm) {
        this.f77397a = anpm;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f77397a.getActivity();
        anpm anpm = this.f77397a;
        return new anrp(activity, anpm.f77413l, anpm.f77414m, anpm.f77411j, 1, anpm.f77404g + anpm.f77405h, null);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        PeopleFeed peopleFeed = (PeopleFeed) obj;
        if (peopleFeed != null) {
            anpb anpb = (anpb) this.f77397a.getListAdapter();
            anpb.f77373r = peopleFeed;
            anpb.f77381z = anpb.mo42057a(anpb.f77373r, anpb.f77372q);
            anpb.mo42068g();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
