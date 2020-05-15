package p000;

import android.view.View;

/* renamed from: aqsc */
public final /* synthetic */ class aqsc implements View.OnClickListener {

    /* renamed from: a */
    private final aqsh f86678a;

    public aqsc(aqsh aqsh) {
        this.f86678a = aqsh;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [aqsg, aqru], assign insn: 0x0015: IGET  (r8v2 ? I:aqsg) = (r8v1 aqsh) aqsh.f aqsg */
    public void onClick(View view) {
        aqsh aqsh = this.f86678a;
        aqsh.f86693k.f86529a.f86553m.mo26568a(tio.ACCEPT_MERGE_BUTTON, tio.SMART_PROFILE_MERGE_CARD);
        ? r8 = aqsh.f86688f;
        aqsm aqsm = (aqsm) r8;
        aqsm.f86705h = 1;
        aqsm.f86700c.mo48125a();
        aqrx aqrx = aqsm.f86701d;
        bzio bzio = aqsm.f86698a.f170249a;
        if (bzio == null) {
            bzio = bzio.f170216a;
        }
        aqwv aqwv = aqrx.f86673a;
        bxvd da = bziq.f170219f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bziq bziq = (bziq) da.f164949b;
        bziq.f170222b = 3;
        bziq.f170221a = 1 | bziq.f170221a;
        bxvd da2 = bzim.f170209b.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzim bzim = (bzim) da2.f164949b;
        bzio.getClass();
        if (!bzim.f170211a.mo73666a()) {
            bzim.f170211a = bxvk.m124021a(bzim.f170211a);
        }
        bzim.f170211a.add(bzio);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bziq bziq2 = (bziq) da.f164949b;
        bzim bzim2 = (bzim) da2.mo74062i();
        bzim2.getClass();
        bziq2.f170223c = bzim2;
        bziq2.f170221a |= 4;
        aqwv.mo48201a(5, aqrx.m72025a((bziq) da.mo74062i()), new aqrr(r8));
    }
}
