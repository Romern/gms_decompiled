package p000;

import android.accounts.Account;
import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData;
import com.google.android.gms.common.api.Status;

/* renamed from: gqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqv extends aaab {

    /* renamed from: a */
    private final Account f18851a;

    /* renamed from: b */
    private final gqm f18852b;

    /* renamed from: c */
    private final gpb f18853c;

    public gqv(gpb gpb, gqm gqm, Account account) {
        super(MfiClientException.TYPE_MFICLIENT_STARTED, "GetGoogleAccountData");
        this.f18853c = gpb;
        this.f18851a = account;
        this.f18852b = gqm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        GoogleAccountData a = this.f18852b.mo12129a(context).mo12028a(this.f18851a);
        if (a != null) {
            this.f18853c.mo12122a(Status.f30107a, a);
            return;
        }
        gql gql = new gql(5);
        gql.f18826b = String.format("Account '%s' does not exist.", this.f18851a);
        throw gql.mo12128a();
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f18853c.mo12122a(status, (GoogleAccountData) null);
    }
}
