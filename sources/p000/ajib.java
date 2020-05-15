package p000;

import android.accounts.Account;
import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;

/* renamed from: ajib */
final /* synthetic */ class ajib implements aubg {

    /* renamed from: a */
    private final ConsentsChimeraActivity f70683a;

    public ajib(ConsentsChimeraActivity consentsChimeraActivity) {
        this.f70683a = consentsChimeraActivity;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        ajvw ajvw = new ajvw(this.f70683a);
        bdtq a = ajvw.m59117a(ajvw.f71386a, (Account) aucb.mo50386d());
        bxvd da = bxqf.f164373f.mo74144da();
        bxvd da2 = bxqe.f164368d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxqe bxqe = (bxqe) da2.f164949b;
        int i = bxqe.f164370a | 1;
        bxqe.f164370a = i;
        bxqe.f164371b = 10;
        bxqe.f164370a = i | 2;
        bxqe.f164372c = true;
        bxqe bxqe2 = (bxqe) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxqf bxqf = (bxqf) da.f164949b;
        bxqe2.getClass();
        if (!bxqf.f164376b.mo73666a()) {
            bxqf.f164376b = bxvk.m124021a(bxqf.f164376b);
        }
        bxqf.f164376b.add(bxqe2);
        return ahhf.m55772a(a.mo58360a((bxqf) da.mo74062i()), cfov.m142058k()).mo50382b(new ajvs(a)).mo50363a(new ajvt(ajvw));
    }
}
