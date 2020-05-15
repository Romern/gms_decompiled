package p000;

import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: atua */
final /* synthetic */ class atua implements aubq {

    /* renamed from: a */
    private final atub f90896a;

    public atua(atub atub) {
        this.f90896a = atub;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        atub atub = this.f90896a;
        if (!aucb.mo50384b()) {
            atub.mo50187b(404, 2);
            atub.mo50178a();
            return;
        }
        TokenizePanChimeraActivity tokenizePanChimeraActivity = atub.f90898f;
        tokenizePanChimeraActivity.f108914k.postDelayed(tokenizePanChimeraActivity.f108916m, TimeUnit.SECONDS.toMillis(10));
    }
}
