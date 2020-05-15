package p000;

import com.google.android.gms.trustlet.onbody.internal.PhonePositionTrustletChimeraService;

/* renamed from: auwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auwf implements bqfp {

    /* renamed from: a */
    final /* synthetic */ PhonePositionTrustletChimeraService f92654a;

    public auwf(PhonePositionTrustletChimeraService phonePositionTrustletChimeraService) {
        this.f92654a = phonePositionTrustletChimeraService;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            this.f92654a.f109254b = bool.booleanValue();
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        PhonePositionTrustletChimeraService.f109253a.mo50710a("Failed to get isUserPresent()", th, new Object[0]).mo50706a();
    }
}
