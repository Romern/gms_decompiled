package p000;

import android.view.View;

/* renamed from: bihk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bihk implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ biht f120601a;

    public bihk(biht biht) {
        this.f120601a = biht;
    }

    public void onClick(View view) {
        biht biht = this.f120601a;
        if (!biht.f120633u) {
            bihr bihr = biht.f120632t;
            if (bihr != null) {
                ((bikf) bihr).f120777i = null;
            }
            biht.mo64620c(false);
        }
    }
}
