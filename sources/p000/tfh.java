package p000;

import android.view.View;

/* renamed from: tfh */
final /* synthetic */ class tfh implements View.OnClickListener {

    /* renamed from: a */
    private final tfm f45849a;

    public tfh(tfm tfm) {
        this.f45849a = tfm;
    }

    public void onClick(View view) {
        tfm tfm = this.f45849a;
        if (!tfm.f45864g) {
            tfm.f45858a.mo26568a(tio.SEE_MORE_BUTTON, tio.SMART_PROFILE_CONTACT_DETAILS_CARD);
            tfm.f45864g = true;
            tfm.f45862e.mo18001b();
            tfm.f45859b.mo18005a();
            tfm.f45860c.mo18005a();
            tfm.f45861d.mo18005a();
            return;
        }
        tfm.f45858a.mo26568a(tio.SEE_LESS_BUTTON, tio.SMART_PROFILE_CONTACT_DETAILS_CARD);
        tfm.mo26469a();
    }
}
