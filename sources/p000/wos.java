package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: wos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wos implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ wot f51043a;

    /* renamed from: b */
    private final brcm f51044b;

    /* renamed from: c */
    private final String f51045c;

    public wos(wot wot, String str, brcm brcm) {
        this.f51043a = wot;
        this.f51044b = brcm;
        this.f51045c = str;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f51043a.getActivity();
        wot wot = this.f51043a;
        return new wqi(activity, wot.f51049d, wot.f51048c.mo18479k(), this.f51043a.f51048c.mo18478j(), this.f51045c, this.f51044b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.f51043a.mo29254g();
        if (((why) obj).f50696b) {
            wor wor = this.f51043a.f51048c;
            if (wor != null) {
                wor.mo18526h();
            }
            this.f51043a.mo29247a();
            return;
        }
        this.f51043a.mo29252e();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
