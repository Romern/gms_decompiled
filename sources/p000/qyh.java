package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: qyh */
final /* synthetic */ class qyh implements rad {

    /* renamed from: a */
    private final bxvd f42412a;

    public qyh(bxvd bxvd) {
        this.f42412a = bxvd;
    }

    /* renamed from: a */
    public final void mo24404a(int i) {
        bxvd bxvd = this.f42412a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cafu cafu = (cafu) bxvd.f164949b;
        cafu cafu2 = cafu.f172965X;
        cafu.f172990a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        cafu.f173000k = i;
    }
}
