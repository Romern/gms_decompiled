package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tfj */
final /* synthetic */ class tfj implements View.OnClickListener {

    /* renamed from: a */
    private final tfm f45852a;

    /* renamed from: b */
    private final Intent f45853b;

    public tfj(tfm tfm, Intent intent) {
        this.f45852a = tfm;
        this.f45853b = intent;
    }

    public void onClick(View view) {
        tfm tfm = this.f45852a;
        Intent intent = this.f45853b;
        if (intent.resolveActivity(tfm.f45863f.getPackageManager()) != null) {
            tfm.f45858a.mo26568a(tio.CONTACT_DETAILS_CARD_CALL_PHONE_LINK, tio.SMART_PROFILE_CONTACT_DETAILS_CARD);
            tfm.f45863f.startActivity(intent);
        }
    }
}
