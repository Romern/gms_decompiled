package com.google.android.gms.udc.intentoperation;

import android.accounts.Account;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.udc.service.UdcContextInitChimeraService;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UdcAccountChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private final bmzi f109376a;

    /* renamed from: b */
    private final bmzi f109377b;

    public UdcAccountChangedIntentOperation() {
        this.f109376a = new avdd(this);
        this.f109377b = new avde(this);
    }

    /* renamed from: a */
    private final void m93656a(Account account) {
        ((bboa) this.f109376a.mo6606a()).mo56266a(account).mo56224a(auzv.ACCOUNT_CHANGE);
    }

    public final void onHandleIntent(Intent intent) {
        if (chbh.m148019q()) {
            for (Account account : gre.m13766a(intent)) {
                m93656a(account);
            }
            for (Account account2 : gre.m13767a(intent.getParcelableArrayExtra("accountsMutated"))) {
                m93656a(account2);
            }
        }
        try {
            ((bbjm) this.f109377b.mo6606a()).mo34087e(aval.SYNC_ID_CUSTOM_CACHE).get();
            if (!chbh.m148017o()) {
                UdcContextInitChimeraService.m93661a(this);
            }
            HashSet<String> hashSet = new HashSet();
            for (String str : getSharedPreferences("UdcConsistencyTokenPrefs", 0).getAll().keySet()) {
                String[] split = str.split(":");
                if (split.length == 2 && !TextUtils.isEmpty(split[0])) {
                    hashSet.add(split[0]);
                }
            }
            for (Account account3 : soz.m35801d(this, "com.google.android.gms")) {
                try {
                    String c = aviz.m78601c(this, gik.m13218f(this, account3.name));
                    if (!TextUtils.isEmpty(c)) {
                        hashSet.remove(c);
                    }
                } catch (gid | IOException e) {
                    bnsl bnsl = (bnsl) aviz.f93261a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("Could not retrieve accountId");
                }
            }
            for (String str2 : hashSet) {
                aviz.m78600b(this, str2);
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    UdcAccountChangedIntentOperation(bboa bboa, bbjm bbjm) {
        this.f109376a = new avdf(bboa);
        this.f109377b = new avdg(bbjm);
    }
}
