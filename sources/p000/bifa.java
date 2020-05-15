package p000;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: bifa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifa extends bien {

    /* renamed from: b */
    private final String f120424b;

    /* renamed from: c */
    private final aenr f120425c;

    /* renamed from: d */
    private final bifo f120426d;

    public bifa(String str, bifo bifo, PlacesParams placesParams, aenr aenr, bidi bidi, bidx bidx, bhpt bhpt) {
        super(67, "proxyRemovePlacefencesByRequest", placesParams, bidi, bidx, "android.permission.ACCESS_FINE_LOCATION", bhpt);
        sdo.m34959a((Object) str);
        sdo.m34974b(!str.isEmpty());
        sdo.m34959a(aenr);
        this.f120426d = bifo;
        this.f120424b = str;
        this.f120425c = aenr;
    }

    /* renamed from: a */
    public final int mo64562a() {
        return 2;
    }

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
        bifo bifo = this.f120426d;
        String str = this.f120424b;
        avwu avwu = bifo.f120464a;
        roz b = rpa.m34196b();
        b.f43472a = new avwj(avwu, str);
        b.f43473b = new Feature[]{avvz.f93998b};
        avwu.mo24732b(b.mo24977a()).mo50371a(new biez(this));
    }

    /* renamed from: b */
    public final void mo64577b(Status status) {
        bioc.m102645a(status.f30115i, status.f30116j, this.f120425c);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo64577b(status);
    }
}
