package com.google.android.gms.languageprofile.service;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountsChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private final bmzi f79277a;

    public AccountsChangedIntentOperation() {
        this.f79277a = adwo.f62842a;
    }

    /* renamed from: a */
    public static Intent m66808a(Context context) {
        return IntentOperation.getStartIntent(context, AccountsChangedIntentOperation.class, "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
    }

    public final void onHandleIntent(Intent intent) {
        adxt.m51334a();
        bngx d = adxt.m51341d();
        if (ceqz.f183340a.mo6606a().mo79671k()) {
            bnre i = d.listIterator();
            while (i.hasNext()) {
                String str = (String) i.next();
                try {
                    adwv.m51294a().mo33876a(str).get(ceqz.f183340a.mo6606a().mo79672l(), TimeUnit.MILLISECONDS);
                    adxt.m51334a();
                    adxt.m51344e(str);
                } catch (Exception e) {
                    Log.e("AccountsChangedIntentOp", "exception while subscribe", e);
                }
            }
        }
        adxt.m51334a();
        List c = adxt.m51340c();
        int size = c.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = (String) c.get(i2);
            try {
                String valueOf = String.valueOf(str2);
                Log.i("AccountsChangedIntentOp", valueOf.length() == 0 ? new String("unsubscribe the deleted account ") : "unsubscribe the deleted account ".concat(valueOf));
                adxt.m51334a();
                adxt.m51342d(str2);
            } catch (Exception e2) {
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 29);
                sb.append("exception while unsubscribe: ");
                sb.append(valueOf2);
                Log.e("AccountsChangedIntentOp", sb.toString());
            }
        }
        if (cere.m138102c()) {
            try {
                ((aecs) this.f79277a.mo6606a()).mo34087e(advd.SYNC_ID_WIPEOUT).get();
            } catch (ExecutionException e3) {
                Log.e("AccountsChangedIntentOp", "Error while scheduling a one time sync", e3);
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                Log.e("AccountsChangedIntentOp", "Interruption occurred during scheduling a one time sync", e4);
            }
        }
    }

    AccountsChangedIntentOperation(bmzi bmzi) {
        this.f79277a = bmzi;
    }
}
