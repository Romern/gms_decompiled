package p000;

import android.view.View;
import com.google.android.gms.common.Feature;

/* renamed from: amsv */
final /* synthetic */ class amsv implements View.OnClickListener {

    /* renamed from: a */
    private final amti f75882a;

    public amsv(amti amti) {
        this.f75882a = amti;
    }

    public void onClick(View view) {
        amti amti = this.f75882a;
        if (amti.f75899c.isChecked()) {
            if (cfus.m143105c()) {
                new amsu(amti.getActivity()).mo41314a(amti.f75897a.name, false, 8);
            }
            amtn amtn = amti.f75898b.f75941f;
            adch adch = new adch();
            alsl alsl = amtn.f75916a;
            roz b = rpa.m34196b();
            b.f43472a = new alsu();
            b.f43473b = new Feature[]{alks.f73599b};
            aucb b2 = ((rjx) alsl).mo24732b(b.mo24977a());
            adch.getClass();
            b2.mo50371a(new amtk(adch));
            adch.mo2445a(amti, new amtf(amti));
            return;
        }
        amti.mo41322a(2);
    }
}
