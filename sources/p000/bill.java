package p000;

import android.view.View;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.maps.model.LatLng;
import java.util.Collections;
import java.util.Locale;

/* renamed from: bill */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bill implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bilq f120843a;

    public bill(bilq bilq) {
        this.f120843a = bilq;
    }

    public void onClick(View view) {
        bilk bilk = this.f120843a.f120846a;
        aelh aelh = bilk.f120836g;
        if (aelh == null) {
            aelh aelh2 = bilk.f120838i;
            if (aelh2 == null) {
                bine bine = bilk.f120831b;
                LatLng latLng = bilk.f120837h;
                String a = awm.m2271a(latLng.f79894a, latLng.f79895b);
                aeob aeob = new aeob();
                aeob.f63547a = a;
                aeob.f63549c = latLng;
                aeob.f63557k = Collections.singletonList(0);
                aeob.f63548b = "";
                aeob.f63558l = "";
                aeob.f63556j = -1;
                aeob.f63555i = -1.0f;
                PlaceEntity a2 = aeob.mo34381a();
                a2.f79552r = Locale.getDefault();
                bine.mo64791b(a2);
                return;
            }
            bilk.f120831b.mo64791b(aelh2);
            return;
        }
        bilk.f120831b.mo64791b(aelh);
    }
}
