package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tfi */
final /* synthetic */ class tfi implements View.OnClickListener {

    /* renamed from: a */
    private final tfm f45850a;

    /* renamed from: b */
    private final Intent f45851b;

    public tfi(tfm tfm, Intent intent) {
        this.f45850a = tfm;
        this.f45851b = intent;
    }

    public void onClick(View view) {
        tfm tfm = this.f45850a;
        Intent intent = this.f45851b;
        if (intent.resolveActivity(tfm.f45863f.getPackageManager()) != null) {
            tfm.f45858a.mo26568a(tio.SMART_PROFILE_CONTACT_DETAILS_CARD_EMAIL_LINK, tio.SMART_PROFILE_CONTACT_DETAILS_CARD);
            tfm.f45863f.startActivity(intent);
        }
    }
}
