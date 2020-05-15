package p000;

import android.view.View;

/* renamed from: akpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akpq implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ akpv f72396a;

    public akpq(akpv akpv) {
        this.f72396a = akpv;
    }

    public void onClick(View view) {
        akql akql = this.f72396a.f72406e;
        int i = akql.f72451m;
        if (i == 1 || i == 2) {
            akql.mo39704a(3);
        } else if (i == 3) {
            akql.mo39704a(1);
        }
    }
}
