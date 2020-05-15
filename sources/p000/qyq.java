package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: qyq */
final /* synthetic */ class qyq implements rad {

    /* renamed from: a */
    private final bxvd f42421a;

    public qyq(bxvd bxvd) {
        this.f42421a = bxvd;
    }

    /* renamed from: a */
    public final void mo24404a(int i) {
        bxvd bxvd = this.f42421a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cafu cafu = (cafu) bxvd.f164949b;
        cafu cafu2 = cafu.f172965X;
        cafu.f172990a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        cafu.f173009t = i;
    }
}
