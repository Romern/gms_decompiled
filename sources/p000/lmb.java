package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: lmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lmb implements bqfp {

    /* renamed from: a */
    final /* synthetic */ lmf f26359a;

    public lmb(lmf lmf) {
        this.f26359a = lmf;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Boolean bool = (Boolean) obj;
        krc.m18382a(this.f26359a.f26159a).mo14830e().mo15113g(true);
        this.f26359a.f26159a.startActivity(lio.m19193a((int) C0126R.string.autofill_manage_save_passwords, (int) C0126R.string.common_settings, (int) C0126R.string.common_dismiss));
        this.f26359a.mo15167a(-1, null);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) lmf.f26366d.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68448m();
        this.f26359a.mo15167a(-1, null);
    }
}
