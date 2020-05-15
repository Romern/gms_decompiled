package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: aqtf */
final /* synthetic */ class aqtf implements View.OnClickListener {

    /* renamed from: a */
    private final aqtg f86748a;

    /* renamed from: b */
    private final Intent f86749b;

    /* renamed from: c */
    private final tio f86750c;

    public aqtf(aqtg aqtg, Intent intent, tio tio) {
        this.f86748a = aqtg;
        this.f86749b = intent;
        this.f86750c = tio;
    }

    public void onClick(View view) {
        aqtg aqtg = this.f86748a;
        Intent intent = this.f86749b;
        tio tio = this.f86750c;
        if (intent.resolveActivity(aqtg.f86751a.getPackageManager()) != null) {
            aqtg.f86753c.mo26568a(tio, tio.SMART_PROFILE_CONTACT_DETAILS_CARD);
            aqtg.f86751a.startActivity(intent);
        }
    }
}
