package p000;

import android.view.View;

/* renamed from: asvv */
final /* synthetic */ class asvv implements View.OnClickListener {

    /* renamed from: a */
    private final aswe f89826a;

    /* renamed from: b */
    private final deu f89827b;

    public asvv(aswe aswe, deu deu) {
        this.f89826a = aswe;
        this.f89827b = deu;
    }

    public void onClick(View view) {
        aswe aswe = this.f89826a;
        deu deu = this.f89827b;
        atam atam = aswe.f89849l;
        bxvd da = bpbx.f135635S.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbx bpbx = (bpbx) da.f164949b;
        bpbx.f135657c = 135;
        bpbx.f135655a |= 1;
        atam.mo49741a((bpbx) da.mo74062i());
        atlj.m76148a(deu, "WalletBottomSheet", aswe.f89853p);
    }
}
