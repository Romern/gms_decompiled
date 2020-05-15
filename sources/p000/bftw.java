package p000;

import android.content.Context;
import android.location.Location;

/* renamed from: bftw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bftw implements bfch {

    /* renamed from: a */
    public bftv f115268a = null;

    /* renamed from: b */
    public boolean f115269b = false;

    /* renamed from: c */
    public final Context f115270c;

    /* renamed from: a */
    public final void mo61264a(long j, bfbk bfbk, Location location, Location location2) {
        if (location2 != null) {
            mo61265a(j, bfbk, location, location2, bfcg.m96336a((double) location2.getAccuracy()));
        }
    }

    public bftw(Context context) {
        this.f115270c = context;
    }

    /* renamed from: a */
    public final void mo61265a(long j, bfbk bfbk, Location location, Location location2, double d) {
        bsde bsde;
        bfbk bfbk2 = bfbk;
        if (this.f115268a != null && this.f115269b) {
            bnwc b = bnwc.m110613b(location2.getLatitude(), location2.getLongitude());
            bezi bezi = ((bfbh) bfbk2).f113297b;
            bezf a = bezf.m96119a(bezi, b, d);
            bngs bngs = new bngs();
            beze e = a.mo61272e();
            while (e.mo61266a()) {
                int b2 = e.mo61267b();
                bnwc a2 = bezi.mo61284a((double) bezi.mo61288c(b2), (double) bezi.mo61289d(b2));
                bngs.mo67668c(new bsdd(a2.f132274a, a2.f132275b, bfbk2.mo61358a(b2)));
            }
            if (!bngs.mo67664a().isEmpty()) {
                bsde = new bsde(bngs.mo67664a(), bezi.mo61280f());
            } else {
                bsde = null;
            }
            if (bsde != null) {
                bfqs bfqs = (bfqs) this.f115268a;
                bfqs.f114917b.mo63549a(new bfqo(bfqs, j, bsde));
            }
        }
    }
}
