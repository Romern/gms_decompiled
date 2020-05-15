package p000;

import android.view.View;

/* renamed from: bimh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bimh implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bimo f120904a;

    public bimh(bimo bimo) {
        this.f120904a = bimo;
    }

    public void onClick(View view) {
        bimy bimy = this.f120904a.f120912a;
        if (bimy.mo64778b() != null) {
            bimy.f120938e.mo64765a(bimy.mo64778b(), true);
            return;
        }
        bimv bimv = bimy.f120940g;
        if (bimv != null) {
            bimv.mo64770a();
        }
    }
}
