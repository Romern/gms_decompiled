package p000;

import android.content.Context;
import com.android.volley.Request;

/* renamed from: dwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwr extends sgv {
    public dwr(Context context, String str) {
        super(context, cdhu.f180921a.mo6606a().mo77628c(), cdhu.m133457b(), false, cdgp.f180782a.mo6606a().mo77549aN(), cdgp.f180782a.mo6606a().mo77545aJ(), "", str);
        this.f44447g = 12544;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9812a(Request request, String str) {
        request.setRetryPolicy(new sgu(this.f44453i, str, 10000, 3, 1.0f));
    }
}
