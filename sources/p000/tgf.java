package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tgf */
final /* synthetic */ class tgf implements View.OnClickListener {

    /* renamed from: a */
    private final tgh f45921a;

    /* renamed from: b */
    private final bmxv f45922b;

    public tgf(tgh tgh, bmxv bmxv) {
        this.f45921a = tgh;
        this.f45922b = bmxv;
    }

    public void onClick(View view) {
        tgh tgh = this.f45921a;
        bmxv bmxv = this.f45922b;
        if (bmxv.mo66813a() && ((Intent) bmxv.mo66814b()).resolveActivity(tgh.f45926a.getContext().getPackageManager()) != null) {
            tgh.f45927b.mo26568a(tio.RECENT_INTERACTION_LINK, tio.SMART_PROFILE_RECENT_INTERACTIONS_CARD);
            tgh.f45926a.getContext().startActivity((Intent) bmxv.mo66814b());
        }
    }
}
