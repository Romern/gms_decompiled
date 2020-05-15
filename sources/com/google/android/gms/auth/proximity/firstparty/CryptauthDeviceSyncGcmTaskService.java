package com.google.android.gms.auth.proximity.firstparty;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CryptauthDeviceSyncGcmTaskService extends aeah {

    /* renamed from: a */
    private static final sek f11153a = jsy.m17256a("CryptauthDeviceSyncGcmTaskService");

    /* renamed from: a */
    private static aebo m6781a(int i, int i2) {
        aebn aebn = new aebn();
        aebn.f63074a = 0;
        aebn.f63075b = i;
        aebn.f63076c = i2;
        return aebn.mo34011a();
    }

    /* renamed from: b */
    private static String m6788b(String str) {
        int hashCode = str.hashCode();
        StringBuilder sb = new StringBuilder(51);
        sb.append("CryptauthDeviceSyncGcmTaskService_retry_");
        sb.append(hashCode);
        return sb.toString();
    }

    /* renamed from: d */
    private static String m6790d(String str) {
        int hashCode = str.hashCode();
        StringBuilder sb = new StringBuilder(54);
        sb.append("CryptauthDeviceSyncGcmTaskService_periodic_");
        sb.append(hashCode);
        return sb.toString();
    }

    /* renamed from: e */
    private static String m6791e(String str) {
        int hashCode = str.hashCode();
        StringBuilder sb = new StringBuilder(48);
        sb.append("CryptauthDeviceSyncGcmTaskService_v2_");
        sb.append(hashCode);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m6789b(Context context, Account account, joi joi) {
        aeat.m51532a(context).mo33986a(m6791e(account.name), "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService");
        joi.mo13940a(account.name);
    }

    /* renamed from: a */
    private final Account m6782a(String str) {
        jta a = jsz.m17257a();
        Account account = null;
        if (str == null) {
            a.mo14037D(2);
            return null;
        }
        for (Account account2 : soz.m35801d(this, getPackageName())) {
            if (imv.m15741a(account2.name).equals(imv.m15741a(str))) {
                account = account2;
            }
        }
        int i = 1;
        if (account == null) {
            f11153a.mo25418e("Invalid account: %s", str);
        } else {
            i = 0;
        }
        a.mo14037D(i);
        return account;
    }

    /* renamed from: a */
    private final void m6783a(Account account, joi joi, String str) {
        long g = cchr.m129719g();
        long currentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.SECONDS.toMillis(g);
        m6787a(getApplicationContext(), account, joi, str);
        joi.mo13941a(account.name, currentTimeMillis + millis);
    }

    /* renamed from: a */
    public static void m6784a(Context context) {
        List<Account> d = soz.m35801d(context.getApplicationContext(), context.getPackageName());
        joj joj = new joj(context);
        jok jok = new jok(context);
        for (Account account : d) {
            if (cchu.m129750f()) {
                m6787a(context, account, jok, m6791e(account.name));
            } else {
                m6789b(context, account, jok);
            }
            if (!cchr.m129720h() || cchu.m129747c()) {
                m6786a(context, account, joj);
            } else {
                m6787a(context, account, joj, m6790d(account.name));
            }
        }
    }

    /* renamed from: a */
    public static void m6785a(Context context, Account account) {
        int d = (int) cchr.m129716d();
        Bundle bundle = new Bundle();
        bundle.putString("ACCOUNT_NAME", account.name);
        aeat a = aeat.m51532a(context);
        aebi aebi = new aebi();
        aebi.f63107s = bundle;
        aebi.f63097i = "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService";
        aebi.f63099k = m6788b(account.name);
        aebi.mo34004a((long) (d / 2), (long) d);
        aebi.mo34027b(1);
        aebi.f63102n = true;
        aebi.f63106r = m6781a(d, (int) cchr.m129718f());
        a.mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public static void m6786a(Context context, Account account, joi joi) {
        aeat.m51532a(context).mo33986a(m6790d(account.name), "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService");
        aeat.m51532a(context).mo33986a(m6788b(account.name), "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService");
        joi.mo13940a(account.name);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    private static void m6787a(Context context, Account account, joi joi, String str) {
        boolean z;
        long j;
        Account account2 = account;
        joi joi2 = joi;
        long g = cchr.m129719g();
        long h = cchr.f178999a.mo6606a().mo75976h();
        int d = (int) cchr.m129716d();
        int f = (int) cchr.m129718f();
        String str2 = account2.name;
        Long valueOf = Long.valueOf(g);
        Long valueOf2 = Long.valueOf(h);
        Long valueOf3 = Long.valueOf((long) d);
        Long l = valueOf2;
        Long valueOf4 = Long.valueOf((long) f);
        if (Objects.hash(valueOf, valueOf2, valueOf3, valueOf4) != joi2.f22937a.getSharedPreferences("com.google.android.gms.auth.proximity.firstparty.DEVICE_SYNC_CONFIG_PREFERENCE_FILE", 0).getInt(joi2.mo13942b(str2), 0)) {
            String str3 = account2.name;
            joi2.f22937a.getSharedPreferences("com.google.android.gms.auth.proximity.firstparty.DEVICE_SYNC_CONFIG_PREFERENCE_FILE", 0).edit().putInt(joi2.mo13942b(str3), Objects.hash(valueOf, l, valueOf3, valueOf4)).apply();
            joi2.mo13940a(account2.name);
            z = true;
        } else {
            z = false;
        }
        long j2 = joi2.f22937a.getSharedPreferences("com.google.android.gms.auth.proximity.firstparty.DEVICE_SYNC_CONFIG_PREFERENCE_FILE", 0).getLong(joi2.mo13943c(account2.name), -1);
        if (j2 != -1) {
            j = TimeUnit.MILLISECONDS.toSeconds(j2 - System.currentTimeMillis());
        } else {
            double random = Math.random();
            double d2 = (double) g;
            Double.isNaN(d2);
            j = (long) (random * d2);
        }
        long max = Math.max(60L, j);
        joi2.mo13941a(account2.name, System.currentTimeMillis() + max);
        Bundle bundle = new Bundle();
        bundle.putString("ACCOUNT_NAME", account2.name);
        aeat a = aeat.m51532a(context);
        aebi aebi = new aebi();
        aebi.f63107s = bundle;
        aebi.f63097i = "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService";
        aebi.f63099k = str;
        aebi.mo34004a(max, h + max);
        aebi.mo34029b(z);
        aebi.f63102n = true;
        aebi.mo34024a(0, cdny.m134339d() ? 1 : 0);
        aebi.f63106r = m6781a(d, f);
        a.mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        int i = 5;
        if (aecc.f63128a.startsWith("CryptauthDeviceSyncGcmTaskService_v2_")) {
            jta a = jsz.m17257a();
            jok jok = new jok(this);
            if (!cchu.m129750f()) {
                for (Account account : soz.m35801d(getApplicationContext(), getPackageName())) {
                    m6789b(this, account, jok);
                }
                f11153a.mo25418e("Running v2 task with flag switched off!", new Object[0]);
                a.mo14039F(1);
                return 2;
            }
            Bundle bundle = aecc.f63129b;
            if (bundle != null && bundle.containsKey("ACCOUNT_NAME")) {
                Account a2 = m6782a(aecc.f63129b.getString("ACCOUNT_NAME"));
                if (a2 != null) {
                    try {
                        new jku(inl.m15759a(this), new jks()).mo13836a(this, a2);
                        i = 0;
                    } catch (jkt e) {
                        f11153a.mo25415d("Failed periodic device sync", e, new Object[0]);
                    }
                    a.mo14039F(i);
                    m6783a(a2, jok, aecc.f63128a);
                    return 0;
                }
                f11153a.mo25418e("Null account retrieved from account name.", new Object[0]);
                a.mo14039F(3);
                return 2;
            }
            f11153a.mo25418e("Missing account name", new Object[0]);
            a.mo14039F(4);
            return 2;
        }
        jta a3 = jsz.m17257a();
        joj joj = new joj(this);
        if (!cchr.m129720h()) {
            for (Account account2 : soz.m35801d(getApplicationContext(), getPackageName())) {
                m6786a(this, account2, joj);
            }
            a3.mo14038E(2);
            return 2;
        }
        boolean startsWith = aecc.f63128a.startsWith("CryptauthDeviceSyncGcmTaskService_periodic_");
        boolean startsWith2 = aecc.f63128a.startsWith("CryptauthDeviceSyncGcmTaskService_retry_");
        if (!startsWith && !startsWith2) {
            a3.mo14038E(3);
            return 2;
        }
        Bundle bundle2 = aecc.f63129b;
        if (bundle2 == null || !bundle2.containsKey("ACCOUNT_NAME")) {
            a3.mo14038E(5);
            return 2;
        }
        String string = aecc.f63129b.getString("ACCOUNT_NAME");
        Account a4 = m6782a(string);
        if (a4 == null) {
            a3.mo14038E(4);
            return 2;
        }
        try {
            jom.m17029a(this).mo13946b(a4, 15);
            aeat.m51532a(getApplicationContext()).mo33986a(m6788b(string), "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService");
            if (startsWith) {
                m6783a(a4, joj, aecc.f63128a);
            }
            a3.mo14038E(0);
            return 0;
        } catch (jon e2) {
            a3.mo14038E(1);
            return 1;
        }
    }
}
