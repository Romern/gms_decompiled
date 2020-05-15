package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnDeviceUsagePreferenceResponse;
import com.google.android.gms.drive.internal.OnPinnedDownloadPreferencesResponse;

/* renamed from: usc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class usc extends utn {

    /* renamed from: a */
    private final rlf f48591a;

    /* renamed from: a */
    public final void mo27107a(Status status) {
        this.f48591a.mo9482a(new usd(status, null));
    }

    public usc(rlf rlf) {
        this.f48591a = rlf;
    }

    /* renamed from: a */
    public final void mo27948a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse) {
        this.f48591a.mo9482a(new usd(Status.f30107a, new txi(onDeviceUsagePreferenceResponse.f30874a).mo26871a()));
    }

    /* renamed from: a */
    public final void mo27949a(OnPinnedDownloadPreferencesResponse onPinnedDownloadPreferencesResponse) {
        this.f48591a.mo9482a(new usd(Status.f30107a, onPinnedDownloadPreferencesResponse.f30894a));
    }
}
