package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.common.api.Status;

/* renamed from: gsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gsa extends aaab {

    /* renamed from: a */
    private static final Logger f18923a = ght.m13171a("AddWorkAccountAsyncOp");

    /* renamed from: b */
    private final String f18924b;

    /* renamed from: c */
    private final ilm f18925c;

    /* renamed from: d */
    private final iws f18926d;

    /* renamed from: e */
    private final gpy f18927e;

    /* renamed from: f */
    private final int f18928f;

    /* renamed from: g */
    private final giz f18929g;

    public gsa(giz giz, String str, ilm ilm, iws iws, gpy gpy, int i) {
        super(120, "AddWorkAccountAsyncOp");
        this.f18929g = giz;
        this.f18924b = str;
        this.f18925c = ilm;
        this.f18926d = iws;
        this.f18927e = gpy;
        this.f18928f = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f18925c.mo13119a();
        AccountCredentials accountCredentials = new AccountCredentials("com.google.work");
        accountCredentials.f10831e = this.f18924b;
        AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
        accountSignInRequest.f10596f = accountCredentials;
        TokenResponse a = this.f18926d.mo13418a(accountSignInRequest);
        Account account = null;
        if (a == null) {
            f18923a.mo25418e("Failed to add work account, response is null", new Object[0]);
        } else if (!izj.SUCCESS.equals(a.mo7647b())) {
            Logger Logger = f18923a;
            String valueOf = String.valueOf(a.mo7647b());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Failed to add work account, status: ");
            sb.append(valueOf);
            Logger.mo25418e(sb.toString(), new Object[0]);
        } else {
            account = a.f10744u;
            gpy gpy = this.f18927e;
            int i = this.f18928f;
            if ("com.google.work".equals(account.type)) {
                SharedPreferences.Editor edit = gpy.f18806b.edit();
                edit.putInt(account.name, i);
                edit.apply();
                this.f18925c.mo13120b();
            } else {
                throw new IllegalArgumentException("not a work account");
            }
        }
        giz giz = this.f18929g;
        Parcel bj = giz.mo8529bj();
        dcl.m8165a(bj, account);
        giz.mo8530c(1, bj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
    }
}
