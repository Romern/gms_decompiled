package p000;

import com.google.android.location.network.NetworkLocationProvider;

/* renamed from: bgfe */
public final /* synthetic */ class bgfe implements bhbz {

    /* renamed from: a */
    private final NetworkLocationProvider f116343a;

    public bgfe(NetworkLocationProvider networkLocationProvider) {
        this.f116343a = networkLocationProvider;
    }

    /* renamed from: b */
    public final void mo62189b(boolean z) {
        NetworkLocationProvider networkLocationProvider = this.f116343a;
        if (networkLocationProvider.f150831h != z) {
            networkLocationProvider.f150831h = z;
            networkLocationProvider.mo70881b(false);
        }
    }
}
