package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.concurrent.TimeoutException;

/* renamed from: biel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biel extends bien {

    /* renamed from: b */
    private final aenr f120387b;

    public biel(PlacesParams placesParams, aenr aenr, bidi bidi, bidx bidx, bhpt bhpt) {
        super(65, "PlacePickerQuota", placesParams, bidi, bidx, "", bhpt);
        sdo.m34959a(aenr);
        this.f120387b = aenr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64562a() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo64563b() {
        return 1;
    }

    /* renamed from: c */
    public final bpqk mo64564c() {
        return null;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        super.mo6502a(context);
        try {
            Status a = mo64567f().mo64491a("placePicker", this.f120388a);
            bioc.m102645a(a.f30115i, a.f30116j, this.f120387b);
        } catch (VolleyError | gid | TimeoutException e) {
            throw bien.m102124a(e);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        bioc.m102645a(status.f30115i, status.f30116j, this.f120387b);
    }
}
