package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.model.ProfileData;

/* renamed from: wlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wlo implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ wlp f50834a;

    public wlo(wlp wlp) {
        this.f50834a = wlp;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new wmq(this.f50834a.getActivity(), this.f50834a.f50836b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        if (!why.f50696b) {
            this.f50834a.f50835a.mo18443b().mo29111a(3, 16, "InvitationIntroFragment");
            wgm.m41916a(this.f50834a.getActivity(), new wlm(this), new wln(this)).show();
            return;
        }
        wlp wlp = this.f50834a;
        wlp.f50840f = (ProfileData) why.f50695a;
        wlp.mo29188a();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
