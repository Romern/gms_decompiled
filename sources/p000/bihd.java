package p000;

import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: bihd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bihd implements afcs {

    /* renamed from: a */
    final /* synthetic */ aelh[] f120591a;

    /* renamed from: b */
    final /* synthetic */ biht f120592b;

    public bihd(biht biht, aelh[] aelhArr) {
        this.f120592b = biht;
        this.f120591a = aelhArr;
    }

    /* renamed from: a */
    public final void mo34763a(afcn afcn) {
        for (int length = this.f120591a.length - 1; length >= 0; length--) {
            aelh aelh = this.f120591a[length];
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.mo43878a(aelh.mo8010d());
            markerOptions.f79902d = afgw.m53067a(this.f120592b.f120616d.mo64607a(aelh));
            markerOptions.mo43877a();
            afhg a = afcn.mo34747a(markerOptions);
            if (a != null) {
                this.f120592b.f120613a.put(a.mo34854b(), aelh);
            }
        }
    }
}
