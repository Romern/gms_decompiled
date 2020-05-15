package p000;

import android.view.View;

/* renamed from: fz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1008fz implements C0038ax {

    /* renamed from: a */
    final /* synthetic */ C1010ga f17667a;

    public C1008fz(C1010ga gaVar) {
        this.f17667a = gaVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2511a(Object obj) {
        if (((C0013ak) obj) != null) {
            C1010ga gaVar = this.f17667a;
            if (gaVar.f17770b) {
                View requireView = gaVar.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (this.f17667a.f17771c != null) {
                    if (C1050hj.m14443a(3)) {
                        "DialogFragment " + this + " setting the content view on " + this.f17667a.f17771c;
                    }
                    this.f17667a.f17771c.setContentView(requireView);
                }
            }
        }
    }
}
