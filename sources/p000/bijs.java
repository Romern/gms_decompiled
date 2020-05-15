package p000;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: bijs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bijs implements afcs {

    /* renamed from: a */
    final /* synthetic */ LatLngBounds f120738a;

    /* renamed from: b */
    final /* synthetic */ LatLng f120739b;

    /* renamed from: c */
    final /* synthetic */ CharSequence f120740c;

    /* renamed from: d */
    final /* synthetic */ bijw f120741d;

    public bijs(bijw bijw, LatLngBounds latLngBounds, LatLng latLng, CharSequence charSequence) {
        this.f120741d = bijw;
        this.f120738a = latLngBounds;
        this.f120739b = latLng;
        this.f120740c = charSequence;
    }

    /* renamed from: a */
    public final void mo34763a(afcn afcn) {
        afch afch;
        if (this.f120741d.f120746c.getWidth() > 0) {
            afch = afci.m52840a(this.f120738a, this.f120741d.f120746c.getWidth(), this.f120741d.f120746c.getHeight());
        } else {
            afch = afci.m52839a(this.f120739b);
        }
        this.f120741d.mo64690a(this.f120740c, this.f120739b, null, 0.0f, 0.0f, afch, afcn);
    }
}
