package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tgu */
final /* synthetic */ class tgu implements View.OnClickListener {

    /* renamed from: a */
    private final tgx f45977a;

    /* renamed from: b */
    private final Intent f45978b;

    public tgu(tgx tgx, Intent intent) {
        this.f45977a = tgx;
        this.f45978b = intent;
    }

    public void onClick(View view) {
        tgx tgx = this.f45977a;
        Intent intent = this.f45978b;
        if (intent.resolveActivity(tgx.f45981a.getContext().getPackageManager()) != null) {
            tgx.f45983c.mo26568a(tio.SMART_PROFILE_CURRENT_LOCATION_CARD_NAVIGATION_LINK, tio.SMART_PROFILE_CURRENT_LOCATION_CARD);
            tgx.f45981a.getContext().startActivity(intent);
        }
    }
}
