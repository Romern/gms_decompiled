package p000;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bimf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bimf implements bimt, afcm {

    /* renamed from: a */
    private final bimy f120899a;

    /* renamed from: b */
    private final bimo f120900b;

    /* renamed from: c */
    private final Map f120901c = new HashMap();

    /* renamed from: d */
    private final bihb f120902d;

    public bimf(bimy bimy, bimo bimo, bihb bihb) {
        this.f120899a = bimy;
        this.f120900b = bimo;
        this.f120902d = bihb;
    }

    /* renamed from: a */
    public final void mo64751a(List list) {
        afhg afhg;
        this.f120900b.mo64764a();
        this.f120901c.clear();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aelh aelh = (aelh) list.get(i);
            Bitmap a = this.f120902d.mo64607a(aelh);
            bimo bimo = this.f120900b;
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.mo43878a(aelh.mo8010d());
            markerOptions.mo43877a();
            markerOptions.f79902d = afgw.m53067a(a);
            afcn afcn = bimo.f120915d;
            if (afcn != null) {
                afhg = afcn.mo34747a(markerOptions);
                bimo.f120920i.add(afhg);
            } else {
                afhg = null;
            }
            if (afhg != null) {
                this.f120901c.put(afhg, aelh);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo34745a(afhg afhg) {
        aelh aelh = (aelh) this.f120901c.get(afhg);
        if (aelh == null) {
            return false;
        }
        this.f120899a.mo64773a(aelh);
        return true;
    }
}
