package p000;

import android.os.Bundle;

/* renamed from: auwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auwy implements rjz {

    /* renamed from: a */
    final /* synthetic */ auxe f92677a;

    public auwy(auxe auxe) {
        this.f92677a = auxe;
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        aunx aunx = auxe.f92681a;
        StringBuilder sb = new StringBuilder(57);
        sb.append("GoogleApiClient connection suspended - cause: ");
        sb.append(i);
        aunx.mo50711a(sb.toString(), new Object[0]);
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        auxe.f92681a.mo50711a("GoogleApiClient connected to fetch home", new Object[0]);
        rjo rjo = aema.f63501a;
        aenc.m52182a(this.f92677a.f92685e).mo9458a(new auxb(this.f92677a));
    }
}
