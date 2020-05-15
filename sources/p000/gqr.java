package p000;

import android.content.Context;
import android.os.Bundle;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;

/* renamed from: gqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqr extends aaab {

    /* renamed from: a */
    private final gqm f18840a;

    /* renamed from: b */
    private final String f18841b;

    /* renamed from: c */
    private final got f18842c;

    public gqr(got got, gqm gqm, String str) {
        super(MfiClientException.TYPE_MFICLIENT_STARTED, "GetAccountExportData");
        this.f18842c = got;
        this.f18840a = gqm;
        this.f18841b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        Bundle a = this.f18840a.mo12129a(context).mo12024a(this.f18841b);
        if (a != null) {
            this.f18842c.mo12115a(Status.f30107a, a);
            return;
        }
        gql gql = new gql(5);
        gql.f18826b = String.format("Account name '%s' does not exist.", this.f18841b);
        throw gql.mo12128a();
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f18842c.mo12115a(status, (Bundle) null);
    }
}
