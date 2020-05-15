package p000;

import android.content.Intent;

/* renamed from: eyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eyk implements evm {

    /* renamed from: a */
    final /* synthetic */ eyl f16031a;

    public eyk(eyl eyl) {
        this.f16031a = eyl;
    }

    /* renamed from: a */
    public final void mo10532a(evk evk) {
        if (!evk.f15882e) {
            Intent intent = evk.f15883f;
            if (intent != null) {
                this.f16031a.startActivityForResult(intent, 9);
                return;
            }
            return;
        }
        fda fda = this.f16031a.f16032a;
        fda.f16297b.mo10680a(((fci) fda.f16296a).f16269a);
    }
}
