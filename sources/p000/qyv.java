package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: qyv */
final /* synthetic */ class qyv implements rad {

    /* renamed from: a */
    private final bxvd f42426a;

    public qyv(bxvd bxvd) {
        this.f42426a = bxvd;
    }

    /* renamed from: a */
    public final void mo24404a(int i) {
        bxvd bxvd = this.f42426a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cafu cafu = (cafu) bxvd.f164949b;
        cafu cafu2 = cafu.f172965X;
        cafu.f172991b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        cafu.f172988V = i;
    }
}
