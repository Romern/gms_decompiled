package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* renamed from: aeha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeha extends aeju {

    /* renamed from: a */
    final /* synthetic */ aucf f63384a;

    public aeha(aucf aucf) {
        this.f63384a = aucf;
    }

    /* renamed from: a */
    public final void mo34142a() {
    }

    /* renamed from: a */
    public final void mo34143a(FusedLocationProviderResult fusedLocationProviderResult) {
        Status status = fusedLocationProviderResult.f79418b;
        if (status == null) {
            this.f63384a.mo50392b((Exception) new rjp(new Status(8, "Got null status from location service")));
        } else if (status.f30115i == 0) {
            this.f63384a.mo50391a((Object) true);
        } else {
            this.f63384a.mo50392b((Exception) rzy.m34725a(status));
        }
    }
}
