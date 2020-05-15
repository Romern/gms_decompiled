package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import java.util.Set;

/* renamed from: aqwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqwd implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ aqwf f86961a;

    /* renamed from: b */
    private final aqwe f86962b;

    /* renamed from: c */
    private final Set f86963c;

    /* renamed from: d */
    private final boolean f86964d;

    public aqwd(aqwf aqwf, Set set, boolean z, aqwe aqwe) {
        this.f86961a = aqwf;
        this.f86963c = set;
        this.f86964d = z;
        this.f86962b = aqwe;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new aqwh(this.f86961a.f86966b, this.f86963c, this.f86964d);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        int i;
        aqwe aqwe = this.f86962b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        aquw aquw = ((aqut) aqwe).f86857a;
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
