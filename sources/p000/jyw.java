package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* renamed from: jyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jyw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ MinuteMaidChimeraActivity f23551a;

    public jyw(MinuteMaidChimeraActivity minuteMaidChimeraActivity) {
        this.f23551a = minuteMaidChimeraActivity;
    }

    public final void run() {
        MinuteMaidChimeraActivity minuteMaidChimeraActivity = this.f23551a;
        minuteMaidChimeraActivity.f11564t = true;
        this.f23551a.f11562r.animate().alpha(0.0f).setDuration((long) minuteMaidChimeraActivity.getResources().getInteger(C0126R.integer.sudTransitionDuration)).setListener(new jyv(this)).start();
    }
}
