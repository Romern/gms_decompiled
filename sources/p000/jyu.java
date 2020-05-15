package p000;

import android.content.Intent;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* renamed from: jyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jyu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ MinuteMaidChimeraActivity f23549a;

    public jyu(MinuteMaidChimeraActivity minuteMaidChimeraActivity) {
        this.f23549a = minuteMaidChimeraActivity;
    }

    public final void run() {
        if (!this.f23549a.f11564t) {
            MinuteMaidChimeraActivity.f11545a.mo25416d("Timed-out. Loading took too long.", new Object[0]);
            bxvd bxvd = this.f23549a.f23434l.f23511c;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bofn bofn = (bofn) bxvd.f164949b;
            bofn bofn2 = bofn.f132923f;
            bofn.f132928d = 2;
            bofn.f132925a |= 4;
            this.f23549a.mo7874a(2, (Intent) null);
        }
    }
}
