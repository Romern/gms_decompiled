package com.google.android.gms.lockbox;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.AccountChangeEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LockboxAccountsChangedChimeraReceiver extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        List list;
        int i;
        if (intent != null && "android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction())) {
            aeyh aeyh = new aeyh(this);
            aezn aezn = aeyh.f64005a;
            HashSet hashSet = new HashSet();
            synchronized (aezn.f64046a) {
                for (String str : aezn.f64046a.getAll().keySet()) {
                    if (str.startsWith("opt-in-status-")) {
                        hashSet.add(str.substring(14, str.lastIndexOf(45)));
                    }
                }
                String a = aezn.mo34680a();
                if (!TextUtils.isEmpty(a)) {
                    hashSet.add(a);
                }
            }
            ArrayList arrayList = new ArrayList(hashSet);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = (String) arrayList.get(i2);
                aeyg aeyg = aeyh.f64006b;
                try {
                    aezn aezn2 = aeyg.f64003a;
                    synchronized (aezn2.f64046a) {
                        aezn2.mo34684b();
                        i = aezn2.f64046a.getInt(aezn.m52735b(str2), 0);
                    }
                    list = gie.m13191a(aeyg.f64004b, i, str2);
                } catch (gid | IOException e) {
                    Log.e("LockboxAcctChgService", "Error getting account change events.");
                    list = null;
                }
                if (list != null && !list.isEmpty()) {
                    AccountChangeEvent accountChangeEvent = (AccountChangeEvent) list.get(0);
                    aezn aezn3 = aeyh.f64005a;
                    int i3 = accountChangeEvent.f9908e;
                    synchronized (aezn3.f64046a) {
                        aezn3.mo34684b();
                        SharedPreferences.Editor edit = aezn3.f64046a.edit();
                        edit.putInt(aezn.m52735b(str2), i3);
                        edit.apply();
                    }
                    if (accountChangeEvent.f9907d == 4) {
                        String str3 = accountChangeEvent.f9909f;
                        aezn aezn4 = aeyh.f64005a;
                        synchronized (aezn4.f64046a) {
                            SharedPreferences.Editor edit2 = aezn4.f64046a.edit();
                            if (str2.equals(aezn4.mo34680a())) {
                                edit2.putString("signed-in-account", str3);
                            }
                            edit2.apply();
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }
}
