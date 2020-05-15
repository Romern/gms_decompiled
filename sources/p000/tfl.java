package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tfl */
final /* synthetic */ class tfl implements View.OnClickListener {

    /* renamed from: a */
    private final tfm f45856a;

    /* renamed from: b */
    private final Intent f45857b;

    public tfl(tfm tfm, Intent intent) {
        this.f45856a = tfm;
        this.f45857b = intent;
    }

    public void onClick(View view) {
        tfm tfm = this.f45856a;
        Intent intent = this.f45857b;
        if (intent.resolveActivity(tfm.f45863f.getPackageManager()) != null) {
            tfm.f45858a.mo26568a(tio.CONTACT_DETAILS_CARD_ADDRESS_LINK, tio.SMART_PROFILE_CONTACT_DETAILS_CARD);
            tfm.f45863f.startActivity(intent);
        }
    }
}
