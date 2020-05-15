package p000;

import android.view.View;

/* renamed from: auxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auxx implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ auxz f92756a;

    public auxx(auxz auxz) {
        this.f92756a = auxz;
    }

    public void onClick(View view) {
        auxz auxz = this.f92756a;
        auyf.m78076a(auxz.f92758c, auxz.f92759d, auxz.f92760e).show(auxz.f92753a.getSupportFragmentManager(), "TrustedPlacesRenameDiaglogFragment");
        auxz.dismiss();
    }
}
