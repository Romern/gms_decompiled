package p000;

import android.view.View;

/* renamed from: agtz */
final /* synthetic */ class agtz implements View.OnClickListener {

    /* renamed from: a */
    private final agub f66555a;

    public agtz(agub agub) {
        this.f66555a = agub;
    }

    public void onClick(View view) {
        agub agub = this.f66555a;
        agrl.m54942a().mo35987a(30, agub.f66558a.getText().toString(), agvn.m55186b(view), bygd.CLICK_CONSENT_AGREE, System.currentTimeMillis(), Integer.valueOf(agub.f66561d));
        agub.mo36111b(true);
    }
}
