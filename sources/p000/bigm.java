package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: bigm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bigm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f120529a;

    /* renamed from: b */
    final /* synthetic */ bign f120530b;

    public bigm(bign bign, Status status) {
        this.f120530b = bign;
        this.f120529a = status;
    }

    public final void run() {
        bigu bigu = this.f120530b.f120532c;
        Status status = this.f120529a;
        bhzu bhzu = (bhzu) bigu;
        bhzu.f119998a.f120020d = status;
        if (!status.mo17710c()) {
            if (Log.isLoggable("Places", 6)) {
                bioi.m102658a("Places", String.format("Failed to add %d geofences due to error: %s. Currently tracking %d geofences.", Integer.valueOf(bhzu.f119998a.f120019c.size()), aehg.m51838a(status.f30115i), Integer.valueOf(bhzu.f119998a.f120022f.size())));
            }
            bhzu.f119999b.mo64478c(bhzu.f119998a);
            return;
        }
        bhzu.f119999b.mo64477b(bhzu.f119998a);
    }
}
