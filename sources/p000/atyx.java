package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.tapandpay.wear.WearProxyChimeraActivity;

/* renamed from: atyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atyx implements atfd {

    /* renamed from: a */
    final /* synthetic */ int f91183a;

    /* renamed from: b */
    final /* synthetic */ String f91184b;

    /* renamed from: c */
    final /* synthetic */ WearProxyChimeraActivity f91185c;

    public atyx(WearProxyChimeraActivity wearProxyChimeraActivity, int i, String str) {
        this.f91185c = wearProxyChimeraActivity;
        this.f91183a = i;
        this.f91184b = str;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f91185c.mo59503a(auaa.m76627a(this.f91183a, volleyError.getMessage()), this.f91184b);
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        this.f91185c.mo59503a(auaa.m76628a(this.f91183a, ((bxxc) obj).serializeToBytes()), this.f91184b);
    }
}
