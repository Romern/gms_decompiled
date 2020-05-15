package p000;

import com.google.android.gms.tapandpay.wear.WearProxyChimeraActivity;

/* renamed from: atyt */
public final /* synthetic */ class atyt implements Runnable {

    /* renamed from: a */
    private final WearProxyChimeraActivity f91176a;

    public atyt(WearProxyChimeraActivity wearProxyChimeraActivity) {
        this.f91176a = wearProxyChimeraActivity;
    }

    public final void run() {
        WearProxyChimeraActivity wearProxyChimeraActivity = this.f91176a;
        ((bnsl) WearProxyChimeraActivity.f108972b.mo68388c()).mo68405a("Timed out on tokenization. Finishing activity");
        wearProxyChimeraActivity.setResult(2);
        wearProxyChimeraActivity.finish();
    }
}
