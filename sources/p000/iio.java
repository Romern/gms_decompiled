package p000;

import com.google.android.gms.auth.authzen.legacy.keyservice.AuthZenSecretProviderChimeraService;

/* renamed from: iio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iio extends iik implements aaai {

    /* renamed from: a */
    private final AuthZenSecretProviderChimeraService f21055a;

    /* renamed from: b */
    private final aaag f21056b;

    public iio(AuthZenSecretProviderChimeraService authZenSecretProviderChimeraService, aaag aaag) {
        this.f21055a = authZenSecretProviderChimeraService;
        this.f21056b = aaag;
    }

    /* renamed from: a */
    public final void mo13042a(String str, iim iim) {
        this.f21056b.mo16659a(this.f21055a, new iip(iim, str));
    }
}
