package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import java.util.List;

/* renamed from: aqwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqwt implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ aqwv f87002a;

    /* renamed from: b */
    private final bzid f87003b;

    /* renamed from: c */
    private final aqwu f87004c;

    public aqwt(aqwv aqwv, bzid bzid, aqwu aqwu) {
        this.f87002a = aqwv;
        this.f87003b = bzid;
        this.f87004c = aqwu;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        aqwv aqwv = this.f87002a;
        return new aqwi(aqwv.f87006b, aqwv.f87007c, this.f87003b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.f87004c.mo48117a((List) obj);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
