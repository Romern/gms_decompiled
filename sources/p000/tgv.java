package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tgv */
final /* synthetic */ class tgv implements View.OnClickListener {

    /* renamed from: a */
    private final tgx f45979a;

    /* renamed from: b */
    private final bmxv f45980b;

    public tgv(tgx tgx, bmxv bmxv) {
        this.f45979a = tgx;
        this.f45980b = bmxv;
    }

    public void onClick(View view) {
        tgx tgx = this.f45979a;
        bmxv bmxv = this.f45980b;
        if (bmxv.mo66813a() && ((Intent) bmxv.mo66814b()).resolveActivity(tgx.f45981a.getContext().getPackageManager()) != null) {
            tgx.f45983c.mo26568a(tio.SMART_PROFILE_CURRENT_LOCATION_CARD_MAP_LINK, tio.SMART_PROFILE_CURRENT_LOCATION_CARD);
            tgx.f45981a.getContext().startActivity((Intent) bmxv.mo66814b());
        }
    }
}
