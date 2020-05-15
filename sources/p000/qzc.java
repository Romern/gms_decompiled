package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: qzc */
final /* synthetic */ class qzc implements rad {

    /* renamed from: a */
    private final bxvd f42433a;

    public qzc(bxvd bxvd) {
        this.f42433a = bxvd;
    }

    /* renamed from: a */
    public final void mo24404a(int i) {
        bxvd bxvd = this.f42433a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cafu cafu = (cafu) bxvd.f164949b;
        cafu cafu2 = cafu.f172965X;
        cafu.f172991b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        cafu.f172989W = i;
    }
}
