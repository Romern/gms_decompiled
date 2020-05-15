package com.google.android.gms.auth.cryptauth.devicesync;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceSyncChimeraService extends aeah {

    /* renamed from: a */
    private static final sek f10558a = new sek(new String[]{"DeviceSyncChimeraService"}, (byte[]) null);

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        ArrayList arrayList;
        ArrayList arrayList2;
        aecc aecc2 = aecc;
        if (ccfa.m129418b()) {
            Bundle bundle = aecc2.f63129b;
            if (bundle != null) {
                String string = bundle.getString("account_name");
                Context applicationContext = getApplicationContext();
                if (bmxx.m108577a(string) || !soz.m35791a(applicationContext, new Account(string, "com.google"))) {
                    f10558a.mo25416d("Account doesn't exist on device", new Object[0]);
                    return 2;
                }
                Account account = new Account(string, "com.google");
                ipy ipy = new ipy(getApplicationContext(), string);
                Set<String> stringSet = ipy.f21539b.getStringSet(ipy.mo13244a("ALL_KEYS", "ALL_KEY_NAMES"), null);
                if (stringSet != null) {
                    arrayList = bnkn.m109663a(stringSet);
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    int a = ipy.mo13243a();
                    iqb a2 = iqa.m15886a(this, account, isr.m16057a(this, a, 3));
                    iqf a3 = iqe.m15892a(this, a2);
                    int size = arrayList.size();
                    int i = 1;
                    int i2 = 0;
                    boolean z = true;
                    while (i2 < size) {
                        String str = (String) arrayList.get(i2);
                        Set<String> stringSet2 = ipy.f21539b.getStringSet(ipy.mo13244a("FEATURE", str), null);
                        if (stringSet2 != null) {
                            arrayList2 = bnkn.m109663a(stringSet2);
                        } else {
                            arrayList2 = null;
                        }
                        if (arrayList2 != null) {
                            sek sek = f10558a;
                            Object[] objArr = new Object[i];
                            objArr[0] = aecc2.f63128a;
                            sek.mo25412b("Performing device sync with tag=%s", objArr);
                            z &= a3.mo13258a(account, str, ipy.mo13245a(str), arrayList2, a, (String) null);
                            i2++;
                            size = size;
                            a2 = a2;
                            i = 1;
                        } else {
                            f10558a.mo25416d("Missing feature names", new Object[0]);
                            return 2;
                        }
                    }
                    a2.mo13254a();
                    if (!z) {
                        long a4 = (long) ipy.mo13243a();
                        synchronized (ipy.f21538a) {
                            ipy.f21539b.edit().putLong(ipy.mo13244a("CONSECUTIVE_FAILURES", "NUM_CONSECUTIVE_FAILURES"), a4 + 1).commit();
                        }
                        return 1;
                    }
                    synchronized (ipy.f21538a) {
                        ipy.f21539b.edit().putLong(ipy.mo13244a("CONSECUTIVE_FAILURES", "NUM_CONSECUTIVE_FAILURES"), 1).commit();
                    }
                    return 0;
                }
                f10558a.mo25416d("Missing keys", new Object[0]);
                return 2;
            }
            f10558a.mo25416d("Missing task parameters", new Object[0]);
        }
        return 2;
    }
}
