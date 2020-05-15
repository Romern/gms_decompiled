package p000;

import android.accounts.Account;
import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;

/* renamed from: gqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqs extends aaab {

    /* renamed from: a */
    private final Account f18843a;

    /* renamed from: b */
    private final gqm f18844b;

    /* renamed from: c */
    private final gou f18845c;

    public gqs(gou gou, gqm gqm, Account account) {
        super(MfiClientException.TYPE_MFICLIENT_STARTED, "GetAccountId");
        this.f18845c = gou;
        this.f18843a = account;
        this.f18844b = gqm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        String b = this.f18844b.mo12129a(context).mo12033b(this.f18843a);
        if (!b.isEmpty()) {
            this.f18845c.mo12116a(Status.f30107a, b);
            return;
        }
        gql gql = new gql(5);
        gql.f18826b = "Account id is empty.";
        throw gql.mo12128a();
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f18845c.mo12116a(status, "");
    }
}
