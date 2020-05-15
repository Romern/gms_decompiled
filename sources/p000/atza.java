package p000;

import com.google.android.gms.tapandpay.wear.WearProxyCompanionChimeraActivity;

/* renamed from: atza */
public final /* synthetic */ class atza implements Runnable {

    /* renamed from: a */
    private final WearProxyCompanionChimeraActivity f91188a;

    /* renamed from: b */
    private final String f91189b;

    public atza(WearProxyCompanionChimeraActivity wearProxyCompanionChimeraActivity, String str) {
        this.f91188a = wearProxyCompanionChimeraActivity;
        this.f91189b = str;
    }

    public final void run() {
        this.f91188a.mo59505a(this.f91189b);
    }
}
