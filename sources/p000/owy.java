package p000;

import android.view.View;

/* renamed from: owy */
final /* synthetic */ class owy implements View.OnClickListener {

    /* renamed from: a */
    private final oxb f38548a;

    public owy(oxb oxb) {
        this.f38548a = oxb;
    }

    public void onClick(View view) {
        oxb oxb = this.f38548a;
        oxb.mo22762a(bpea.FRX_SCREEN_CANCELLED);
        oxb.mo22763b().mo22754a("EVENT_INTRO_DECLINED");
    }
}
