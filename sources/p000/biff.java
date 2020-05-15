package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: biff */
final /* synthetic */ class biff implements aubq {

    /* renamed from: a */
    private final bifg f120437a;

    public biff(bifg bifg) {
        this.f120437a = bifg;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        bifg bifg = this.f120437a;
        if (aucb.mo50384b()) {
            bifg.mo64579b(Status.f30107a);
            return;
        }
        if (Log.isLoggable("Places", 6)) {
            Log.e("Places", "Operation failed: RemovePlaceUpdates", aucb.mo50387e());
        }
        bifg.mo64579b(Status.f30109c);
    }
}
