package p000;

import android.view.View;

/* renamed from: tge */
final /* synthetic */ class tge implements View.OnClickListener {

    /* renamed from: a */
    private final tgh f45920a;

    public tge(tgh tgh) {
        this.f45920a = tgh;
    }

    public void onClick(View view) {
        tgh tgh = this.f45920a;
        if (!tgh.f45930e) {
            tgh.f45927b.mo26568a(tio.SEE_MORE_BUTTON, tio.SMART_PROFILE_RECENT_INTERACTIONS_CARD);
            tgh.f45930e = true;
            tgh.f45929d.mo18001b();
            tgh.f45928c.mo18005a();
            return;
        }
        tgh.f45927b.mo26568a(tio.SEE_LESS_BUTTON, tio.SMART_PROFILE_RECENT_INTERACTIONS_CARD);
        tgh.mo26488a();
    }
}
