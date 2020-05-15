package p000;

import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: bimn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bimn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LatLngBounds f120910a;

    /* renamed from: b */
    final /* synthetic */ bimo f120911b;

    public bimn(bimo bimo, LatLngBounds latLngBounds) {
        this.f120911b = bimo;
        this.f120910a = latLngBounds;
    }

    public final void run() {
        bimo bimo = this.f120911b;
        if (bimo.f120915d != null && bimo.f120914c.getWidth() > 0) {
            bimo bimo2 = this.f120911b;
            bimo2.f120915d.mo34749a(afci.m52840a(this.f120910a, bimo2.f120914c.getWidth(), this.f120911b.f120914c.getHeight()));
            return;
        }
        this.f120911b.f120915d.mo34749a(afci.m52839a(this.f120910a.mo43870a()));
    }
}
