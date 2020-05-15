package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: atu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atu {

    /* renamed from: a */
    private final ViewGroupOverlay f2231a;

    public atu(ViewGroup viewGroup) {
        this.f2231a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public final void mo2504a(View view) {
        this.f2231a.add(view);
    }

    /* renamed from: b */
    public final void mo2505b(View view) {
        this.f2231a.remove(view);
    }
}
