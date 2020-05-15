package p000;

import android.widget.ArrayAdapter;
import com.google.android.chimera.Fragment;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import java.util.Collections;

/* renamed from: bihx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bihx extends bihy {

    /* renamed from: a */
    final /* synthetic */ biij f120643a;

    public bihx(biij biij) {
        this.f120643a = biij;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo64637b(rkk rkk) {
        aekx aekx = (aekx) rkk;
        if (this.f120643a.f120657d != null && aekx.mo7183bo().mo17710c()) {
            biig biig = this.f120643a.f120657d;
            int i = biij.f120652q;
            int a = aekx.mo24660a();
            AutocompletePredictionEntity[] autocompletePredictionEntityArr = new AutocompletePredictionEntity[a];
            for (int i2 = 0; i2 < aekx.mo24660a(); i2++) {
                autocompletePredictionEntityArr[i2] = (AutocompletePredictionEntity) aekx.mo24661a(i2).mo7556bF();
            }
            if (((Fragment) biig).isVisible()) {
                biiv biiv = (biiv) biig;
                biiv.mo64664c();
                if (biiv.f120688d instanceof ArrayAdapter) {
                    biiv.f120687c.clear();
                    Collections.addAll(biiv.f120687c, autocompletePredictionEntityArr);
                    ((ArrayAdapter) biiv.f120688d).notifyDataSetChanged();
                    if (a <= 0) {
                        biiv.f120686b.setVisibility(8);
                    } else {
                        biiv.f120686b.setVisibility(0);
                    }
                }
            }
        }
    }
}
