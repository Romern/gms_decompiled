package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: qzr */
final /* synthetic */ class qzr implements rad {

    /* renamed from: a */
    private final bxvd f42448a;

    public qzr(bxvd bxvd) {
        this.f42448a = bxvd;
    }

    /* renamed from: a */
    public final void mo24404a(int i) {
        bxvd bxvd = this.f42448a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cafu cafu = (cafu) bxvd.f164949b;
        cafu cafu2 = cafu.f172965X;
        cafu.f172991b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        cafu.f172982P = i;
    }
}
