package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: anml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anml implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ anmo f77138a;

    public anml(anmo anmo) {
        this.f77138a = anmo;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        anmp b = this.f77138a.f77142c.getItem(i);
        ((anmf) this.f77138a).f77123a.mo41938b(rig.f43045m, this.f77138a.mo41944c());
        this.f77138a.mo41952c(b.f77149a);
        this.f77138a.f77142c.mo41956a(b.f77149a);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
