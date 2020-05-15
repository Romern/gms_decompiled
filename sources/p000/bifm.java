package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: bifm */
final /* synthetic */ class bifm implements aubq {

    /* renamed from: a */
    private final bifn f120457a;

    public bifm(bifn bifn) {
        this.f120457a = bifn;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        bifn bifn = this.f120457a;
        if (aucb.mo50384b()) {
            bifn.mo64582b(Status.f30107a);
            return;
        }
        if (Log.isLoggable("Places", 6)) {
            Log.e("Places", "Operation failed: RequestPlaceUpdates", aucb.mo50387e());
        }
        bifn.mo64582b(Status.f30109c);
    }
}
