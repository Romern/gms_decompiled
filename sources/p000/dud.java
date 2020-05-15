package p000;

import com.google.android.contextmanager.fence.PlaceFenceHelper;

/* renamed from: dud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dud extends dqi {

    /* renamed from: a */
    final /* synthetic */ dug f14029a;

    /* renamed from: b */
    final /* synthetic */ PlaceFenceHelper f14030b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dud(PlaceFenceHelper placeFenceHelper, String str, Object[] objArr, dug dug) {
        super(str, objArr);
        this.f14030b = placeFenceHelper;
        this.f14029a = dug;
    }

    /* renamed from: a */
    public final void mo9444a(Exception exc) {
        this.f14030b.f7706b.remove(this.f14029a);
    }
}
