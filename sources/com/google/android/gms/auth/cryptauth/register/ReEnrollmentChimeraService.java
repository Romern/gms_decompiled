package com.google.android.gms.auth.cryptauth.register;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.auth.cryptauth.AppClaim;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReEnrollmentChimeraService extends aeah {

    /* renamed from: a */
    private static final sek f10560a = new sek(new String[]{"ReEnrollmentChimeraService"}, (byte[]) null);

    public ReEnrollmentChimeraService() {
        this(new isr(), new ith());
    }

    /* renamed from: a */
    static final void m6552a(Account account, ipx ipx, ite ite) {
        ipx.mo13242c();
        long j = ipx.f21535b.getLong(ipx.mo13240a("checkinafter"), ((Long) ipl.f21502l.mo58455c()).longValue());
        long longValue = ((Long) ipl.f21492b.mo58455c()).longValue();
        ite.mo13334a(account.name, j, j + longValue, ipj.m15813a(ipx.mo13239a()));
    }

    public ReEnrollmentChimeraService(isr isr, ith ith) {
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        int i;
        ArrayList arrayList;
        aecc aecc2 = aecc;
        String string = aecc2.f63129b.getString("account");
        Context applicationContext = getApplicationContext();
        int i2 = 0;
        if (bmxx.m108577a(string)) {
            i = 0;
        } else if (!soz.m35791a(applicationContext, new Account(string, "com.google"))) {
            i = 0;
        } else {
            Account account = new Account(string, "com.google");
            Context applicationContext2 = getApplicationContext();
            ite ite = new ite(applicationContext2);
            f10560a.mo25412b("Performing re-enrollment with tag=%s", aecc2.f63128a);
            ipx ipx = new ipx(applicationContext2, account);
            int b = (int) ipx.mo13241b();
            iss a = isr.m16057a(applicationContext2, b, ite.m16093a(aecc2.f63128a));
            if (((long) b) > ipx.f21535b.getLong(ipx.mo13240a("retryattempts"), ((Long) ipl.f21503m.mo58455c()).longValue())) {
                f10560a.mo25416d("Number of retries exceeded allowed number of retries.", new Object[0]);
                ipx.mo13242c();
                m6552a(account, ipx, ite);
                return 2;
            }
            ipz ipz = new ipz(applicationContext2);
            Set<String> stringSet = ipz.f21542b.getStringSet(string, null);
            if (stringSet != null) {
                arrayList = new ArrayList();
                arrayList.addAll(stringSet);
            } else {
                arrayList = null;
            }
            ipr ipr = new ipr(applicationContext2);
            try {
                byte[] k = ith.m16097a(applicationContext2).mo13336a(ipr.mo13227a(string)).mo73642k();
                a.f21627d = 6;
                itc itc = new itc(applicationContext2, account, a);
                ehd ehd = new ehd();
                ehd.mo10138a(account.name);
                ehd.mo10141b("com.google.android.gms");
                ehd.f14912c = k;
                ehd.f14910a = itj.m16102a(2);
                ehd.mo10136a(new ipo(applicationContext2));
                ehd.mo10135a(new ipj(applicationContext2, account));
                ehd.f14917h = ipr;
                ehd.f14918i = new sek(new String[]{"ReEnrollmentCryptauthFramework"}, (byte[]) null);
                ehd.mo10140a(true);
                ehd.mo10137a(itc);
                if (arrayList != null && !arrayList.isEmpty()) {
                    ehd.mo10139a(arrayList);
                }
                asfb asfb = r9;
                ehd ehd2 = ehd;
                itc itc2 = itc;
                asfb asfb2 = new asfb(applicationContext2, 1, "CryptauthEnroller", null, "com.google.android.gms");
                asfb.mo49111a(30000);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    f10560a.mo25412b("Starting ReEnrollment", new Object[0]);
                    ehi a2 = itg.m16096a(ehd2.mo10134a());
                    a.f21625b = a2.f14968a.f14966p;
                    a.mo13321a(2, SystemClock.elapsedRealtime() - elapsedRealtime);
                    Intent intent = new Intent("com.google.android.gms.auth.cryptauth.register.KEY_CHANGED");
                    for (String str : a2.f14969b.keySet()) {
                        eho a3 = a2.mo10148a(str);
                        if (bqmb.CUSTOM.equals(a3.f14986b)) {
                            ehh ehh = a2.f14968a;
                            ArrayList arrayList2 = new ArrayList();
                            ipz ipz2 = ipz;
                            Iterator it = a3.f14985a.iterator();
                            while (it.hasNext()) {
                                eha eha = (eha) it.next();
                                arrayList2.add(new AppClaim(eha.f14901a, eha.f14902b, eha.f14903c));
                                string = string;
                                it = it;
                                applicationContext2 = applicationContext2;
                                a2 = a2;
                            }
                            String str2 = string;
                            Context context = applicationContext2;
                            ehi ehi = a2;
                            String str3 = a3.f14987c;
                            KeyRegistrationResult keyRegistrationResult = new KeyRegistrationResult(ito.m16125a(ehh), a3.f14988d, arrayList2);
                            String valueOf = String.valueOf(str3);
                            sef.m35071a(keyRegistrationResult, intent, valueOf.length() == 0 ? new String("key_reg_result") : "key_reg_result".concat(valueOf));
                            ipz = ipz2;
                            string = str2;
                            applicationContext2 = context;
                            a2 = ehi;
                            i2 = 0;
                        } else {
                            i2 = 0;
                        }
                    }
                    applicationContext2.sendBroadcast(intent, "com.google.android.gms.auth.cryptauth.permission.KEY_CHANGE");
                    synchronized (ipz.f21541a) {
                        ipz.f21542b.edit().remove(string).commit();
                    }
                    if (asfb.mo49124e()) {
                        asfb.mo49120c();
                    }
                    itc2.mo13331a();
                    return i2;
                } catch (ehf e) {
                    try {
                        a.f21625b = e.f14947a.f14966p;
                        a.mo13321a(2, SystemClock.elapsedRealtime() - elapsedRealtime);
                        if (e.f14947a.f14967q) {
                            long b2 = ipx.mo13241b();
                            synchronized (ipx.f21534a) {
                                ipx.f21535b.edit().putLong(ipx.mo13240a("currentretryattempt"), b2 + 1).commit();
                                if (asfb.mo49124e()) {
                                    asfb.mo49120c();
                                }
                                itc2.mo13331a();
                                return 1;
                            }
                        }
                        m6552a(account, ipx, ite);
                        if (asfb.mo49124e()) {
                            asfb.mo49120c();
                        }
                        itc2.mo13331a();
                        return 2;
                    } catch (Throwable th) {
                        if (asfb.mo49124e()) {
                            asfb.mo49120c();
                        }
                        itc2.mo13331a();
                        throw th;
                    }
                }
            } catch (iqr e2) {
                f10560a.mo25418e("Error while creating client metadata.", new Object[0]);
                return 1;
            }
        }
        f10560a.mo25416d("Account doesn't exist on device", new Object[i]);
        return 2;
    }
}
