package p000;

import android.view.View;
import android.view.Window;

/* renamed from: agl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agl implements C0011ai {

    /* renamed from: a */
    final /* synthetic */ ago f505a;

    public agl(ago ago) {
        this.f505a = ago;
    }

    /* renamed from: a */
    public final void mo136a(C0013ak akVar, C0005ad adVar) {
        View view;
        if (adVar == C0005ad.ON_STOP) {
            Window window = this.f505a.getWindow();
            if (window != null) {
                view = window.peekDecorView();
            } else {
                view = null;
            }
            if (view != null) {
                view.cancelPendingInputEvents();
            }
        }
    }
}
