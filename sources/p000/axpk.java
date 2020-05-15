package p000;

import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;

/* renamed from: axpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axpk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CapabilityInfoParcelable f96247a;

    /* renamed from: b */
    final /* synthetic */ axpo f96248b;

    public axpk(axpo axpo, CapabilityInfoParcelable capabilityInfoParcelable) {
        this.f96248b = axpo;
        this.f96247a = capabilityInfoParcelable;
    }

    public final void run() {
        this.f96248b.f96251a.mo53375a(this.f96247a);
    }
}
