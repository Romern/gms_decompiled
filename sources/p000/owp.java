package p000;

import android.view.View;

/* renamed from: owp */
final /* synthetic */ class owp implements View.OnClickListener {

    /* renamed from: a */
    private final owq f38527a;

    public owp(owq owq) {
        this.f38527a = owq;
    }

    public void onClick(View view) {
        owq owq = this.f38527a;
        owq.mo22762a(bpea.FRX_SCREEN_CANCELLED);
        owq.mo22763b().mo22754a("EVENT_INTRO_DECLINED");
    }
}
