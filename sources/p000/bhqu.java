package p000;

import android.util.Log;

/* renamed from: bhqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqu implements bial {

    /* renamed from: a */
    final /* synthetic */ bhvr f119354a;

    public bhqu(bhvr bhvr) {
        this.f119354a = bhvr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64172a(Object obj) {
        this.f119354a.mo64331a((bvmm) obj);
    }

    /* renamed from: a */
    public final void mo64173a(Throwable th) {
        if (Log.isLoggable("Places", 5)) {
            bioi.m102661b("Places", "Failed to download inference model weights PlacesServer", th);
        }
        this.f119354a.mo64330a();
    }
}
