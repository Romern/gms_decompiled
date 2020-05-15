package p000;

import com.felicanetworks.mfc.FSC;
import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.FelicaException;

/* renamed from: brfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brfy implements brff {

    /* renamed from: a */
    final /* synthetic */ Felica f142789a;

    /* renamed from: b */
    final /* synthetic */ brfz f142790b;

    public brfy(brfz brfz, Felica felica) {
        this.f142790b = brfz;
        this.f142789a = felica;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69479a(Object obj) {
        try {
            this.f142789a.activateFelica((String[]) this.f142790b.f142792b.toArray(new String[0]), new brfx(this, (FSC) obj));
        } catch (FelicaException e) {
            this.f142790b.f142794d.mo69502a(8, e);
            this.f142790b.f142794d.mo69511d();
            brfz brfz = this.f142790b;
            brfz.f142794d.f142819g.execute(new brfr(brfz.f142791a, e));
            this.f142790b.f142794d.mo69514e(5);
            this.f142790b.f142794d.mo69509c();
        }
    }
}
