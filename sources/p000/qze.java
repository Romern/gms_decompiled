package p000;

import com.google.android.cast.JGCastService;

/* renamed from: qze */
final /* synthetic */ class qze implements rad {

    /* renamed from: a */
    private final bxvd f42435a;

    public qze(bxvd bxvd) {
        this.f42435a = bxvd;
    }

    /* renamed from: a */
    public final void mo24404a(int i) {
        bxvd bxvd = this.f42435a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cafu cafu = (cafu) bxvd.f164949b;
        cafu cafu2 = cafu.f172965X;
        cafu.f172990a |= JGCastService.FLAG_PRIVATE_DISPLAY;
        cafu.f172972F = i;
    }
}
