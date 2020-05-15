package p000;

import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: brle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brle implements brlg {

    /* renamed from: a */
    final /* synthetic */ brli f142908a;

    public brle(brli brli) {
        this.f142908a = brli;
    }

    /* renamed from: a */
    public final void mo69679a(brpj brpj, Object... objArr) {
        brli brli = this.f142908a;
        brpj.mo69759a(new PhoneAuthCredential(brli.f142918i, brli.f142919j, false, null, true, null, null));
    }
}
