package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.Status;

/* renamed from: gqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqq extends aaab {

    /* renamed from: a */
    private final gos f18837a;

    /* renamed from: b */
    private final AccountChangeEventsRequest f18838b;

    /* renamed from: c */
    private final gqm f18839c;

    public gqq(gos gos, gqm gqm, AccountChangeEventsRequest accountChangeEventsRequest) {
        super(MfiClientException.TYPE_MFICLIENT_STARTED, "GetAccountChangeEvents");
        this.f18837a = gos;
        this.f18838b = accountChangeEventsRequest;
        this.f18839c = gqm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f18837a.mo12114a(Status.f30107a, this.f18839c.mo12129a(context).mo12025a(this.f18838b));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f18837a.mo12114a(status, null);
    }
}
