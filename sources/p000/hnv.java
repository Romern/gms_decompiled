package p000;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* renamed from: hnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hnv implements hkz {

    /* renamed from: a */
    private final Context f20092a;

    public hnv(Context context) {
        this.f20092a = context;
    }

    /* renamed from: a */
    public final bqgg mo12600a(acyr acyr, HintRequest hintRequest) {
        boolean contains = bnpf.m110050a(hintRequest.f10117e).contains("https://accounts.google.com");
        if (!hintRequest.f10115c && !contains) {
            return bqga.m112775a((Object) bngx.m109376e());
        }
        allp allp = new allp();
        allp.f73626a = 80;
        rjx d = allr.m61237d(this.f20092a, allp.mo40491a());
        alkx alkx = new alkx();
        alkx.f73613b = false;
        return bqdx.m112673a(adbb.m50102a(d.mo24710a(alkx)), new hnu(contains), bqfb.INSTANCE);
    }
}
