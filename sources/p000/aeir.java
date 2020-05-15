package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: aeir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeir implements rlf {

    /* renamed from: a */
    private final aucf f63427a;

    public aeir(aucf aucf) {
        this.f63427a = aucf;
    }

    /* renamed from: a */
    public final void mo9481a(Status status) {
        this.f63427a.mo50390a((Exception) new rjp(status));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) obj;
        Status status = locationSettingsResult.f79366a;
        if (status.mo17710c()) {
            this.f63427a.mo50391a(new rkj(locationSettingsResult));
        } else if (status.mo17709b()) {
            this.f63427a.mo50390a((Exception) new rki(status));
        } else {
            this.f63427a.mo50390a((Exception) new rjp(status));
        }
    }
}
