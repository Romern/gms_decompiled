package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: gqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqo extends aaab {

    /* renamed from: a */
    private final ClearTokenRequest f18831a;

    /* renamed from: b */
    private final gqm f18832b;

    /* renamed from: c */
    private final gop f18833c;

    public gqo(gop gop, gqm gqm, ClearTokenRequest clearTokenRequest) {
        super(MfiClientException.TYPE_MFICLIENT_STARTED, "ClearToken");
        this.f18833c = gop;
        this.f18831a = clearTokenRequest;
        this.f18832b = gqm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f18833c.mo12113a(Status.f30107a, this.f18832b.mo12129a(context).mo12027a(this.f18831a));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f18833c.mo12113a(status, (ClearTokenResponse) null);
    }
}
