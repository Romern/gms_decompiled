package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: qyp */
final /* synthetic */ class qyp implements rad {

    /* renamed from: a */
    private final bxvd f42420a;

    public qyp(bxvd bxvd) {
        this.f42420a = bxvd;
    }

    /* renamed from: a */
    public final void mo24404a(int i) {
        bxvd bxvd = this.f42420a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cafu cafu = (cafu) bxvd.f164949b;
        cafu cafu2 = cafu.f172965X;
        cafu.f172990a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        cafu.f173008s = i;
    }
}
