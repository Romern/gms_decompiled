package p000;

import android.view.View;

/* renamed from: aqsd */
public final /* synthetic */ class aqsd implements View.OnClickListener {

    /* renamed from: a */
    private final aqsh f86679a;

    public aqsd(aqsh aqsh) {
        this.f86679a = aqsh;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [aqsg, aqrv], assign insn: 0x0015: IGET  (r8v2 ? I:aqsg) = (r8v1 aqsh) aqsh.f aqsg */
    public void onClick(View view) {
        aqsh aqsh = this.f86679a;
        aqsh.f86693k.f86529a.f86553m.mo26568a(tio.DISMISS_MERGE_BUTTON, tio.SMART_PROFILE_MERGE_CARD);
        ? r8 = aqsh.f86688f;
        aqsm aqsm = (aqsm) r8;
        aqsm.f86705h = 2;
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
        bziq.f170222b = 4;
        bziq.f170221a = 1 | bziq.f170221a;
        bxvd da2 = bzir.f170226b.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzir bzir = (bzir) da2.f164949b;
        bzio.getClass();
        if (!bzir.f170228a.mo73666a()) {
            bzir.f170228a = bxvk.m124021a(bzir.f170228a);
        }
        bzir.f170228a.add(bzio);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bziq bziq2 = (bziq) da.f164949b;
        bzir bzir2 = (bzir) da2.mo74062i();
        bzir2.getClass();
        bziq2.f170224d = bzir2;
        bziq2.f170221a |= 8;
        aqwv.mo48201a(6, aqrx.m72025a((bziq) da.mo74062i()), new aqrs(r8));
    }
}
