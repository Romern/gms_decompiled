package p000;

import android.os.Build;
import android.util.Log;

/* renamed from: bjsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjsd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bjse f123218a;

    public bjsd(bjse bjse) {
        this.f123218a = bjse;
    }

    public final void run() {
        int i = Build.VERSION.SDK_INT;
        bjsj bjsj = this.f123218a.f123219a;
        if (bjsj.f123228f == null) {
            bjsq bjsq = bjsj.f123226d;
            if (bjsq == null || bjsj.f123227e == null) {
                Log.e("BiometricPromptCompat", "Negative button callback not run. Fragment was null.");
                return;
            }
            bjsq.f123243a.getCharSequence("negative_text");
            this.f123218a.f123219a.f123225c.mo52011a(13);
            this.f123218a.f123219a.f123227e.mo65505a(2);
            return;
        }
        bjsj.f123225c.mo52011a(13);
        this.f123218a.f123219a.f123228f.mo65492b();
    }
}
