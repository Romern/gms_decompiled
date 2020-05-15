package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: bilg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bilg extends rkm {

    /* renamed from: a */
    final /* synthetic */ int f120822a;

    /* renamed from: b */
    final /* synthetic */ String f120823b;

    /* renamed from: c */
    final /* synthetic */ bilk f120824c;

    public bilg(bilk bilk, int i, String str) {
        this.f120824c = bilk;
        this.f120822a = i;
        this.f120823b = str;
    }

    /* renamed from: a */
    public final void mo24826a(Status status) {
        if (Log.isLoggable("Places", 6)) {
            String valueOf = String.valueOf(status.toString());
            Log.e("Places", valueOf.length() == 0 ? new String("Failed to get location details: ") : "Failed to get location details: ".concat(valueOf));
        }
        int i = status.f30115i;
        if (!(i == 7 || i == 8) || this.f120822a <= 1) {
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "Giving up fetching location details.");
            }
            bilh bilh = this.f120824c.f120835f;
            if (bilh != null) {
                bilh.mo64735a(false);
                return;
            }
            return;
        }
        this.f120824c.f120841l = new bilf(this);
        bilk bilk = this.f120824c;
        bilk.f120834e.postDelayed(bilk.f120841l, bilk.f120830a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo24827b(rkk rkk) {
        aeli aeli = (aeli) rkk;
        if (aeli.mo24660a() > 0) {
            this.f120824c.f120838i = ((aeoj) aeli.mo24661a(0)).mo7556bF();
            bilk bilk = this.f120824c;
            bilk.f120839j = null;
            bilk.mo64737a();
        } else {
            mo24826a(new Status(13, "Zero results returned"));
        }
        aeli.mo12460c();
    }
}
