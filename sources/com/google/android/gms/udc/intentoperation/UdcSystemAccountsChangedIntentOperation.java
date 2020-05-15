package com.google.android.gms.udc.intentoperation;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.AccountChangeEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UdcSystemAccountsChangedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        List list;
        avca avca;
        Iterator it;
        int i;
        if (intent != null && "android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction())) {
            avca avca2 = new avca(this);
            Iterator it2 = avca2.f92940b.mo51146a().iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                int i2 = 0;
                try {
                    avce avce = avca2.f92940b;
                    synchronized (avce.f92955b) {
                        avce.mo51150c();
                        i = avce.f92955b.getInt(avce.m78239a(str), 0);
                    }
                    list = gik.m13213b(avca2.f92941c, i, str);
                } catch (gid | IOException e) {
                    bnsl bnsl = (bnsl) avca.f92939a.mo68387b();
                    bnsl.mo68432a("avca", "a", 46, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Error getting account change events.");
                    list = null;
                }
                if (list != null) {
                    if (!list.isEmpty()) {
                        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) list.get(0);
                        avce avce2 = avca2.f92940b;
                        int i3 = accountChangeEvent.f9908e;
                        synchronized (avce2.f92955b) {
                            avce2.mo51150c();
                            SharedPreferences.Editor edit = avce2.f92955b.edit();
                            edit.putInt(avce.m78239a(str), i3);
                            edit.apply();
                        }
                        if (accountChangeEvent.f9907d == 4) {
                            String str2 = accountChangeEvent.f9909f;
                            avce avce3 = avca2.f92940b;
                            synchronized (avce3.f92955b) {
                                boolean b = avce3.mo51148b();
                                SharedPreferences.Editor edit2 = avce3.f92955b.edit();
                                int[] iArr = avce.f92952a;
                                int length = iArr.length;
                                while (i2 < length) {
                                    int i4 = iArr[i2];
                                    String c = avce.m78240c(str, i4);
                                    String d = avce.m78241d(str, i4);
                                    boolean z = avce3.f92955b.getBoolean(c, b);
                                    long j = avce3.f92955b.getLong(d, 0);
                                    edit2.putBoolean(avce.m78240c(str2, i4), z);
                                    edit2.remove(c);
                                    edit2.putLong(avce.m78241d(str2, i4), j);
                                    edit2.remove(d);
                                    i2++;
                                    avca2 = avca2;
                                    it2 = it2;
                                }
                                avca = avca2;
                                it = it2;
                                edit2.apply();
                            }
                            avca2 = avca;
                            it2 = it;
                        }
                    }
                }
            }
        }
    }
}
