package p000;

import com.google.android.location.network.NetworkLocationProvider;

/* renamed from: bgfh */
public final /* synthetic */ class bgfh implements Runnable {

    /* renamed from: a */
    private final NetworkLocationProvider f116346a;

    public bgfh(NetworkLocationProvider networkLocationProvider) {
        this.f116346a = networkLocationProvider;
    }

    public final void run() {
        this.f116346a.mo70879a();
    }
}
