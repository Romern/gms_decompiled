package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: aqwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqwk implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ aqwm f86974a;

    /* renamed from: b */
    private final aqwl f86975b;

    /* renamed from: c */
    private boolean f86976c;

    public aqwk(aqwm aqwm, aqwl aqwl) {
        this.f86974a = aqwm;
        this.f86975b = aqwl;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        aqwm aqwm = this.f86974a;
        return new aqwo(aqwm.f86978b, aqwm.f86980d, aqwm.f86981e, aqwm.f86982f, aqwm.f86979c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        aqwn aqwn = (aqwn) obj;
        if (!this.f86976c && aqwn.f86984b == 1) {
            this.f86975b.mo48069a(aqwn.f86983a);
            this.f86976c = true;
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
