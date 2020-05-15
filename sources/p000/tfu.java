package p000;

import android.view.View;

/* renamed from: tfu */
final /* synthetic */ class tfu implements View.OnClickListener {

    /* renamed from: a */
    private final tfv f45887a;

    public tfu(tfv tfv) {
        this.f45887a = tfv;
    }

    public void onClick(View view) {
        tfv tfv = this.f45887a;
        if (!tfv.f45888a) {
            tfv.f45892e.mo26568a(tio.SEE_MORE_BUTTON, tio.SMART_PROFILE_ORGANIZATIONS_CARD);
            tfv.f45888a = true;
            tfv.f45891d.mo18001b();
            tfv.f45889b.mo18005a();
            tfv.f45890c.mo18005a();
            return;
        }
        tfv.f45892e.mo26568a(tio.SEE_LESS_BUTTON, tio.SMART_PROFILE_ORGANIZATIONS_CARD);
        tfv.mo26478a();
    }
}
