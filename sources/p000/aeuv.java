package p000;

import android.view.View;
import com.google.android.gms.locationsharing.settings.LocationShareView;

/* renamed from: aeuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeuv implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ LocationShareView f63872a;

    public aeuv(LocationShareView locationShareView) {
        this.f63872a = locationShareView;
    }

    public void onClick(View view) {
        LocationShareView locationShareView = this.f63872a;
        aeux aeux = locationShareView.f79705f;
        if (aeux != null) {
            aeux.mo34590a(locationShareView.f79700a);
        }
    }
}
