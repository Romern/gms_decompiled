package p000;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: vy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1448vy extends C1447vx implements ActionProvider.VisibilityListener {

    /* renamed from: d */
    private C1445vv f27482d;

    public C1448vy(C1453wc wcVar, ActionProvider actionProvider) {
        super(wcVar, actionProvider);
    }

    /* renamed from: a */
    public final View mo15661a(MenuItem menuItem) {
        return this.f27480b.onCreateActionView(menuItem);
    }

    /* renamed from: b */
    public final boolean mo15664b() {
        return this.f27480b.overridesItemVisibility();
    }

    /* renamed from: c */
    public final boolean mo15665c() {
        return this.f27480b.isVisible();
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        C1445vv vvVar = this.f27482d;
        if (vvVar != null) {
            vvVar.f27450a.f27462i.mo16263l();
        }
    }

    /* renamed from: a */
    public final void mo15663a(C1445vv vvVar) {
        this.f27482d = vvVar;
        this.f27480b.setVisibilityListener(this);
    }
}
