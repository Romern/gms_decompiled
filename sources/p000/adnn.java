package p000;

import com.google.android.gms.ipa.base.IpaInitIntentOperation;

/* renamed from: adnn */
public final /* synthetic */ class adnn implements Runnable {

    /* renamed from: a */
    private final adnd f62226a;

    public adnn(adnd adnd) {
        this.f62226a = adnd;
    }

    public final void run() {
        adnd adnd = this.f62226a;
        int i = IpaInitIntentOperation.f79257a;
        try {
            adnd.mo33672a();
        } catch (Exception e) {
            adns.m50862a().mo33690a(49);
        }
    }
}
