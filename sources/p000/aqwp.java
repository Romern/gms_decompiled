package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import java.util.List;

/* renamed from: aqwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqwp implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ aqwq f86990a;

    public aqwp(aqwq aqwq) {
        this.f86990a = aqwq;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        aqwq aqwq = this.f86990a;
        return new aqws(aqwq.f86991a, aqwq.f86992b, aqwq.f86993c, aqwq.f86994d);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        aqwr aqwr = (aqwr) obj;
        aqwq aqwq = this.f86990a;
        aqwq.f86997g = aqwr;
        List list = aqwq.f86996f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((aqqm) list.get(i)).mo48078a(aqwr);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
