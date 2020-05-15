package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: biip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class biip implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ biiv f120678a;

    public biip(biiv biiv) {
        this.f120678a = biiv;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        aekw aekw = (aekw) adapterView.getItemAtPosition(i);
        if (aekw.mo34282d() == null) {
            this.f120678a.mo64660a(aekw.mo34279a(), true);
            return;
        }
        this.f120678a.mo64660a(aekw.mo34279a(), false);
        biiv biiv = this.f120678a;
        String d = aekw.mo34282d();
        biiv.mo64662b();
        if (biiv.f120691g != null) {
            biiv.f120685a.setVisibility(0);
            biij biij = biiv.f120691g;
            biij.f120661h = biiv;
            biij.mo64648a(new String[]{d});
        }
        biiv.mo64666f();
    }
}
