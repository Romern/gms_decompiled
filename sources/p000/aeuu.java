package p000;

import android.view.View;
import com.google.android.gms.locationsharing.settings.LocationShareView;

/* renamed from: aeuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeuu implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ LocationShareView f63871a;

    public aeuu(LocationShareView locationShareView) {
        this.f63871a = locationShareView;
    }

    public void onClick(View view) {
        LocationShareView locationShareView = this.f63871a;
        aeux aeux = locationShareView.f79705f;
        if (aeux != null) {
            aeux.mo34591b(locationShareView.f79700a);
        }
    }
}
