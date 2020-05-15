package p000;

import android.view.View;

/* renamed from: gc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1012gc implements C0011ai {

    /* renamed from: a */
    final /* synthetic */ C1018gh f17868a;

    public C1012gc(C1018gh ghVar) {
        this.f17868a = ghVar;
    }

    /* renamed from: a */
    public final void mo136a(C0013ak akVar, C0005ad adVar) {
        View view;
        if (adVar == C0005ad.ON_STOP && (view = this.f17868a.f18174K) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
