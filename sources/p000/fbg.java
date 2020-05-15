package p000;

import android.content.Intent;

/* renamed from: fbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fbg implements evm {

    /* renamed from: a */
    final /* synthetic */ fbh f16192a;

    public fbg(fbh fbh) {
        this.f16192a = fbh;
    }

    /* renamed from: a */
    public final void mo10532a(evk evk) {
        if (!evk.f15882e) {
            Intent intent = evk.f15883f;
            if (intent != null) {
                this.f16192a.startActivityForResult(intent, 9);
                return;
            }
            return;
        }
        ffb ffb = this.f16192a.f16193a;
        ffb.f16427c.mo10680a(((fcn) ffb.f16425a).f16282a);
    }
}
