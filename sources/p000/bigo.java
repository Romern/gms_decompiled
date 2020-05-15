package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: bigo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bigo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f120534a;

    /* renamed from: b */
    final /* synthetic */ bigp f120535b;

    public bigo(bigp bigp, Status status) {
        this.f120535b = bigp;
        this.f120534a = status;
    }

    public final void run() {
        bigu bigu = this.f120535b.f120537c;
        Status status = this.f120534a;
        bhzz bhzz = (bhzz) bigu;
        bhzz.f120003a.f120020d = status;
        if (!status.mo17710c()) {
            if (Log.isLoggable("Places", 6)) {
                bioi.m102658a("Places", String.format("Failed to remove %d geofences due to error: %s. Currently tracking %d.", Integer.valueOf(bhzz.f120003a.f120018b.size()), aehg.m51838a(status.f30115i), Integer.valueOf(bhzz.f120003a.f120022f.size())));
            }
            bhzz.f120004b.mo64478c(bhzz.f120003a);
            return;
        }
        bhzz.f120004b.mo64475a(bhzz.f120003a);
    }
}
