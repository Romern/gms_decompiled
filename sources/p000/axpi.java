package p000;

import com.google.android.gms.wearable.internal.NodeParcelable;

/* renamed from: axpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axpi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ NodeParcelable f96245a;

    /* renamed from: b */
    final /* synthetic */ axpo f96246b;

    public axpi(axpo axpo, NodeParcelable nodeParcelable) {
        this.f96246b = axpo;
        this.f96245a = nodeParcelable;
    }

    public final void run() {
        this.f96246b.f96251a.mo19179b();
    }
}
