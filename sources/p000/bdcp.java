package p000;

import android.widget.FrameLayout;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: bdcp */
final /* synthetic */ class bdcp implements Runnable {

    /* renamed from: a */
    private final AccountParticleDisc f105338a;

    public bdcp(AccountParticleDisc accountParticleDisc) {
        this.f105338a = accountParticleDisc;
    }

    public final void run() {
        FrameLayout frameLayout = (FrameLayout) this.f105338a.f111375b.get();
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }
}
