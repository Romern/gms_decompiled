package p000;

import android.os.WorkSource;
import com.android.location.provider.ProviderRequestUnbundled;
import com.google.android.location.network.NetworkLocationProvider;

/* renamed from: bgfi */
public final /* synthetic */ class bgfi implements Runnable {

    /* renamed from: a */
    private final NetworkLocationProvider f116347a;

    /* renamed from: b */
    private final ProviderRequestUnbundled f116348b;

    /* renamed from: c */
    private final WorkSource f116349c;

    public bgfi(NetworkLocationProvider networkLocationProvider, ProviderRequestUnbundled providerRequestUnbundled, WorkSource workSource) {
        this.f116347a = networkLocationProvider;
        this.f116348b = providerRequestUnbundled;
        this.f116349c = workSource;
    }

    public final void run() {
        NetworkLocationProvider networkLocationProvider = this.f116347a;
        ProviderRequestUnbundled providerRequestUnbundled = this.f116348b;
        WorkSource workSource = this.f116349c;
        networkLocationProvider.f150832i = providerRequestUnbundled;
        networkLocationProvider.f150833j = workSource;
        networkLocationProvider.mo70881b(true);
    }
}
