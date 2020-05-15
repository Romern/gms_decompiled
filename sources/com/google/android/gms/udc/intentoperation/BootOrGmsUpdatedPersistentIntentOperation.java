package com.google.android.gms.udc.intentoperation;

import android.accounts.Account;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BootOrGmsUpdatedPersistentIntentOperation extends IntentOperation {

    /* renamed from: a */
    private final bmzi f109369a;

    /* renamed from: b */
    private final bmzi f109370b;

    public BootOrGmsUpdatedPersistentIntentOperation() {
        this.f109369a = new avcs(this);
        this.f109370b = new avct(this);
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.android.gms.udc.intentoperation.BOOT_OR_GMS_UPDATED".equals(intent.getAction())) {
            if (chbh.m148019q()) {
                ((bboa) this.f109369a.mo6606a()).mo56267c().mo56224a(auzv.DEVICE_BOOT);
            }
            try {
                ((bbjm) this.f109370b.mo6606a()).mo34078a().get();
                ((bbjm) this.f109370b.mo6606a()).mo34087e(aval.SYNC_ID_CUSTOM_CACHE).get();
                avce a = avce.m78238a(this);
                synchronized (a.f92955b) {
                    if (!a.mo51148b()) {
                        Set<String> a2 = a.mo51146a();
                        for (Account account : a.f92956c.mo33916a("com.google")) {
                            a2.add(account.name);
                        }
                        SharedPreferences.Editor edit = a.f92955b.edit();
                        for (String str : a2) {
                            int[] iArr = {10, 9};
                            for (int i = 0; i < 2; i++) {
                                String c = avce.m78240c(str, iArr[i]);
                                edit.putBoolean(c, a.f92955b.getBoolean(c, false));
                            }
                        }
                        edit.putBoolean("is-migrated", true);
                        edit.apply();
                    }
                }
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

    BootOrGmsUpdatedPersistentIntentOperation(bboa bboa, bbjm bbjm) {
        this.f109369a = new avcu(bboa);
        this.f109370b = new avcv(bbjm);
    }
}
