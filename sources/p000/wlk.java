package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: wlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wlk implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ wlp f50831a;

    public wlk(wlp wlp) {
        this.f50831a = wlp;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f50831a.getActivity();
        wlp wlp = this.f50831a;
        return new wnn(activity, wlp.f50836b, wlp.f50835a.mo18479k(), this.f50831a.f50835a.mo18478j());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        if (why.f50696b) {
            brdc brdc = (brdc) why.f50695a;
            wlp wlp = this.f50831a;
            int size = brdc.f142485i.size();
            wlp.f50837c = Integer.valueOf((brdc.f142483g - size) - brdc.f142484h.size());
            this.f50831a.mo29188a();
            return;
        }
        this.f50831a.mo29189b();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
