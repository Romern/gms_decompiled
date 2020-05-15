package p000;

import com.google.android.gms.ipa.base.IpaGcmTaskChimeraService;

/* renamed from: adnl */
public final /* synthetic */ class adnl implements Runnable {

    /* renamed from: a */
    private final IpaGcmTaskChimeraService f62224a;

    public adnl(IpaGcmTaskChimeraService ipaGcmTaskChimeraService) {
        this.f62224a = ipaGcmTaskChimeraService;
    }

    public final void run() {
        adnd a = adnd.m50837a(this.f62224a);
        if (a != null) {
            a.mo33673b();
        }
    }
}
