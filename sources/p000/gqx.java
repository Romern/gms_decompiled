package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: gqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqx extends aaab {

    /* renamed from: a */
    private final TokenRequest f18857a;

    /* renamed from: b */
    private final gqm f18858b;

    /* renamed from: c */
    private final gpc f18859c;

    public gqx(gpc gpc, gqm gqm, TokenRequest tokenRequest) {
        super(MfiClientException.TYPE_MFICLIENT_STARTED, "GetToken");
        this.f18859c = gpc;
        this.f18857a = tokenRequest;
        this.f18858b = gqm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        gls a = this.f18858b.mo12129a(context);
        TokenRequest tokenRequest = this.f18857a;
        this.f18859c.mo12123a(Status.f30107a, a.mo12030a(tokenRequest.f10714j, tokenRequest));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f18859c.mo12123a(status, (TokenResponse) null);
    }
}
