package p000;

import com.google.android.contextmanager.fence.PlaceFenceHelper;

/* renamed from: duf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class duf extends dqi {

    /* renamed from: a */
    final /* synthetic */ dug f14035a;

    /* renamed from: b */
    final /* synthetic */ PlaceFenceHelper f14036b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public duf(PlaceFenceHelper placeFenceHelper, String str, Object[] objArr, dug dug) {
        super(str, objArr);
        this.f14036b = placeFenceHelper;
        this.f14035a = dug;
    }

    /* renamed from: a */
    public final void mo9444a(Exception exc) {
        this.f14036b.f7706b.remove(this.f14035a);
    }
}
