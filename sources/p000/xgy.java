package p000;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;

/* renamed from: xgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xgy implements bqfp {

    /* renamed from: a */
    final /* synthetic */ xgz f52246a;

    public xgy(xgz xgz) {
        this.f52246a = xgz;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        this.f52246a.f52254h.mo69138b((PublicKeyCredential) obj);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f52246a.f52255i++;
        if (xha.f52259c && this.f52246a.f52255i >= xha.f52260d) {
            bmxv a = this.f52246a.f52253g.mo29745a(3, xha.f52258b);
            if (a.mo66813a()) {
                this.f52246a.f52250d.mo14261a(((ViewOptions) a.mo66814b()).toString());
            }
        }
    }
}
