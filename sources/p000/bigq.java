package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: bigq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bigq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f120539a;

    /* renamed from: b */
    final /* synthetic */ bigr f120540b;

    public bigq(bigr bigr, Status status) {
        this.f120540b = bigr;
        this.f120539a = status;
    }

    public final void run() {
        bigu bigu = this.f120540b.f120542c;
        Status status = this.f120539a;
        bhzy bhzy = (bhzy) bigu;
        bhzy.f120001a.f120020d = status;
        if (!status.mo17710c()) {
            if (Log.isLoggable("Places", 6)) {
                bioi.m102658a("Places", "Failed to remove all geofences by pending intent.");
            }
            bhzy.f120002b.mo64478c(bhzy.f120001a);
            return;
        }
        bhzy.f120002b.mo64477b(bhzy.f120001a);
    }
}
