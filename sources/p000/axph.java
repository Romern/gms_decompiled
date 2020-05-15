package p000;

import com.google.android.gms.wearable.internal.NodeParcelable;

/* renamed from: axph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axph implements Runnable {

    /* renamed from: a */
    final /* synthetic */ NodeParcelable f96243a;

    /* renamed from: b */
    final /* synthetic */ axpo f96244b;

    public axph(axpo axpo, NodeParcelable nodeParcelable) {
        this.f96244b = axpo;
        this.f96243a = nodeParcelable;
    }

    public final void run() {
        this.f96244b.f96251a.mo19177a();
    }
}
