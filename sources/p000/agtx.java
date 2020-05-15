package p000;

import android.view.View;

/* renamed from: agtx */
final /* synthetic */ class agtx implements View.OnClickListener {

    /* renamed from: a */
    private final agub f66553a;

    public agtx(agub agub) {
        this.f66553a = agub;
    }

    public void onClick(View view) {
        agub agub = this.f66553a;
        agrl.m54942a().mo35987a(29, agub.f66558a.getText().toString(), agvn.m55186b(view), bygd.CLICK_CONSENT_CONTINUE, System.currentTimeMillis(), Integer.valueOf(agub.f66561d));
        if (!agub.f66560c.pageDown(false)) {
            agub.mo36110a(true);
        }
    }
}
