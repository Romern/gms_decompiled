package p000;

import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: jpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jpf implements bqfp {

    /* renamed from: a */
    final /* synthetic */ FirstPartyDeviceRegistrationChimeraService f22968a;

    public jpf(FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService) {
        this.f22968a = firstPartyDeviceRegistrationChimeraService;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Status status = (Status) obj;
        FirstPartyDeviceRegistrationChimeraService.m6796a(this.f22968a);
        this.f22968a.mo7799a();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        FirstPartyDeviceRegistrationChimeraService.m6796a(this.f22968a);
        FirstPartyDeviceRegistrationChimeraService.f11168a.mo25417e("Registration fail", th, new Object[0]);
        this.f22968a.mo7799a();
    }
}
