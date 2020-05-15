package p000;

import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: atno */
public final /* synthetic */ class atno implements rkl {

    /* renamed from: a */
    private final TapUiChimeraActivity f90562a;

    /* renamed from: b */
    private final atol f90563b;

    public atno(TapUiChimeraActivity tapUiChimeraActivity, atol atol) {
        this.f90562a = tapUiChimeraActivity;
        this.f90563b = atol;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        TapUiChimeraActivity tapUiChimeraActivity = this.f90562a;
        atol atol = this.f90563b;
        asmj asmj = (asmj) rkk;
        if (!asmj.mo7183bo().mo17710c()) {
            ((bnsl) TapUiChimeraActivity.f108685b.mo68388c()).mo68409a("Failed to retrieve active cards. Status: %d", asmj.mo7183bo().f30115i);
            return;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(asmj.mo49241b().f108369a));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CardInfo cardInfo = (CardInfo) it.next();
            if (cardInfo.equals(tapUiChimeraActivity.f108733z) || cardInfo.f108345f.f108459b != 5) {
                it.remove();
            }
        }
        if (arrayList.isEmpty() || ((long) arrayList.size()) > cgww.f187944a.mo6606a().mo84657c()) {
            atam atam = tapUiChimeraActivity.f108720m;
            int size = arrayList.size();
            bxvd g = atam.mo49765g(71);
            bxvd da = bpbe.f135585e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpbe bpbe = (bpbe) da.f164949b;
            bpbe.f135587a |= 1;
            bpbe.f135588b = size;
            if (g.f164950c) {
                g.mo74035c();
                g.f164950c = false;
            }
            bpbx bpbx = (bpbx) g.f164949b;
            bpbe bpbe2 = (bpbe) da.mo74062i();
            bpbx bpbx2 = bpbx.f135635S;
            bpbe2.getClass();
            bpbx.f135679y = bpbe2;
            bpbx.f135655a |= 67108864;
            atam.mo49741a((bpbx) g.mo74062i());
            return;
        }
        atol.mo50067a(arrayList);
    }
}
