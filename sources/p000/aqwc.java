package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import java.util.Set;

/* renamed from: aqwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqwc implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ aqwf f86958a;

    /* renamed from: b */
    private final aqwe f86959b;

    /* renamed from: c */
    private final Set f86960c;

    public aqwc(aqwf aqwf, Set set, aqwe aqwe) {
        this.f86958a = aqwf;
        this.f86960c = set;
        this.f86959b = aqwe;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new aqwg(this.f86958a.f86966b, this.f86960c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        int i;
        aqwe aqwe = this.f86959b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        aquw aquw = ((aqus) aqwe).f86856a;
        if (!booleanValue) {
            i = 4;
        } else {
            i = 3;
        }
        aquw.mo48172a(1, i);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
