package p000;

import android.view.View;

/* renamed from: owm */
final /* synthetic */ class owm implements View.OnClickListener {

    /* renamed from: a */
    private final owo f38525a;

    public owm(owo owo) {
        this.f38525a = owo;
    }

    public void onClick(View view) {
        owo owo = this.f38525a;
        owo.mo22762a(bpea.FRX_SCREEN_CANCELLED);
        owo.mo22763b().mo22754a("EVENT_INTRO_DECLINED");
    }
}
