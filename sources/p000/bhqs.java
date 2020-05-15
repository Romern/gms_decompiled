package p000;

import android.util.Log;

/* renamed from: bhqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqs implements bial {

    /* renamed from: a */
    final /* synthetic */ boolean f119350a;

    /* renamed from: b */
    final /* synthetic */ bhvt f119351b;

    public bhqs(bhvt bhvt, boolean z) {
        this.f119351b = bhvt;
        this.f119350a = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64172a(Object obj) {
        bvoy bvoy = (bvoy) obj;
        bxwc bxwc = bvoy.f157242b;
        bxwc bxwc2 = bvoy.f157241a;
        this.f119351b.mo64346a((bvoa[]) bxwc.toArray(new bvoa[bxwc.size()]), (bvnp[]) bxwc2.toArray(new bvnp[bxwc2.size()]), this.f119350a);
    }

    /* renamed from: a */
    public final void mo64173a(Throwable th) {
        if (Log.isLoggable("Places", 5)) {
            bioi.m102661b("Places", "Failed to download placeinfos", th);
        }
        this.f119351b.mo64345a(this.f119350a);
    }
}
