package p000;

import android.view.View;

/* renamed from: owz */
final /* synthetic */ class owz implements View.OnClickListener {

    /* renamed from: a */
    private final oxb f38549a;

    public owz(oxb oxb) {
        this.f38549a = oxb;
    }

    public void onClick(View view) {
        oxb oxb = this.f38549a;
        oxb.mo22762a(bpea.FRX_SCREEN_ACCEPT);
        oxb.mo22763b().mo22754a("EVENT_INTRO_ACKNOWLEDGED");
    }
}
