package com.google.android.gms.accountsettings.operations;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.accountsettings.p007mg.poc.model.repository.RepositoryDatabase;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    static sek f7796a = ffw.m11631a("AcctChgOp");

    /* renamed from: b */
    private RepositoryDatabase f7797b;

    public AccountChangedIntentOperation() {
    }

    public final void onCreate() {
        if (this.f7797b == null) {
            this.f7797b = RepositoryDatabase.m4960a(getApplicationContext());
        }
    }

    public final void onDestroy() {
        RepositoryDatabase repositoryDatabase = this.f7797b;
        if (repositoryDatabase != null) {
            repositoryDatabase.mo9942d();
        }
    }

    public final void onHandleIntent(Intent intent) {
        f7796a.mo25409a("Handle intent-operations: %s", intent);
        if (intent != null && "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction())) {
            f7796a.mo25409a("Remove data for obsolete accounts", new Object[0]);
            ArrayList arrayList = new ArrayList();
            for (Account account : soz.m35801d(this, getPackageName())) {
                arrayList.add(account.name);
            }
            RepositoryDatabase repositoryDatabase = this.f7797b;
            repositoryDatabase.mo6323k().mo10442b(arrayList);
            repositoryDatabase.mo6324l().mo10400a(arrayList);
            if (arrayList.isEmpty()) {
                repositoryDatabase.mo6325m().mo10419b();
            }
        }
    }

    protected AccountChangedIntentOperation(Context context, RepositoryDatabase repositoryDatabase) {
        attachBaseContext(context);
        this.f7797b = repositoryDatabase;
    }
}
