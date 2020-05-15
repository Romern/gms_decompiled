package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.ResultReceiver;
import com.google.android.libraries.matchstick.p091ui.ReplyViewSwipeHelper$7;
import com.google.android.libraries.matchstick.p091ui.ReplyViewSwipeHelper$8;

/* renamed from: azma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azma extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f99608a;

    /* renamed from: b */
    final /* synthetic */ azme f99609b;

    public azma(azme azme, boolean z) {
        this.f99609b = azme;
        this.f99608a = z;
    }

    public final void onAnimationEnd(Animator animator) {
        ResultReceiver resultReceiver;
        azmg azmg = (azmg) this.f99609b.f99619e.get();
        if (azmg != null) {
            azme azme = this.f99609b;
            if (!this.f99608a) {
                if (azme.f99624j == null) {
                    azme.f99624j = new ReplyViewSwipeHelper$8(azme, azme.f99620f);
                }
                resultReceiver = azme.f99624j;
            } else {
                if (azme.f99623i == null) {
                    azme.f99623i = new ReplyViewSwipeHelper$7(azme, azme.f99620f);
                }
                resultReceiver = azme.f99623i;
            }
            azmg.mo55047a(resultReceiver);
        }
    }
}
