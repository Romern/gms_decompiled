package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.cast.activity.CastNearbyPinChimeraActivity;

/* renamed from: pht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pht implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CastNearbyPinChimeraActivity f39140a;

    public pht(CastNearbyPinChimeraActivity castNearbyPinChimeraActivity) {
        this.f39140a = castNearbyPinChimeraActivity;
    }

    public void onClick(View view) {
        ((phj) this.f39140a.f29865b).f39117f = true;
        Intent a = sbv.m34871a("com.google.android.gms");
        a.addFlags(268468224);
        if (a.resolveActivity(this.f39140a.getPackageManager()) != null) {
            this.f39140a.startActivity(a);
        }
        ((phj) this.f39140a.f29865b).mo23084g();
    }
}
