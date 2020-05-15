package p000;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: aqvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqvw implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ aqvx f86946a;

    /* renamed from: b */
    private final String f86947b;

    /* renamed from: c */
    private final aqpn f86948c;

    public aqvw(aqvx aqvx, String str, aqpn aqpn) {
        this.f86946a = aqvx;
        this.f86947b = str;
        this.f86948c = aqpn;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new aqvy(this.f86946a.f86950b, this.f86947b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.f86948c.f86514a.mo48039a(bmxv.m108567c((Bitmap) obj));
    }

    public final void onLoaderReset(Loader loader) {
    }
}
