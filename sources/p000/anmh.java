package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: anmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anmh implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ anmo f77128a;

    public anmh(anmo anmo) {
        this.f77128a = anmo;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        anmp b = this.f77128a.f77141b.getItem(i);
        anmo anmo = this.f77128a;
        anmo.f77143d = i;
        ((anmf) anmo).f77123a.mo41938b(rig.f43046n, this.f77128a.mo41944c());
        ((anmf) this.f77128a).f77123a.mo41939b(b.f77150b);
        this.f77128a.f77141b.f77155c = b.f77150b;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
