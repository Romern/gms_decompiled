package p000;

import android.content.Context;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.uiflows.gettoken.GetTokenChimeraActivity;

/* renamed from: jxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jxz extends jxi {

    /* renamed from: a */
    final /* synthetic */ GetTokenChimeraActivity f23502a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jxz(GetTokenChimeraActivity getTokenChimeraActivity, Context context, boolean z) {
        super(context, z);
        this.f23502a = getTokenChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        TokenRequest tokenRequest = (TokenRequest) this.f23502a.mo14202g().mo13146a(GetTokenChimeraActivity.f11517c);
        TokenResponse a = new ixl(this.f23502a).mo13425a(tokenRequest);
        boolean f = soz.m35808f(this.f23502a, tokenRequest.f10707c);
        ims ims = new ims();
        ims.mo13148b(GetTokenChimeraActivity.f11515a, a);
        ims.mo13148b(GetTokenChimeraActivity.f11516b, Boolean.valueOf(f));
        return ims.f21367a;
    }
}
