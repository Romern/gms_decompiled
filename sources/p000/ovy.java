package p000;

import android.view.View;

/* renamed from: ovy */
final /* synthetic */ class ovy implements View.OnClickListener {

    /* renamed from: a */
    private final owc f38515a;

    public ovy(owc owc) {
        this.f38515a = owc;
    }

    public void onClick(View view) {
        owc owc = this.f38515a;
        owc.mo22762a(bpea.FRX_SCREEN_ACCEPT);
        ((oxk) owc.mo22763b().f38582k).mo22671b(true);
        owc.mo22763b().mo22754a("EVENT_CAR_CONNECTION_ALLOWED");
    }
}
