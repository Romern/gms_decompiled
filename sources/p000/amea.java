package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDoneException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.people.api.p060bg.PeoplePeriodicSyncChimeraGcmTask;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: amea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amea {

    /* renamed from: f */
    private static amea f74783f;

    /* renamed from: a */
    public final Context f74784a;

    /* renamed from: b */
    public final alsj f74785b;

    /* renamed from: c */
    public final ancw f74786c;

    /* renamed from: d */
    private final Object f74787d = new Object();

    /* renamed from: e */
    private final sqv f74788e;

    public amea(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f74784a = applicationContext;
        this.f74788e = ancm.m64005a(applicationContext);
        this.f74785b = alsj.m61651a(this.f74784a);
        this.f74786c = anbx.INSTANCE;
    }

    /* renamed from: a */
    public static synchronized amea m62724a(Context context) {
        amea amea;
        synchronized (amea.class) {
            if (f74783f == null) {
                f74783f = new amea(context);
            }
            amea = f74783f;
        }
        return amea;
    }

    /* renamed from: b */
    public static final int m62733b(Bundle bundle) {
        String a = anbj.m63920a(bundle);
        if ("plusfeed".equals(a)) {
            return 1;
        }
        if (!"pluspageadmin".equals(a)) {
            return (a == null || !a.startsWith("profile")) ? 0 : 4;
        }
        return 2;
    }

    /* renamed from: d */
    public static final boolean m62736d() {
        amdl.m62660a();
        return ContentResolver.getMasterSyncAutomatically();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo41147c() {
        long cK = cgbe.f186279a.mo6606a().mo83387cK();
        if (cK > 0) {
            long j = this.f74785b.f74200a.getLong("last_known_mutation_time", 0);
            if (j != 0) {
                long a = this.f74788e.mo20505a();
                long j2 = (cK * 1000) + j;
                if (j <= a) {
                    return Math.max(0L, j2 - a);
                }
                alsj alsj = this.f74785b;
                sdo.m34973b((String) null);
                alsj.f74200a.edit().putLong("last_known_mutation_time", a).commit();
                return mo41147c();
            }
        }
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amea.a(boolean, boolean):android.os.Bundle
     arg types: [int, int]
     candidates:
      amea.a(java.lang.String, long):java.util.List
      amea.a(android.accounts.Account, java.lang.String):void
      amea.a(java.lang.String, java.lang.String):void
      amea.a(boolean, boolean):android.os.Bundle */
    /* renamed from: e */
    public final void mo41152e(String str, String str2) {
        aluj.m61899a(this.f74784a, "PeopleSync", str, str2.length() == 0 ? new String("Contacts sync requested. reason=") : "Contacts sync requested. reason=".concat(str2));
        Bundle a = m62725a(false, false);
        a.putBoolean("gms.people.contacts_sync", true);
        if (!TextUtils.isEmpty(str2)) {
            a.putString("gms.people.sync_reason", str2);
        }
        Account a2 = this.f74786c.mo41676a(this.f74784a, str);
        if (a2 != null) {
            m62728a(a2, "com.google.android.gms.people", a);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amea.a(boolean, boolean, boolean):android.os.Bundle
     arg types: [boolean, boolean, int]
     candidates:
      amea.a(android.accounts.Account, java.lang.String, int):void
      amea.a(android.accounts.Account, java.lang.String, android.os.Bundle):void
      amea.a(android.accounts.Account, java.lang.String, boolean):void
      amea.a(java.lang.String, java.lang.String, long):boolean
      amea.a(boolean, boolean, boolean):android.os.Bundle */
    /* renamed from: a */
    public static Bundle m62725a(boolean z, boolean z2) {
        return m62726a(z, z2, false);
    }

    /* renamed from: a */
    public static Bundle m62726a(boolean z, boolean z2, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ignore_settings", true);
        if (cgay.m144129b() && z3) {
            bundle.putBoolean("container_update", true);
        }
        if (z) {
            bundle.putBoolean("ignore_backoff", true);
        }
        if (z2) {
            bundle.putBoolean("expedited", true);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final long mo41150d(String str, String str2) {
        long a = altn.m61774a(this.f74784a).mo40738a(str, str2);
        alto b = altq.m61806a(this.f74784a).mo40763b();
        if (b != null) {
            try {
                return b.mo40749b("SELECT last_successful_sync_time FROM owners WHERE _id=?", new String[]{String.valueOf(a)});
            } catch (SQLiteDoneException e) {
            }
        }
        return -1;
    }

    /* renamed from: b */
    static Bundle m62734b() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("periodic_sync", true);
        return bundle;
    }

    /* renamed from: b */
    private static final boolean m62735b(Account account, String str) {
        amdl.m62660a();
        return ContentResolver.getSyncAutomatically(account, str);
    }

    /* renamed from: d */
    public final boolean mo41151d(String str) {
        Account a = this.f74786c.mo41676a(this.f74784a, str);
        if (a != null) {
            return m62735b(a, "com.google.android.gms.people");
        }
        return false;
    }

    /* renamed from: b */
    public final List mo41145b(String str) {
        alto b = altq.m61806a(this.f74784a).mo40763b();
        ArrayList arrayList = new ArrayList();
        if (b == null) {
            return arrayList;
        }
        Cursor a = b.mo40744a("SELECT owner_sync_requests.page_gaia_id,last_sync_start_time FROM owner_sync_requests JOIN owners ON owner_sync_requests.account_name=owners.account_name AND ((owner_sync_requests.page_gaia_id IS NULL AND owners.page_gaia_id IS NULL ) OR owner_sync_requests.page_gaia_id=owners.page_gaia_id) WHERE owner_sync_requests.account_name=? AND owner_sync_requests.page_gaia_id IS NOT NULL AND owner_sync_requests.sync_requested_time>last_sync_start_time ORDER BY owner_sync_requests.sync_requested_time", new String[]{str});
        while (a.moveToNext()) {
            try {
                arrayList.add(a.getString(0));
            } finally {
                a.close();
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo41148c(String str) {
        sdo.m34959a((Object) str);
        this.f74785b.mo40691b(str, 0);
    }

    /* renamed from: a */
    public static final void m62727a(Account account, String str, int i) {
        amdl.m62660a();
        ContentResolver.setIsSyncable(account, str, i);
    }

    /* renamed from: c */
    public final boolean mo41149c(String str, String str2) {
        if (!m62736d() || !mo41151d(str)) {
            return false;
        }
        if (str2 != null) {
            return mo41141a(str);
        }
        return true;
    }

    /* renamed from: a */
    public static final void m62728a(Account account, String str, Bundle bundle) {
        amdl.m62660a();
        ContentResolver.requestSync(account, str, bundle);
    }

    /* renamed from: b */
    public final boolean mo41146b(String str, String str2) {
        return str2 == null && m62736d() && mo41151d(str);
    }

    /* renamed from: a */
    public static final void m62729a(Account account, String str, boolean z) {
        amdl.m62660a();
        ContentResolver.setSyncAutomatically(account, str, z);
    }

    /* renamed from: a */
    public static boolean m62730a(int i) {
        return i == 1 || (cgav.m144110c() && i == 8);
    }

    /* renamed from: a */
    public static boolean m62731a(Bundle bundle) {
        return bundle != null && bundle.getBoolean("periodic_gcm", false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alto.a(java.lang.String, java.lang.Object[]):void
     arg types: [java.lang.String, java.lang.String[]]
     candidates:
      alto.a(java.lang.String, android.content.ContentValues):long
      alto.a(java.lang.String, java.lang.String[]):android.database.Cursor
      alto.a(java.lang.String, java.lang.Object[]):void */
    /* renamed from: a */
    private final boolean m62732a(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, boolean z4) {
        boolean z5;
        boolean z6;
        Cursor a;
        String str6 = str;
        String str7 = str2;
        long j2 = j;
        String str8 = str3;
        String str9 = str4;
        boolean z7 = z3;
        String str10 = str5;
        if (z7) {
            z5 = mo41146b(str, str2);
        } else {
            z5 = false;
        }
        boolean z8 = j2 == 0 || !mo41142a(str, str2, j);
        aluj.m61900a(this.f74784a, "PeopleSync", str6, str7, String.format(Locale.US, "###Sync requested: allowance=%d, needFreshData=%d, ignoreBackoff=%d, skipBecauseOfBackgroundSync=%d, isDisabledByBackgroundSync=%d, client=%s/%s, reason=%s responseMasking=%s", Long.valueOf(j), Integer.valueOf(z8 ? 1 : 0), Integer.valueOf(z ? 1 : 0), Integer.valueOf(z5 ? 1 : 0), Integer.valueOf(z3 ? 1 : 0), str8, str9, str10, Boolean.valueOf(cgbe.m144187p())));
        almk a2 = almk.m61263a();
        Context context = this.f74784a;
        boolean p = cgbe.m144187p();
        boolean z9 = z5;
        if (((double) ancm.f76635f.nextFloat()) < cgbe.f186279a.mo6606a().mo83397cU()) {
            bxvd da = ammq.f75359l.mo74144da();
            amnw a3 = almk.m61264a(context, str6, str7);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ammq ammq = (ammq) da.f164949b;
            a3.getClass();
            ammq.f75362b = a3;
            ammq.f75361a |= 1;
            int b = almk.m61268b(str3);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ammq ammq2 = (ammq) da.f164949b;
            ammq2.f75361a |= 2;
            ammq2.f75363c = b;
            String b2 = ancm.m64011b(str4);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ammq ammq3 = (ammq) da.f164949b;
            b2.getClass();
            int i = ammq3.f75361a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            ammq3.f75361a = i;
            ammq3.f75370j = b2;
            int i2 = i | 4;
            ammq3.f75361a = i2;
            ammq3.f75364d = j2;
            int i3 = i2 | 8;
            ammq3.f75361a = i3;
            ammq3.f75365e = z;
            int i4 = i3 | 16;
            ammq3.f75361a = i4;
            ammq3.f75366f = z2;
            int i5 = i4 | 32;
            ammq3.f75361a = i5;
            ammq3.f75367g = z7;
            int i6 = i5 | 64;
            ammq3.f75361a = i6;
            ammq3.f75368h = z8;
            int i7 = i6 | 128;
            ammq3.f75361a = i7;
            z6 = z9;
            ammq3.f75369i = z6;
            ammq3.f75361a = i7 | 512;
            ammq3.f75371k = p;
            ammq ammq4 = (ammq) da.mo74062i();
            bxvd da2 = amoh.f75593x.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            amoh amoh = (amoh) da2.f164949b;
            ammq4.getClass();
            amoh.f75597c = ammq4;
            amoh.f75595a |= 2;
            boolean c = soz.m35800c(context);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            amoh amoh2 = (amoh) da2.f164949b;
            int i8 = amoh2.f75595a | 8;
            amoh2.f75595a = i8;
            amoh2.f75599e = c;
            amoh2.f75600f = 1;
            amoh2.f75595a = i8 | 32;
            a2.mo40520a(context, da2);
            alml.m61288a(str6, da2);
        } else {
            z6 = z9;
        }
        if (!z8 || z6) {
            return false;
        }
        alto c2 = altq.m61806a(this.f74784a).mo40768c();
        if (c2 != null) {
            c2.mo40746a();
            try {
                String b3 = altn.m61774a(this.f74784a).mo40739b(str6, str7);
                if (!TextUtils.isEmpty(b3)) {
                    a = c2.mo40744a("SELECT COUNT(*)  FROM owner_sync_requests JOIN owners ON owner_sync_requests.account_name=owners.account_name AND ((owner_sync_requests.page_gaia_id IS NULL AND owners.page_gaia_id IS NULL ) OR owner_sync_requests.page_gaia_id=owners.page_gaia_id) WHERE owners._id=? AND owner_sync_requests.sync_requested_time>owners.last_sync_start_time", new String[]{b3});
                    if (!a.moveToFirst() || a.getLong(0) <= 0) {
                        a.close();
                    } else {
                        c2.mo40750b();
                        a.close();
                        c2.mo40753d();
                    }
                }
                c2.mo40748a("REPLACE INTO owner_sync_requests (account_name ,page_gaia_id ,sync_requested_time) VALUES (?,?,?)", (Object[]) new String[]{str6, str7, String.valueOf(this.f74788e.mo20505a())});
                c2.mo40750b();
                c2.mo40753d();
            } catch (Throwable th) {
                c2.mo40753d();
                throw th;
            }
        }
        Bundle a4 = m62725a(z, z2);
        if (!TextUtils.isEmpty(str3)) {
            a4.putString("gms.people.request_app_id", str8);
        }
        if (!TextUtils.isEmpty(str4)) {
            a4.putString("gms.people.request_package", str9);
        }
        if (!TextUtils.isEmpty(str5)) {
            a4.putString("gms.people.sync_reason", str5);
        }
        a4.putBoolean("page_only", !TextUtils.isEmpty(str2));
        if (z4) {
            a4.putBoolean("user_or_self_requested", true);
        }
        Account a5 = this.f74786c.mo41676a(this.f74784a, str6);
        if (a5 == null) {
            return false;
        }
        m62728a(a5, "com.google.android.gms.people", a4);
        return true;
    }

    /* renamed from: a */
    public final List mo41134a(String str, long j) {
        alto b = altq.m61806a(this.f74784a).mo40763b();
        ArrayList arrayList = new ArrayList();
        if (b == null) {
            return arrayList;
        }
        Cursor a = b.mo40744a("SELECT page_gaia_id FROM owners WHERE account_name=? AND page_gaia_id IS NOT NULL  AND last_successful_sync_time<? ORDER BY last_successful_sync_time", new String[]{str, String.valueOf(this.f74788e.mo20505a() - (j * 1000))});
        while (a.moveToNext()) {
            try {
                arrayList.add(a.getString(0));
            } finally {
                a.close();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo41135a() {
        Bundle b = m62734b();
        b.putBoolean("periodic_gcm", true);
        if (m62736d()) {
            bnrd a = this.f74786c.mo41680d(this.f74784a).iterator();
            boolean z = false;
            while (a.hasNext()) {
                Account account = (Account) a.next();
                if (m62735b(account, "com.google.android.gms.people")) {
                    String str = account.name;
                    m62728a(account, "com.google.android.gms.people", b);
                    z = true;
                }
            }
            if (z) {
                return;
            }
        }
        PeoplePeriodicSyncChimeraGcmTask.m67788a(this.f74784a);
        alsj alsj = this.f74785b;
        sdo.m34973b((String) null);
        alsj.f74200a.edit().remove("periodic_sync_gcm_flex_seconds").remove("periodic_sync_interval_seconds").remove("periodic_sync_require_charging").remove("periodic_sync_required_network").commit();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0092, code lost:
        if (r0.f74785b.f74200a.getInt("periodic_sync_required_network", 2) == r13) goto L_0x018f;
     */
    /* renamed from: a */
    public final void mo41136a(Account account) {
        boolean z;
        bnic bnic;
        long j;
        String str;
        Account account2 = account;
        sdo.m34959a(account);
        Bundle b = cgav.m144110c() ? m62734b() : Bundle.EMPTY;
        amdl.m62660a();
        new rtg(this.f74784a);
        rtg.m34395a(account2, "com.google.android.gms.people", b);
        if (cgbe.f186279a.mo6606a().mo83433dd()) {
            long f = cgbe.m144177f();
            long g = cgbe.m144178g();
            boolean h = cgbe.m144179h();
            int i = (int) cgbe.m144180i();
            if (g <= 0) {
                amdk.m62659b("PeopleSync", "Invalid periodic sync interval=%d", Long.valueOf(g));
            } else {
                if (this.f74785b.f74200a.getLong("periodic_sync_gcm_flex_seconds", 0) == f) {
                    j = f;
                    str = "periodic_sync_gcm_flex_seconds";
                    if (this.f74785b.f74200a.getLong("periodic_sync_interval_seconds", 0) == g) {
                        if (this.f74785b.f74200a.getBoolean("periodic_sync_require_charging", false) == h) {
                        }
                    }
                } else {
                    j = f;
                    str = "periodic_sync_gcm_flex_seconds";
                }
                alsj alsj = this.f74785b;
                sdo.m34973b((String) null);
                alsj.f74200a.edit().putLong(str, j).commit();
                alsj alsj2 = this.f74785b;
                sdo.m34973b((String) null);
                alsj2.f74200a.edit().putLong("periodic_sync_interval_seconds", g).commit();
                alsj alsj3 = this.f74785b;
                sdo.m34973b((String) null);
                alsj3.f74200a.edit().putBoolean("periodic_sync_require_charging", h).commit();
                alsj alsj4 = this.f74785b;
                sdo.m34973b((String) null);
                alsj4.f74200a.edit().putInt("periodic_sync_required_network", i).commit();
                PeoplePeriodicSyncChimeraGcmTask.m67788a(this.f74784a);
                Context context = this.f74784a;
                aeat a = almz.m61376a(context);
                double nextDouble = ancm.m64012b(context).nextDouble();
                double g2 = (double) cgbe.m144178g();
                Double.isNaN(g2);
                long longValue = Long.valueOf(Math.round(nextDouble * g2)).longValue();
                aebi aebi = new aebi();
                aebi.f63099k = "PeopleOneoffSyncGcmTask";
                aebi.f63097i = "com.google.android.gms.people.service.bg.PeopleOneoffSyncGcmTask";
                aebi.mo34023a((int) cgbe.m144180i());
                aebi.mo34024a(cgbe.m144179h() ? 1 : 0, (cdny.m134338c() || cgbe.m144179h()) ? 1 : 0);
                aebi.mo34004a(longValue, 1 + longValue);
                aebi.mo34027b(1);
                a.mo33984a(aebi.mo33974b());
            }
        } else {
            PeoplePeriodicSyncChimeraGcmTask.m67788a(this.f74784a);
            if (cgbb.f186273a.mo6606a().mo83217b()) {
                bnic = ancx.m64049b(this.f74784a);
            } else {
                bnic = this.f74786c.mo41680d(this.f74784a);
            }
            bnrd a2 = bnic.iterator();
            while (a2.hasNext()) {
                Bundle b2 = m62734b();
                long g3 = cgbe.m144178g();
                amdl.m62660a();
                new rtg(this.f74784a);
                rtg.m34396a((Account) a2.next(), "com.google.android.gms.people", b2, g3);
            }
        }
        ContentResolver contentResolver = this.f74784a.getContentResolver();
        if (!cgav.m144109b()) {
            amdl.m62660a();
            z = ashr.m74143a(contentResolver, account2, "com.google.android.gms.people", "plusupdates", "plusfeed", "pluspageadmin");
        } else {
            if (cgav.f186252a.mo6606a().mo83197a()) {
                amdl.m62660a();
                z = ashr.m74143a(contentResolver, account2, "com.google.android.gms.people", "plusupdates", new String[0]);
            }
            mo41139a("PeopleSync", "Unable to subscribe to feed.");
        }
        if (z) {
            return;
        }
        mo41139a("PeopleSync", "Unable to subscribe to feed.");
    }

    /* renamed from: a */
    public final void mo41137a(Account account, int i, Bundle bundle, int i2, Exception exc, List list, long j, boolean z, boolean z2, bmxv bmxv) {
        Exception exc2;
        int c;
        Account account2 = account;
        List list2 = list;
        if (i2 != 1 && ((c = alsj.m61651a(this.f74784a).mo40693c()) == 0 ? cgbe.f186279a.mo6606a().mo83380cD() : c != 1)) {
            PendingIntent activity = PendingIntent.getActivity(this.f74784a, 1, new Intent().setClassName(this.f74784a, "com.google.android.gms.people.settings.PeopleInternalSettingsActivity"), 134217728);
            C1102je jeVar = new C1102je(this.f74784a);
            jeVar.mo13630b(17301624);
            jeVar.mo13640e("People Details sync failed");
            jeVar.mo13632b(String.format(Locale.US, "[%d] %s", Integer.valueOf(i2), account2.name));
            jeVar.f22254f = activity;
            sex.m35104a(this.f74784a).mo25441a(1, jeVar.mo13629b());
        }
        almk a = almk.m61263a();
        Context context = this.f74784a;
        String str = account2.name;
        int b = anbj.m63921b(bundle);
        int b2 = m62733b(bundle);
        String a2 = amee.m62766a(bundle);
        int a3 = anbi.m63919a(exc);
        int f = this.f74785b.mo40702f(account2.name);
        long e = (long) this.f74785b.mo40700e(account2.name);
        if (((double) ancm.f76635f.nextFloat()) < cgbe.m144186o()) {
            ammr ammr = (ammr) amnu.f75540w.mo74144da();
            long j2 = e;
            almk.m61267a(ammr, context, str, bmxv, i, a2, b, b2, i2, j, z, z2, null, list);
            amig.m62939a();
            boolean booleanValue = ((Boolean) amhd.f74906a.mo41191a()).booleanValue();
            boolean booleanValue2 = ((Boolean) amhe.f74907a.mo41191a()).booleanValue();
            almm almm = new almm();
            ArrayList arrayList = new ArrayList();
            Context context2 = context;
            if (list2 != null) {
                int size = list.size();
                int i3 = 0;
                while (i3 < size) {
                    almm almm2 = (almm) list2.get(i3);
                    if (booleanValue) {
                        almm.f73776x += almm2.f73776x;
                        long j3 = almm2.f73777y;
                        almm.f73777y = 0;
                        long j4 = almm2.f73778z;
                        almm.f73778z = 0;
                        long j5 = almm2.f73725A;
                        almm.f73725A = 0;
                        long j6 = almm2.f73726B;
                        almm.f73726B = 0;
                        long j7 = almm2.f73727C;
                        almm.f73727C = 0;
                        almm.f73728D += almm2.f73728D;
                        long j8 = almm2.f73729E;
                        almm.f73729E = 0;
                        long j9 = almm2.f73730F;
                        almm.f73730F = 0;
                        almm.f73732H += almm2.f73732H;
                        long j10 = almm2.f73733I;
                        almm.f73733I = 0;
                        long j11 = almm2.f73734J;
                        almm.f73734J = 0;
                        long j12 = almm2.f73735K;
                        almm.f73735K = 0;
                        long j13 = almm2.f73736L;
                        almm.f73736L = 0;
                        long j14 = almm2.f73737M;
                        almm.f73737M = 0;
                        almm.f73738N += almm2.f73738N;
                    }
                    if (booleanValue2) {
                        SparseIntArray sparseIntArray = almm2.f73773u;
                        SparseIntArray sparseIntArray2 = almm2.f73774v;
                        SparseArray sparseArray = almm2.f73772t;
                        bxvd da = amnp.f75526f.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amnp amnp = (amnp) da.f164949b;
                        amnp.f75529b = 1;
                        amnp.f75528a |= 1;
                        long j15 = (long) sparseIntArray.get(1);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amnp amnp2 = (amnp) da.f164949b;
                        amnp2.f75528a |= 2;
                        amnp2.f75530c = j15;
                        int i4 = sparseIntArray2.get(1);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amnp amnp3 = (amnp) da.f164949b;
                        amnp3.f75528a |= 4;
                        amnp3.f75531d = i4;
                        if (!TextUtils.isEmpty((CharSequence) sparseArray.get(1))) {
                            String str2 = (String) sparseArray.get(1);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amnp amnp4 = (amnp) da.f164949b;
                            str2.getClass();
                            amnp4.f75528a |= 8;
                            amnp4.f75532e = str2;
                        }
                        arrayList.add((amnp) da.mo74062i());
                    }
                    i3++;
                    list2 = list;
                }
            }
            if (booleanValue) {
                ammr.mo41218a(almk.m61270c(2, j));
                ammr.mo41218a(almk.m61270c(3, almm.f73776x));
                ammr.mo41218a(almk.m61270c(4, 0));
                ammr.mo41218a(almk.m61270c(5, 0));
                ammr.mo41218a(almk.m61270c(6, 0));
                ammr.mo41218a(almk.m61270c(7, 0));
                ammr.mo41218a(almk.m61270c(8, 0));
                ammr.mo41218a(almk.m61270c(9, almm.f73728D));
                ammr.mo41218a(almk.m61270c(10, 0));
                ammr.mo41218a(almk.m61270c(11, 0));
                ammr.mo41217a(almk.m61271d(2, almm.f73732H));
                ammr.mo41217a(almk.m61271d(3, 0));
                ammr.mo41217a(almk.m61271d(4, 0));
                ammr.mo41217a(almk.m61271d(5, 0));
                ammr.mo41217a(almk.m61271d(6, 0));
                ammr.mo41217a(almk.m61271d(7, 0));
                ammr.mo41217a(almk.m61271d(8, almm.f73738N));
            }
            if (booleanValue2) {
                if (ammr.f164950c) {
                    ammr.mo74035c();
                    ammr.f164950c = false;
                }
                amnu amnu = (amnu) ammr.f164949b;
                if (!amnu.f75563v.mo73666a()) {
                    amnu.f75563v = bxvk.m124021a(amnu.f75563v);
                }
                bxsy.m123078a(arrayList, amnu.f75563v);
            }
            ammr ammr2 = ammr;
            String str3 = str;
            Context context3 = context2;
            almk almk = a;
            almk.m61266a(ammr, i2, a3, exc, f, 0, j2, null);
            amig.m62939a();
            if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83343bT()).booleanValue() && (exc2 = exc) != null) {
                andd a4 = ande.f76660a.mo41719a(context3);
                amig.m62939a();
                a4.mo41718a(exc2, Double.valueOf(cgbe.f186279a.mo6606a().mo83344bU()).doubleValue());
            }
            bxvd da2 = amoh.f75593x.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            amoh amoh = (amoh) da2.f164949b;
            amnu amnu2 = (amnu) ammr2.mo74062i();
            amnu2.getClass();
            amoh.f75598d = amnu2;
            amoh.f75595a |= 4;
            boolean c2 = soz.m35800c(context3);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            amoh amoh2 = (amoh) da2.f164949b;
            int i5 = amoh2.f75595a | 8;
            amoh2.f75595a = i5;
            amoh2.f75599e = c2;
            amoh2.f75600f = 1;
            amoh2.f75595a = i5 | 32;
            almk.mo40520a(context3, da2);
            alml.m61288a(str3, da2);
        }
    }

    /* renamed from: a */
    public final void mo41138a(Account account, String str) {
        mo41139a(account != null ? account.name : null, str);
    }

    /* renamed from: a */
    public final void mo41139a(String str, String str2) {
        aluj.m61899a(this.f74784a, "PeopleSync", str, str2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amea.a(boolean, boolean, boolean):android.os.Bundle
     arg types: [int, int, boolean]
     candidates:
      amea.a(android.accounts.Account, java.lang.String, int):void
      amea.a(android.accounts.Account, java.lang.String, android.os.Bundle):void
      amea.a(android.accounts.Account, java.lang.String, boolean):void
      amea.a(java.lang.String, java.lang.String, long):boolean
      amea.a(boolean, boolean, boolean):android.os.Bundle */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo41140a(boolean z) {
        synchronized (this.f74787d) {
            if (this.f74785b.f74200a.getBoolean("is_first_sync", true)) {
                mo41139a((String) null, "First sync");
                bnrd a = this.f74786c.mo41680d(this.f74784a).iterator();
                while (a.hasNext()) {
                    Account account = (Account) a.next();
                    m62727a(account, "com.google.android.gms.people", 1);
                    boolean b = m62735b(account, "com.android.contacts");
                    m62729a(account, "com.google.android.gms.people", b);
                    if (b) {
                        mo41136a(account);
                    }
                }
                this.f74785b.mo40677a();
                if (z) {
                    aluj.m61904b(this.f74784a, "PeopleSync", "requestAllFullSyncForContainerUpgrade");
                    bnrd a2 = this.f74786c.mo41680d(this.f74784a).iterator();
                    while (a2.hasNext()) {
                        m62728a((Account) a2.next(), "com.google.android.gms.people", m62726a(false, false, cgay.m144129b()));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo41141a(String str) {
        alto b = altq.m61806a(this.f74784a).mo40763b();
        if (b != null) {
            if (b.mo40743a("SELECT count(1) FROM owners WHERE account_name=? AND page_gaia_id IS NOT NULL", new String[]{str}, 0) <= cgbe.f186279a.mo6606a().mo83414cl()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo41142a(String str, String str2, long j) {
        long d = mo41150d(str, str2);
        if (d == -1) {
            Log.w("PeopleSync", "requestSync: Owner doesn't exist");
            return true;
        } else if (d < this.f74788e.mo20505a() - (j * 1000)) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amea.a(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean):boolean
     arg types: [java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, int, int, boolean, java.lang.String, int]
     candidates:
      amea.a(android.accounts.Account, int, android.os.Bundle, int, java.lang.Exception, java.util.List, long, boolean, boolean, bmxv):void
      amea.a(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean):boolean */
    /* renamed from: a */
    public final boolean mo41143a(String str, String str2, long j, String str3, String str4, boolean z, String str5) {
        return m62732a(str, str2, Math.max(j, cgbe.f186279a.mo6606a().mo83316at()), str3, str4, false, false, z, str5, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amea.a(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean):boolean
     arg types: [java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, int, boolean, java.lang.String, int]
     candidates:
      amea.a(android.accounts.Account, int, android.os.Bundle, int, java.lang.Exception, java.util.List, long, boolean, boolean, bmxv):void
      amea.a(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean):boolean */
    /* renamed from: a */
    public final boolean mo41144a(String str, String str2, String str3, String str4, boolean z, String str5) {
        return m62732a(str, str2, 0L, str3, str4, true, true, z, str5, true);
    }
}
