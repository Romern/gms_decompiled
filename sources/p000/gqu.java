package p000;

import android.accounts.Account;
import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: gqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqu extends aaab {

    /* renamed from: a */
    private final gpa f18848a;

    /* renamed from: b */
    private final Account f18849b;

    /* renamed from: c */
    private final gqm f18850c;

    public gqu(gpa gpa, gqm gqm, Account account) {
        super(MfiClientException.TYPE_MFICLIENT_STARTED, "GetDeviceManagementInfo");
        this.f18848a = gpa;
        this.f18849b = account;
        this.f18850c = gqm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        try {
            this.f18848a.mo12118a(Status.f30107a, this.f18850c.mo12129a(context).mo12035c(this.f18849b));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            gql gql = new gql(14);
            gql.f18825a = e;
            throw gql.mo12128a();
        } catch (ExecutionException e2) {
            gql gql2 = new gql(13);
            gql2.f18825a = e2;
            throw gql2.mo12128a();
        } catch (gmh e3) {
            gql gql3 = new gql(10);
            gql3.f18825a = e3;
            throw gql3.mo12128a();
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f18848a.mo12118a(status, null);
    }
}
