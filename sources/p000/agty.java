package p000;

import android.view.View;

/* renamed from: agty */
final /* synthetic */ class agty implements View.OnClickListener {

    /* renamed from: a */
    private final agub f66554a;

    public agty(agub agub) {
        this.f66554a = agub;
    }

    public void onClick(View view) {
        agub agub = this.f66554a;
        agrl.m54942a().mo35987a(28, agub.f66559b.getText().toString(), agvn.m55186b(view), bygd.CLICK_CONSENT_DECLINE, System.currentTimeMillis(), Integer.valueOf(agub.f66561d));
        agub.mo36111b(false);
    }
}
