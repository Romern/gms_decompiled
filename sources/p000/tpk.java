package p000;

import android.view.View;

/* renamed from: tpk */
final /* synthetic */ class tpk implements View.OnClickListener {

    /* renamed from: a */
    private final tpm f46446a;

    /* renamed from: b */
    private final tqj f46447b;

    public tpk(tpm tpm, tqj tqj) {
        this.f46446a = tpm;
        this.f46447b = tqj;
    }

    public void onClick(View view) {
        tpm tpm = this.f46446a;
        tqj tqj = this.f46447b;
        tpp tpp = tpm.f46453d;
        trs trs = tpp.f46456a.f46573a;
        C0034at atVar = new C0034at();
        atVar.mo2450b(tql.m37366d());
        aucb b = trs.f46556b.mo26698b(tqj.mo26722e());
        b.mo50373a(new tqy(trs, tqj, atVar));
        b.mo50372a(new tqz(atVar));
        atVar.mo2445a(tpp.f46457b, new tpn(tpp));
    }
}
