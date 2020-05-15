package p000;

import com.android.volley.Network;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.DiskBasedCache;

/* renamed from: fhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fhc implements cayy {

    /* renamed from: a */
    private final cijl f16595a;

    /* renamed from: b */
    private final cijl f16596b;

    /* renamed from: c */
    private final cijl f16597c;

    public fhc(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f16595a = cijl;
        this.f16596b = cijl2;
        this.f16597c = cijl3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        RequestQueue requestQueue = new RequestQueue((DiskBasedCache) this.f16595a.mo6445a(), (Network) this.f16596b.mo6445a());
        requestQueue.start();
        fgc.m11649a((C0008af) ((cayz) this.f16597c).f176439a, new fgu(requestQueue));
        cazf.m127593a(requestQueue, "Cannot return null from a non-@Nullable @Provides method");
        return requestQueue;
    }
}
