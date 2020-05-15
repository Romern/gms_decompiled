package p000;

import android.view.View;

/* renamed from: atma */
final /* synthetic */ class atma implements View.OnClickListener {

    /* renamed from: a */
    private final atme f90466a;

    public atma(atme atme) {
        this.f90466a = atme;
    }

    public void onClick(View view) {
        atme atme = this.f90466a;
        atam atam = atme.f90471d;
        bxvd da = bpbx.f135635S.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbx bpbx = (bpbx) da.f164949b;
        bpbx.f135657c = 135;
        bpbx.f135655a |= 1;
        atam.mo49741a((bpbx) da.mo74062i());
        if (atme.f90477j) {
            atlj.m76148a(atme.f90469b, "WalletBottomSheet", true);
        } else {
            atme.f90479l.mo24719a(atme.f90469b.getContainerActivity(), (String) null);
        }
    }
}
