package p000;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: gqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqz extends aaab {

    /* renamed from: a */
    private final Account f18872a;

    /* renamed from: b */
    private final goo f18873b;

    public gqz(goo goo, Account account) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, "removeAccountGoogleAuthOperation");
        this.f18873b = goo;
        this.f18872a = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        adyd a = adyd.m51363a(context);
        Logger a2 = ght.m13171a("RemoveAccountOperation");
        try {
            this.f18873b.mo12112a(Status.f30107a, (Bundle) a.mo33923c(this.f18872a).getResult(5, TimeUnit.SECONDS));
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            a2.mo25415d("Failed to remove %s account", e, this.f18872a);
            gql gql = new gql(10);
            gql.f18825a = e;
            throw gql.mo12128a();
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f18873b.mo12112a(status, (Bundle) null);
    }
}
